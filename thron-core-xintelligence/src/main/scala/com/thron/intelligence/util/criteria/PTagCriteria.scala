package com.thron.intelligence.util.criteria

import com.thron.intelligence.services.model.tag.MITagDefinitionDetail
import scala.collection.JavaConversions._
import scala.util._


object TagCriteria extends TagCriteria {
  type ClassificationId = String
  type TagId = String
  type Tag = (ClassificationId, TagId)

  trait Operation
  object AND extends Operation
  object OR extends Operation

  trait TagCriteriaLike[T] {
    def tags(t: T): List[Tag]
    def operation(t: T): Operation
    def sourceType(t: T): List[String]
    def copyWithTag(t: T, in: List[Tag]): T
  }
}

trait TagCriteria {
  import TagCriteria._

  protected def leaf(in: List[MITagDefinitionDetail]): List[MITagDefinitionDetail] = {
    def inner(rest: List[MITagDefinitionDetail], smallest: List[MITagDefinitionDetail]): List[MITagDefinitionDetail] = rest match {
      case Nil => smallest
      case h :: t if smallest.isEmpty => inner(t, h :: Nil)
      case h :: t =>
        val newSmallest = smallest.filterNot(x => h.ancestorIds.contains(x.id)) // remove smallest that are ancestor of h
      // add h if and only if it doesn't have any subtree element into smallest
      val isToAdd = newSmallest.forall(t => !t.ancestorIds.contains(h.id))
        if (isToAdd) inner(t, h :: newSmallest)
        else inner(t, newSmallest)
    }
    inner(in, Nil)
  }
  protected def root(in: List[MITagDefinitionDetail]): List[MITagDefinitionDetail] = {
    def inner(rest: List[MITagDefinitionDetail], biggest: List[MITagDefinitionDetail]): List[MITagDefinitionDetail] = rest match {
      case Nil => biggest
      case h :: t if biggest.isEmpty => inner(t, h :: Nil)
      case h :: t =>
        val newBiggest = biggest.filterNot(x => x.ancestorIds.contains(h.id)) // remove biggest that are in subtree of h
      // add h if and only if it doesn't have an ancestors into biggest
      val isToAdd = newBiggest.exists(t => !t.ancestorIds.contains(h.id))
        if (isToAdd) inner(t, h :: newBiggest)
        else inner(t, newBiggest)
    }
    inner(in, Nil)
  }

  /**
    * use this function to make an TagCriteriaLike valid for a query,
    * this means that some tag will be removed and some added (for example subtree of a tag is added)
    * and depending on operation we have to keep only root or only leaf and so on.
    * @param findTags a function that given a clientId, a [[ClassificationId]] and a list of [[TagId]] it returns a list of [[MITagDefinitionDetail]]
    * @return [[scala.util.Success]] with an MITagCriteriaOption ready to be converted to a query
    *        [[scala.util.Failure]] if this criteria will produce no results es: an AND with an tag that doesn't exists
    */
  def resolveCriteria[T](clientId: String, in: T, findTags: (String, ClassificationId, List[TagId]) => List[MITagDefinitionDetail])(implicit _tc: TagCriteriaLike[T]): Try[T] = {
    val groupedByClassification = _tc.tags(in).groupBy(_._1)
    // we get a list that contains tags to use for search
    val tags = groupedByClassification.map { case (classification, ids) =>
      val res = findTags(clientId, classification, ids.map(_._2))
      val onlyIds = res.flatMap(_.allIds)
      _tc.operation(in) match {
        case AND if !ids.forall(x => onlyIds.contains(x._2)) => Failure(new IllegalArgumentException("one or more tag doesn't exists and in a AND operation this evolve in no results"))
        case AND => Try(classification -> this.leaf(res))
        case OR => Try(classification -> this.root(res))
      }
    }
    val (found, notFound) = tags.partition(_.isSuccess)
    def res = found.foldLeft(List[Tag]()){
      case (acc, Success((classification, ts))) =>
        acc ++ ts.flatMap(td => (classification, td.id) :: (td.subNodeIds ++ td.combinedSubNodeIds).map(classification -> _).toList)
      case (acc, _) => acc
    }

    if(res.isEmpty) Failure(new IllegalArgumentException("no tag was found this evolve in no results"))
    else if (found.nonEmpty && notFound.isEmpty) Success(_tc.copyWithTag(in, res))
    else Failure(new IllegalArgumentException("one or more tag doesn't exists and in a AND operation this evolve in no results"))
  }

}
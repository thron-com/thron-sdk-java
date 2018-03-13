package it.newvision.nvp.xcontents.conversions

import it.newvision.nvp.xcontents.model.{MAclInverseRule, MAclInverseRuleGeneric, MAclInverseRules}
import it.newvision.nvp.xcontents.services.model.acl.{MAclInverseRulesGeneric, MAclInverseRulesItem, MAclInverseRulesItem2, MAclInverseRulesValue}

import scala.collection.JavaConversions._

trait AclConversions {

  val aclInverseRuleGeneric2aclInverseRule: MAclInverseRuleGeneric => MAclInverseRule =
    x => new MAclInverseRule().withapplyToSpreadTargets(x.applyToSpreadTargets).withenabled(x.enabled).withrule(x.rule).withmetadata(x.metadata)
  val aclInverseRulesGeneric2aclInverseRules: MAclInverseRulesGeneric => MAclInverseRules =
    x => new MAclInverseRules().withrules(x.rules).withsourceObjClass(x.sourceObjClass).withsourceObjId(x.sourceObjId)
  // MAclInverseRulesValue <=> MAclInverseRulesGeneric
  val aclInverseRulesValue2aclInverseRulesGeneric: MAclInverseRulesValue => MAclInverseRulesGeneric =
  x => new MAclInverseRulesGeneric().withsourceObjId(x.sourceObjId).withsourceObjClass(x.sourceObjClass).withrules(Option(x.rules.toList).getOrElse(Nil).map(Option(_).map(aclInverseRuleGeneric2aclInverseRule).orNull))
  val aclInverseRulesGeneric2aclInverseRulesValue: MAclInverseRulesGeneric => MAclInverseRulesValue =
    x => new MAclInverseRulesValue().withsourceObjId(x.sourceObjId).withsourceObjClass(x.sourceObjClass).withrules(Option(x.rules.toList).getOrElse(Nil).map(Option(_).map(aclInverseRuleGeneric2aclInverseRule).orNull))
  // MAclInverseRulesItem2 <=> MAclInverseRulesItem
  val aclInverseRulesItem22aclInverseRulesItem: MAclInverseRulesItem2 => MAclInverseRulesItem =
  x => Option(x).map(x => new MAclInverseRulesItem().withtargetObjId(x.targetObjId).withtargetObjClass(x.targetObjClass).withacl(Option(x.acl).map(aclInverseRulesValue2aclInverseRulesGeneric).orNull)).orNull
  val aclInverseRulesItem2aclInverseRulesItem2: MAclInverseRulesItem => MAclInverseRulesItem2 =
    x => new MAclInverseRulesItem2().withtargetObjId(x.targetObjId).withtargetObjClass(x.targetObjClass).withacl(Option(x.acl).map(aclInverseRulesGeneric2aclInverseRulesValue).orNull)

  def copy(r: MAclInverseRuleGeneric): MAclInverseRule = aclInverseRuleGeneric2aclInverseRule(r)

  def copy(r: MAclInverseRulesItem2): MAclInverseRulesItem2 = aclInverseRulesItem2aclInverseRulesItem2(aclInverseRulesItem22aclInverseRulesItem(r))

  def copy(r: MAclInverseRulesValue): MAclInverseRulesValue = aclInverseRulesGeneric2aclInverseRulesValue(aclInverseRulesValue2aclInverseRulesGeneric(r))

  def copy(r: MAclInverseRulesGeneric): MAclInverseRules = aclInverseRulesGeneric2aclInverseRules(r)

  def areEqual(x: MAclInverseRule, y: MAclInverseRule, skipStatusField: Boolean = false, skipMetadata: Boolean = true) =
    x.rule == y.rule && x.status == y.status && x.applyToSpreadTargets == y.applyToSpreadTargets && x.enabled == y.enabled && (skipStatusField || (x.status == y.status) && (skipMetadata || x.metadata.forall(xm => y.metadata.exists(rm => xm.isEqual(rm)))))
  /**
    * Explodes a list of MAclInverseRulesValue creating a MAclInverseRulesGeneric foreach rule, thus conforming to db schema
    */
  def aclInverseRulesValueList2aclInverseRulesGenericExploded(rules: Iterable[MAclInverseRulesValue]) = {
    rules.map(aclInverseRulesValue2aclInverseRulesGeneric)
      .flatMap {rule => rule.rules.map {r =>
        new MAclInverseRulesGeneric withsourceObjId (rule.sourceObjId) withsourceObjClass (rule.sourceObjClass) withrules (Seq(r))
      }
      }
  }

  def transformsForContent(r: MAclInverseRuleGeneric): MAclInverseRule = copy(r).withapplyToSpreadTargets(false) // set applyToSpreadTargets to false, because into content we can put only this

  def transformsForContent(r: MAclInverseRulesGeneric): MAclInverseRules = copy(r).withrules(r.rules.map(transformsForContent(_)))

  def distinctAclInverseRules(r: List[MAclInverseRules]): List[MAclInverseRules] = r.foldLeft(List[MAclInverseRules]()){
    case (acc,acl) if acc.exists( c => c.rules.exists(r => acl.rules.exists( ar => areEqual(r,ar)))) => acc
    case (acc,acl) => acl :: acc
  }
}

object AclConversions extends AclConversions

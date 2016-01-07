package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Sintax: TargetObject <EAclRuleInverse> SourceObj
 * 
 * Example:
 * group1 READ_BY user1
 * user2 READ_BY user1
 * group1 SPREAD_TO user1
 */
@XmlRootElement(name="MAclObjectRuleInverse") 
@XmlType(name="MAclObjectRuleInverse")
//#SWG#@ApiModel(description = """Sintax: TargetObject <EAclRuleInverse> SourceObj
//#SWGNL#
//#SWGNL#Example: 
//#SWGNL#group1 READ_BY user1
//#SWGNL#user2 READ_BY user1
//#SWGNL#group1 SPREAD_TO user1""")
class MAclObjectRuleInverse extends Serializable {

	/**
	 * the identifier of the object where the ACL should be applied
	 */
	//#SWG#@ApiModelProperty(value = """the identifier of the object where the ACL should be applied""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):MAclObjectRuleInverse ={ 	this.targetObjId = p; 	this }

	/**
	 * the target class
	 */
	//#SWG#@ApiModelProperty(value = """the target class""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):MAclObjectRuleInverse ={ 	this.targetObjClass = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var sourceAcl: List[MAclRuleInverse] = new ArrayList[MAclRuleInverse]
	  def withsourceAcl(p:List[MAclRuleInverse]):MAclObjectRuleInverse ={ 	this.sourceAcl = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import collection.Set
		(Option(targetObjId), Option(targetObjClass), Option(sourceAcl)) match {
		 case (Some(_), Some(toc), Some(acl)) =>
					   toc match {
						 case MEObjClass.CONTENT =>
									   acl.forall{r =>
										 r.isValid && ((
													  (r.sourceObjClass == MEObjClass.USER && 
													   r.rulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY, MEAclRuleInverse.BELONGS_TO)).size == 0) ||
													  (r.sourceObjClass == MEObjClass.GROUP && 
													   r.rulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY)).size == 0) ||
													  (r.sourceObjClass == MEObjClass.CUSTOM && r.rulesInverse.nonEmpty && r.rulesInverse.forall(_ == MEAclRuleInverse.SEEN_BY))
										 )||(
													   (r.sourceObjClass == MEObjClass.USER &&
														r.disabledRulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY, MEAclRuleInverse.BELONGS_TO)).size == 0) ||
													   (r.sourceObjClass == MEObjClass.GROUP &&
														r.disabledRulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY)).size == 0) ||
													   (r.sourceObjClass == MEObjClass.CUSTOM && r.disabledRulesInverse.nonEmpty && r.disabledRulesInverse.forall(_ == MEAclRuleInverse.SEEN_BY))
										 ))
									   }
						 case MEObjClass.CATEGORY =>
									   acl.forall{r =>
										 r.isValid && (
													  (r.sourceObjClass == MEObjClass.USER && 
													   r.rulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY, MEAclRuleInverse.BELONGS_TO)).size == 0) ||
													  ((r.sourceObjClass == MEObjClass.GROUP || r.sourceObjClass == MEObjClass.APP) && 
													   r.rulesInverse.toSet.diff(Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY)).size == 0) ||
													  (r.sourceObjClass == MEObjClass.CUSTOM && r.rulesInverse.nonEmpty && r.rulesInverse.forall(_ == MEAclRuleInverse.SEEN_BY)) ||
													  (r.sourceObjClass == MEObjClass.CONTENT && r.rulesInverse.nonEmpty && r.rulesInverse.forall(_ == MEAclRuleInverse.SPREAD_TO))
										 ) && r.disabledRulesInverse.isEmpty
									   }
						 case _ => false
					   }
		 case _ => false
		}
		
	
	}

}
package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverseRulesItem2") 
@XmlType(name="MAclInverseRulesItem2")
//#SWG#@ApiModel(description = """""")
class MAclInverseRulesItem2 extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var acl: MAclInverseRulesValue =_
	def withacl(p:MAclInverseRulesValue):this.type ={ 	this.acl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):this.type ={ 	this.targetObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):this.type ={ 	this.targetObjId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import it.newvision.nvp.xcontents.model.MEAclRuleInverse
		import org.apache.commons.lang.StringUtils
		import collection.JavaConversions._
		import scala.util.Try
		import collection.Set
		implicit def tuple2List[T](t: (T,T)): Seq[T] = t match { case (l,r) => Seq(l,r) }
		def getEnumRules(r: Iterable[it.newvision.nvp.xcontents.model.MAclInverseRuleGeneric]) = r.map(_.rule).toSet
		val fullEnumRules = Set(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY)
		// Separate disabled from enabled rules
		val (ruleEnums :: disabledRuleEnums :: Nil) = acl.rules.partition(_.enabled).map(getEnumRules)
	
		def isUUID(s: String) = {
			val trimmedS = StringUtils.trim(s)
			Try(UUID.fromString(trimmedS).toString == trimmedS).getOrElse(false)
		}
	
		(Option(targetObjId), Option(targetObjClass), Option(acl)) match {
		  case (Some(_), Some(MEObjClass.CONTENT), Some(a)) if Option(a.rules).nonEmpty =>
			def validateRule(sourceObjClass: MEObjClass, sourceObjId: String)(ruleEnums: Set[MEAclRuleInverse]) = sourceObjClass match {
				case MEObjClass.USER => ruleEnums.diff(fullEnumRules + MEAclRuleInverse.BELONGS_TO).isEmpty
				case MEObjClass.GROUP | MEObjClass.APP => ruleEnums.diff(fullEnumRules).isEmpty
				case MEObjClass.CUSTOM => ruleEnums.diff(Set(MEAclRuleInverse.SEEN_BY)).isEmpty && !isUUID(sourceObjId)
			}
			// applyToSpreadTargets must be false on contents
			acl.isValid() && acl.rules.forall(r => r.isValid && !r.applyToSpreadTargets
				&& (validateRule(acl.sourceObjClass, acl.sourceObjId)(ruleEnums) || validateRule(acl.sourceObjClass, acl.sourceObjId)(disabledRuleEnums)))
		  case (Some(_), Some(MEObjClass.CATEGORY), Some(a)) if Option(a.rules).nonEmpty && disabledRuleEnums.isEmpty =>
			def validateRule(sourceObjClass: MEObjClass, sourceObjId: String)(ruleEnums: Set[MEAclRuleInverse]) = sourceObjClass match {
				case MEObjClass.USER => ruleEnums.diff(fullEnumRules + MEAclRuleInverse.BELONGS_TO).isEmpty
				case MEObjClass.GROUP | MEObjClass.APP => ruleEnums.diff(fullEnumRules).isEmpty
				case MEObjClass.CUSTOM => ruleEnums.diff(Set(MEAclRuleInverse.SEEN_BY)).isEmpty && !isUUID(sourceObjId)
				case MEObjClass.CONTENT => ruleEnums.diff(Set(MEAclRuleInverse.SPREAD_TO)).isEmpty
			}
			acl.isValid() && acl.rules.forall(_.isValid && validateRule(acl.sourceObjClass, acl.sourceObjId)(ruleEnums))
		  case _ => false
		}
	}

}
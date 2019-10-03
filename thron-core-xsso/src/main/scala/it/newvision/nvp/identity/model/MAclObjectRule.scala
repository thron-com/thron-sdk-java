package it.newvision.nvp.identity.model
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
 * Used by 4ME to set the access policy of the content. The information about the
 * access control list are returned by the JContentAcl service
 * 
 * Sintax: SourceObj <EAclRule> TargetObject
 * 
 * Example:
 * user1 READ group1
 * user1 READ user2
 * user1 INHERIT group1
 */
@XmlRootElement(name="MAclObjectRule") 
@XmlType(name="MAclObjectRule")
//#SWG#@ApiModel(description = """Used by 4ME to set the access policy of the content. The information about the access control list are returned by the JContentAcl service
//#SWGNL#
//#SWGNL#Sintax: SourceObj <EAclRule> TargetObject
//#SWGNL#
//#SWGNL#Example: 
//#SWGNL#user1 READ group1
//#SWGNL#user1 READ user2
//#SWGNL#user1 INHERIT group1""")
class MAclObjectRule extends Serializable {

	/**
	 * the subject class
	 */
	//#SWG#@ApiModelProperty(value = """the subject class""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	/**
	 * the identifier of the object where the ACL should be applied
	 */
	//#SWG#@ApiModelProperty(value = """the identifier of the object where the ACL should be applied""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	/**
	 * the acl rules defined for each target object
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """the acl rules defined for each target object""")
	var targetAcl: List[MAclRule] = new ArrayList[MAclRule]
	  def withtargetAcl(p:List[MAclRule]):this.type ={ 	this.targetAcl = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import collection.Set
		import it.newvision.nvp.identity.model.MEAclRule
		(Option(sourceObjId), Option(sourceObjClass), Option(targetAcl)) match {
			case (Some(_), Some(soc), Some(acl)) =>
		        soc match {
		          case MEObjClass.USER =>
		            acl.forall{r =>
		              r.isValid && (
		                (r.targetObjClass == MEObjClass.USER && 
		                 r.rules.toSet.diff(Set(MEAclRule.SEE, MEAclRule.MODIFY)).size == 0) ||
		                (r.targetObjClass == MEObjClass.GROUP && 
		                 r.rules.toSet.diff(Set(MEAclRule.SEE, MEAclRule.MODIFY, MEAclRule.INHERIT_BY)).size == 0)
		              )
		            }
		          case MEObjClass.GROUP =>
		            acl.forall{r =>
		              r.isValid && (
		                ((r.targetObjClass == MEObjClass.GROUP || r.targetObjClass == MEObjClass.USER) && 
		                 r.rules.toSet.diff(Set(MEAclRule.SEE, MEAclRule.MODIFY)).size == 0) 
		              )
		            }
		          case _ =>
		            false
		        }
		    case _ => 
				false
		}
	
	
	}

}
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

}
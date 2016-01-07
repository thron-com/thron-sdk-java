package it.newvision.nvp.identity.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseAclVerify") 
@XmlType(name="MResponseAclVerify")
//#SWG#@ApiModel(description = """""")
class MResponseAclVerify extends MResponseAcl with Serializable  {

	/**
	 * the list of rules that meet the platform ACL
	 */
	//#SWG#@ApiModelProperty(value = """the list of rules that meet the platform ACL""")
	@BeanProperty 
	var allowedRules: List[MAclRuleItem] = new ArrayList[MAclRuleItem]
	def withallowedRules(p:List[MAclRuleItem]):MResponseAclVerify ={ 	this.allowedRules = p; 	this }

	/**
	 * the list of rules that do not meet the platform ACL
	 */
	//#SWG#@ApiModelProperty(value = """the list of rules that do not meet the platform ACL""")
	@BeanProperty 
	var deniedRules: List[MAclRuleItem] = new ArrayList[MAclRuleItem]
	def withdeniedRules(p:List[MAclRuleItem]):MResponseAclVerify ={ 	this.deniedRules = p; 	this }

}
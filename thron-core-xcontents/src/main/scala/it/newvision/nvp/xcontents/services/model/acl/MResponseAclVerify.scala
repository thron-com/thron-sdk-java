package it.newvision.nvp.xcontents.services.model.acl
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
	var allowedRules: List[MAclRuleInverseItem] = new ArrayList[MAclRuleInverseItem]
	def withallowedRules(p:List[MAclRuleInverseItem]):MResponseAclVerify ={ 	this.allowedRules = p; 	this }

	/**
	 * the list of rules that do not meet the platform ACL
	 */
	//#SWG#@ApiModelProperty(value = """the list of rules that do not meet the platform ACL""")
	@BeanProperty 
	var deniedRules: List[MAclRuleInverseItem] = new ArrayList[MAclRuleInverseItem]
	def withdeniedRules(p:List[MAclRuleInverseItem]):MResponseAclVerify ={ 	this.deniedRules = p; 	this }

}
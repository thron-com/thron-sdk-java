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
@XmlRootElement(name="MResponseAclInverseVerify") 
@XmlType(name="MResponseAclInverseVerify")
//#SWG#@ApiModel(description = """""")
class MResponseAclInverseVerify extends MResponseAcl with Serializable  {

	/**
	 * the list of rules that meet the platform ACL
	 */
	//#SWG#@ApiModelProperty(value = """the list of rules that meet the platform ACL""")
	@BeanProperty 
	var allowed: List[MAclInverseRulesItem] = new ArrayList[MAclInverseRulesItem]
	def withallowed(p:List[MAclInverseRulesItem]):this.type ={ 	this.allowed = p; 	this }

	/**
	 * the list of rules that do not meet the platform ACL
	 */
	//#SWG#@ApiModelProperty(value = """the list of rules that do not meet the platform ACL""")
	@BeanProperty 
	var denied: List[MAclInverseRulesItem] = new ArrayList[MAclInverseRulesItem]
	def withdenied(p:List[MAclInverseRulesItem]):this.type ={ 	this.denied = p; 	this }

	/**
	 * the list of invalid rules
	 */
	//#SWG#@ApiModelProperty(value = """the list of invalid rules""")
	@BeanProperty 
	var inIssue: List[MAclInverseRulesItem] = new ArrayList[MAclInverseRulesItem]
	def withinIssue(p:List[MAclInverseRulesItem]):this.type ={ 	this.inIssue = p; 	this }

}
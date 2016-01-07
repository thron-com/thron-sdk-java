package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.acl.MAclRuleItems

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAcl.addAclRules
 */
@XmlRootElement(name="MAcladdAclRulesReq")
@XmlType(name="MAcladdAclRulesReq")
//#SWG#@ApiModel(description = "Request message for service JAcl.addAclRules")
class MAcladdAclRulesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAcladdAclRulesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rules: MAclRuleItems =_
	def withrules(p:MAclRuleItems):MAcladdAclRulesReq ={ 	this.rules = p; 	this }

}
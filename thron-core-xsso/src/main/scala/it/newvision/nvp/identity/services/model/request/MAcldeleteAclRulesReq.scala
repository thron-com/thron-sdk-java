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
 * Request message for service JAcl.deleteAclRules
 */
@XmlRootElement(name="MAcldeleteAclRulesReq")
@XmlType(name="MAcldeleteAclRulesReq")
//#SWG#@ApiModel(description = "Request message for service JAcl.deleteAclRules")
class MAcldeleteAclRulesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAcldeleteAclRulesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rules: MAclRuleItems =_
	def withrules(p:MAclRuleItems):MAcldeleteAclRulesReq ={ 	this.rules = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MAclRuleInverseItems

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAclInverse.deleteAclRules
 */
@XmlRootElement(name="MAclInversedeleteAclRulesReq")
@XmlType(name="MAclInversedeleteAclRulesReq")
//#SWG#@ApiModel(description = "Request message for service JAclInverse.deleteAclRules")
class MAclInversedeleteAclRulesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAclInversedeleteAclRulesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rules: MAclRuleInverseItems =_
	def withrules(p:MAclRuleInverseItems):MAclInversedeleteAclRulesReq ={ 	this.rules = p; 	this }

}
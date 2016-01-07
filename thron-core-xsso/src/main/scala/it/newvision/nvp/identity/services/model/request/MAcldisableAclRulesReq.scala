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
@XmlRootElement(name="MAcldisableAclRulesReq") 
 @XmlType(name="MAcldisableAclRulesReq")
class MAcldisableAclRulesReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAcldisableAclRulesReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var rules: MAclRuleItems =_
	def withrules(p:MAclRuleItems):MAcldisableAclRulesReq ={ 	this.rules = p; 	this }

}
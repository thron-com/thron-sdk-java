package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUserCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.updateCapabilitiesAndRoles
 */
@XmlRootElement(name="MVUserManagerupdateCapabilitiesAndRolesReq")
@XmlType(name="MVUserManagerupdateCapabilitiesAndRolesReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.updateCapabilitiesAndRoles")
class MVUserManagerupdateCapabilitiesAndRolesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerupdateCapabilitiesAndRolesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MVUserManagerupdateCapabilitiesAndRolesReq ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var userCapabilities: MUserCapability =_
	def withuserCapabilities(p:MUserCapability):MVUserManagerupdateCapabilitiesAndRolesReq ={ 	this.userCapabilities = p; 	this }

}
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
 * Request message for service JSysUserManager.updateCapabilitiesAndRoles
 */
@XmlRootElement(name="MSysUserManagerupdateCapabilitiesAndRolesReq")
@XmlType(name="MSysUserManagerupdateCapabilitiesAndRolesReq")
//#SWG#@ApiModel(description = "Request message for service JSysUserManager.updateCapabilitiesAndRoles")
class MSysUserManagerupdateCapabilitiesAndRolesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var userCapabilities: MUserCapability =_
	def withuserCapabilities(p:MUserCapability):this.type ={ 	this.userCapabilities = p; 	this }

}
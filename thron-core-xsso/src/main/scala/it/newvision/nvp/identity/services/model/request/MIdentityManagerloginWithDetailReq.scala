package it.newvision.nvp.identity.services.model.request
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
 * Request message for service JIdentityManager.loginWithDetail
 */
@XmlRootElement(name="MIdentityManagerloginWithDetailReq")
@XmlType(name="MIdentityManagerloginWithDetailReq")
//#SWG#@ApiModel(description = "Request message for service JIdentityManager.loginWithDetail")
class MIdentityManagerloginWithDetailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MIdentityManagerloginWithDetailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MIdentityManagerloginWithDetailReq ={ 	this.username = p; 	this }

	/**
	 * Optional if tmpTokenId is defined
	 */
	//#SWG#@ApiModelProperty(value = """Optional if tmpTokenId is defined""", required = true)
	@BeanProperty
	var password: String =_
	def withpassword(p:String):MIdentityManagerloginWithDetailReq ={ 	this.password = p; 	this }

	/**
	 * Optional.
	 * Temporary token used when the user requested a reset password
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#Temporary token used when the user requested a reset password""", required = true)
	@BeanProperty
	var tmpTokenId: String =_
	def withtmpTokenId(p:String):MIdentityManagerloginWithDetailReq ={ 	this.tmpTokenId = p; 	this }

	/**
	 * Optional.
	 * csv of group ids used to load the user Roles/capabilities only for the given
	 * groups. If empty the user session load all roles and capabilities of the user
	 * and of the linked userGroups
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#csv of group ids used to load the user Roles/capabilities only for the given groups. If empty the user session load all roles and capabilities of the user and of the linked userGroups""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):MIdentityManagerloginWithDetailReq ={ 	this.groupId = p; 	this }

}
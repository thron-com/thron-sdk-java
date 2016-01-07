package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MVUserParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.upgradeUser
 */
@XmlRootElement(name="MVUserManagerupgradeUserReq")
@XmlType(name="MVUserManagerupgradeUserReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.upgradeUser")
class MVUserManagerupgradeUserReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerupgradeUserReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MVUserManagerupgradeUserReq ={ 	this.username = p; 	this }

	/**
	 * Optional (the new password)
	 */
	//#SWG#@ApiModelProperty(value = """Optional (the new password)""", required = true)
	@BeanProperty
	var newPassword: String =_
	def withnewPassword(p:String):MVUserManagerupgradeUserReq ={ 	this.newPassword = p; 	this }

	/**
	 * Optional. the User information
	 */
	//#SWG#@ApiModelProperty(value = """Optional. the User information""", required = true)
	@BeanProperty
	var newUserDetail: MVUserDetail =_
	def withnewUserDetail(p:MVUserDetail):MVUserManagerupgradeUserReq ={ 	this.newUserDetail = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var newUserParams: MVUserParams =_
	def withnewUserParams(p:MVUserParams):MVUserManagerupgradeUserReq ={ 	this.newUserParams = p; 	this }

	/**
	 * Optional. Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Deprecated""", required = true)
	@BeanProperty
	var userQuota: Long =_
	def withuserQuota(p:Long):MVUserManagerupgradeUserReq ={ 	this.userQuota = p; 	this }

}
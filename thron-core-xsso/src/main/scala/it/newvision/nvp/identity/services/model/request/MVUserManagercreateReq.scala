package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MCredentialFull
import it.newvision.nvp.identity.model.MVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MVUserParams
import it.newvision.nvp.identity.model.MEUserType
import it.newvision.nvp.identity.model.MUserCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.create
 */
@XmlRootElement(name="MVUserManagercreateReq")
@XmlType(name="MVUserManagercreateReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.create")
class MVUserManagercreateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Optional. To be defined only for platform users.
	 * Check the username constraints in the MCredentialFull.username field
	 */
	//#SWG#@ApiModelProperty(value = """Optional. To be defined only for platform users.
	//#SWGNL#Check the username constraints in the MCredentialFull.username field""", required = true)
	@BeanProperty
	var newUser: MCredentialFull =_
	def withnewUser(p:MCredentialFull):this.type ={ 	this.newUser = p; 	this }

	/**
	 * Optional. user information
	 */
	//#SWG#@ApiModelProperty(value = """Optional. user information""", required = true)
	@BeanProperty
	var detail: MVUserDetail =_
	def withdetail(p:MVUserDetail):this.type ={ 	this.detail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var userParams: MVUserParams =_
	def withuserParams(p:MVUserParams):this.type ={ 	this.userParams = p; 	this }

	/**
	 * Required
	 */
	//#SWG#@ApiModelProperty(value = """Required""", required = true)
	@BeanProperty
	var userType: MEUserType =_
	def withuserType(p:MEUserType):this.type ={ 	this.userType = p; 	this }

	/**
	 * Optional. user roles 
	 */
	//#SWG#@ApiModelProperty(value = """Optional. user roles """, required = true)
	@BeanProperty
	var userCapabilities: MUserCapability =_
	def withuserCapabilities(p:MUserCapability):this.type ={ 	this.userCapabilities = p; 	this }

	/**
	 * ptional. the total amount of quota reserved to the user (in MB). If zero the
	 * user have no quota restrictions
	 */
	//#SWG#@ApiModelProperty(value = """ptional. the total amount of quota reserved to the user (in MB). If zero the user have no quota restrictions""", required = true)
	@BeanProperty
	var userQuota: Long =_
	def withuserQuota(p:Long):this.type ={ 	this.userQuota = p; 	this }

	/**
	 * Optional.
	 * Define the lock template id applied to the user.
	 * Locking templates are used to restrict the user to change some specific fields
	 * of the VUserDetail, like password, email address, user fullname or other
	 * details.
	 * The only allowed value is "DEFAULT".
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Define the lock template id applied to the user.
	//#SWGNL#Locking templates are used to restrict the user to change some specific fields of the VUserDetail, like password, email address, user fullname or other details.
	//#SWGNL#The only allowed value is "DEFAULT".""", required = true)
	@BeanProperty
	var userLockTemplate: String =_
	def withuserLockTemplate(p:String):this.type ={ 	this.userLockTemplate = p; 	this }

	/**
	 * if true the service send to the new user an email with the link to 1st access
	 * page.
	 * The new user can complete the profile setup and change his password.
	 * Defaullt is false
	 */
	//#SWG#@ApiModelProperty(value = """if true the service send to the new user an email with the link to 1st access page.
	//#SWGNL#The new user can complete the profile setup and change his password.
	//#SWGNL#Defaullt is false""", required = true)
	@BeanProperty
	var sendFirstAccessNotification: Boolean =_
	def withsendFirstAccessNotification(p:Boolean):this.type ={ 	this.sendFirstAccessNotification = p; 	this }

}
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
 * Request message for service JVUserManager.resetPassword
 */
@XmlRootElement(name="MVUserManagerresetPasswordReq")
@XmlType(name="MVUserManagerresetPasswordReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.resetPassword")
class MVUserManagerresetPasswordReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Optional. Whether or not service should skip sending email to the user. Default
	 * is false
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Whether or not service should skip sending email to the user. Default is false""", required = true)
	@BeanProperty
	var skipEmailSending: Boolean =_
	def withskipEmailSending(p:Boolean):this.type ={ 	this.skipEmailSending = p; 	this }

	/**
	 * Optional. Min 36 characters
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Min 36 characters""", required = true)
	@BeanProperty
	var tmpToken: String =_
	def withtmpToken(p:String):this.type ={ 	this.tmpToken = p; 	this }

	/**
	 * Optional. the username
	 */
	//#SWG#@ApiModelProperty(value = """Optional. the username""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}
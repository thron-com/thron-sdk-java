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
 * Request message for service JSysUserManager.changeUserStatus
 */
@XmlRootElement(name="MSysUserManagerchangeUserStatusReq")
@XmlType(name="MSysUserManagerchangeUserStatusReq")
//#SWG#@ApiModel(description = "Request message for service JSysUserManager.changeUserStatus")
class MSysUserManagerchangeUserStatusReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var expiryDate: Date =_
	def withexpiryDate(p:Date):this.type ={ 	this.expiryDate = p; 	this }

	/**
	 * true = the user is active
	 * false  the user is not active
	 */
	//#SWG#@ApiModelProperty(value = """true = the user is active
	//#SWGNL#false  the user is not active""", required = true)
	@BeanProperty
	var userActive: Boolean =_
	def withuserActive(p:Boolean):this.type ={ 	this.userActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}
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
 * Request message for service JUserManager.changeUserStatus
 */
@XmlRootElement(name="MUserManagerchangeUserStatusReq")
@XmlType(name="MUserManagerchangeUserStatusReq")
//#SWG#@ApiModel(description = "Request message for service JUserManager.changeUserStatus")
class MUserManagerchangeUserStatusReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUserManagerchangeUserStatusReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MUserManagerchangeUserStatusReq ={ 	this.username = p; 	this }

	/**
	 * true = the user is active
	 * false  the user is not active
	 */
	//#SWG#@ApiModelProperty(value = """true = the user is active
	//#SWGNL#false  the user is not active""", required = true)
	@BeanProperty
	var userActive: Boolean =_
	def withuserActive(p:Boolean):MUserManagerchangeUserStatusReq ={ 	this.userActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var expiryDate: Date =_
	def withexpiryDate(p:Date):MUserManagerchangeUserStatusReq ={ 	this.expiryDate = p; 	this }

}
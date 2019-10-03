package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUserCredential") 
@XmlType(name="MUserCredential")
//#SWG#@ApiModel(description = """""")
class MUserCredential extends MCredentialFull with Serializable  {

	/**
	 * Specify if the user is enable or not to use the platform
	 */
	//#SWG#@ApiModelProperty(value = """Specify if the user is enable or not to use the platform""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * external reference of contactId
	 */
	//#SWG#@ApiModelProperty(value = """external reference of contactId""")
	@BeanProperty 
	var contactId: String =_
	def withcontactId(p:String):this.type ={ 	this.contactId = p; 	this }

	/**
	 * user creation date
	 */
	//#SWG#@ApiModelProperty(value = """user creation date""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var detail: MUserDetail =_
	def withdetail(p:MUserDetail):this.type ={ 	this.detail = p; 	this }

	/**
	 * After the expiry date the user can not acess in the platform.
	 */
	//#SWG#@ApiModelProperty(value = """After the expiry date the user can not acess in the platform.""")
	@BeanProperty 
	var expiryDate: Date =_
	def withexpiryDate(p:Date):this.type ={ 	this.expiryDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userCapabilities: MUserCapability  = new MUserCapability()
	def withuserCapabilities(p:MUserCapability):this.type ={ 	this.userCapabilities = p; 	this }

}
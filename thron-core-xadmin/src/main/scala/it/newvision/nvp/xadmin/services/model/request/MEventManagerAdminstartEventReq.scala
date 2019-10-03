package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JEventManagerAdmin.startEvent
 */
@XmlRootElement(name="MEventManagerAdminstartEventReq")
@XmlType(name="MEventManagerAdminstartEventReq")
//#SWG#@ApiModel(description = "Request message for service JEventManagerAdmin.startEvent")
class MEventManagerAdminstartEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var awsAccountNumber: String =_
	def withawsAccountNumber(p:String):this.type ={ 	this.awsAccountNumber = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Syntax: formUrlEncoded, with ; as separator.
	 * 
	 * ec2InstanceType=...
	 * amiId=...
	 */
	//#SWG#@ApiModelProperty(value = """Syntax: formUrlEncoded, with ; as separator.
	//#SWGNL#
	//#SWGNL#ec2InstanceType=...
	//#SWGNL#amiId=...""", required = true)
	@BeanProperty
	var customParameters: String =_
	def withcustomParameters(p:String):this.type ={ 	this.customParameters = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * used to specify is the event should be recorded or not.
	 */
	//#SWG#@ApiModelProperty(value = """used to specify is the event should be recorded or not.""", required = true)
	@BeanProperty
	var recordEvent: Boolean =_
	def withrecordEvent(p:Boolean):this.type ={ 	this.recordEvent = p; 	this }

	/**
	 * where to deploy the live event instance
	 */
	//#SWG#@ApiModelProperty(value = """where to deploy the live event instance""", required = true)
	@BeanProperty
	var targetRegion: String =_
	def withtargetRegion(p:String):this.type ={ 	this.targetRegion = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var wowzaLicense: String =_
	def withwowzaLicense(p:String):this.type ={ 	this.wowzaLicense = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var wowzaProfile: String =_
	def withwowzaProfile(p:String):this.type ={ 	this.wowzaProfile = p; 	this }

}
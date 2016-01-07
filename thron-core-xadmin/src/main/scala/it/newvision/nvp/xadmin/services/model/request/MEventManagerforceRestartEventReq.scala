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
 * Request message for service JEventManager.forceRestartEvent
 */
@XmlRootElement(name="MEventManagerforceRestartEventReq")
@XmlType(name="MEventManagerforceRestartEventReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.forceRestartEvent")
class MEventManagerforceRestartEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MEventManagerforceRestartEventReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MEventManagerforceRestartEventReq ={ 	this.mediaContentId = p; 	this }

	/**
	 * used to specify is the event should be recorded or not.
	 */
	//#SWG#@ApiModelProperty(value = """used to specify is the event should be recorded or not.""", required = true)
	@BeanProperty
	var recordEvent: Boolean =_
	def withrecordEvent(p:Boolean):MEventManagerforceRestartEventReq ={ 	this.recordEvent = p; 	this }

	/**
	 * Optional. Used to specify a specific profile for the event
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to specify a specific profile for the event""", required = true)
	@BeanProperty
	var profileId: String =_
	def withprofileId(p:String):MEventManagerforceRestartEventReq ={ 	this.profileId = p; 	this }

}
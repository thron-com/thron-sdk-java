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
 * Request message for service JEventManager.startRecording
 */
@XmlRootElement(name="MEventManagerstartRecordingReq")
@XmlType(name="MEventManagerstartRecordingReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.startRecording")
class MEventManagerstartRecordingReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MEventManagerstartRecordingReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MEventManagerstartRecordingReq ={ 	this.mediaContentId = p; 	this }

}
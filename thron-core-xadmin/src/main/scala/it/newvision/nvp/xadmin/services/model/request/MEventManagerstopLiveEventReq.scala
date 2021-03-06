package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEEventAction

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JEventManager.stopLiveEvent
 */
@XmlRootElement(name="MEventManagerstopLiveEventReq")
@XmlType(name="MEventManagerstopLiveEventReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.stopLiveEvent")
class MEventManagerstopLiveEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * used to publish a new VIDEO Content fom the recorded files of the LIVE EVENT.
	 */
	//#SWG#@ApiModelProperty(value = """used to publish a new VIDEO Content fom the recorded files of the LIVE EVENT.
	//#SWGNL#""", required = true)
	@BeanProperty
	var postEventAction: MEEventAction =_
	def withpostEventAction(p:MEEventAction):this.type ={ 	this.postEventAction = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""", required = true)
	@BeanProperty
	var publishRecordedFiles: Boolean =_
	def withpublishRecordedFiles(p:Boolean):this.type ={ 	this.publishRecordedFiles = p; 	this }

	/**
	 * remove the instances linked to the event. Set to false only for debug or
	 * analysis
	 */
	//#SWG#@ApiModelProperty(value = """remove the instances linked to the event. Set to false only for debug or analysis""", required = true)
	@BeanProperty
	var removeInstances: Boolean =_
	def withremoveInstances(p:Boolean):this.type ={ 	this.removeInstances = p; 	this }

}
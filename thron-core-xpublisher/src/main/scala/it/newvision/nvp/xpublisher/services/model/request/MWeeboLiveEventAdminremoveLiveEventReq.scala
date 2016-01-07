package it.newvision.nvp.xpublisher.services.model.request
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
 * Request message for service JWeeboLiveEventAdmin.removeLiveEvent
 */
@XmlRootElement(name="MWeeboLiveEventAdminremoveLiveEventReq")
@XmlType(name="MWeeboLiveEventAdminremoveLiveEventReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboLiveEventAdmin.removeLiveEvent")
class MWeeboLiveEventAdminremoveLiveEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboLiveEventAdminremoveLiveEventReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboLiveEventAdminremoveLiveEventReq ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var discardRecordedFiles: Boolean =_
	def withdiscardRecordedFiles(p:Boolean):MWeeboLiveEventAdminremoveLiveEventReq ={ 	this.discardRecordedFiles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var removeInstances: Boolean =_
	def withremoveInstances(p:Boolean):MWeeboLiveEventAdminremoveLiveEventReq ={ 	this.removeInstances = p; 	this }

}
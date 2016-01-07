package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.eventmanager.MUpdateClientStreamsParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JEventManager.removeClientStreams
 */
@XmlRootElement(name="MEventManagerremoveClientStreamsReq")
@XmlType(name="MEventManagerremoveClientStreamsReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.removeClientStreams")
class MEventManagerremoveClientStreamsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MEventManagerremoveClientStreamsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MEventManagerremoveClientStreamsReq ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var eventParam: MUpdateClientStreamsParams =_
	def witheventParam(p:MUpdateClientStreamsParams):MEventManagerremoveClientStreamsReq ={ 	this.eventParam = p; 	this }

}
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
 * Request message for service JEventManager.addClientStreams
 */
@XmlRootElement(name="MEventManageraddClientStreamsReq")
@XmlType(name="MEventManageraddClientStreamsReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.addClientStreams")
class MEventManageraddClientStreamsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MEventManageraddClientStreamsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MEventManageraddClientStreamsReq ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var eventParam: MUpdateClientStreamsParams =_
	def witheventParam(p:MUpdateClientStreamsParams):MEventManageraddClientStreamsReq ={ 	this.eventParam = p; 	this }

}
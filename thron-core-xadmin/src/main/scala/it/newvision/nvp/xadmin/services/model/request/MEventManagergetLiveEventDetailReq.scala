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
 * Request message for service JEventManager.getLiveEventDetail
 */
@XmlRootElement(name="MEventManagergetLiveEventDetailReq")
@XmlType(name="MEventManagergetLiveEventDetailReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.getLiveEventDetail")
class MEventManagergetLiveEventDetailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MEventManagergetLiveEventDetailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MEventManagergetLiveEventDetailReq ={ 	this.mediaContentId = p; 	this }

}
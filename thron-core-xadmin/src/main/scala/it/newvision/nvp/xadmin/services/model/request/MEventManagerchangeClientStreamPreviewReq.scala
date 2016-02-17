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
 * Request message for service JEventManager.changeClientStreamPreview
 */
@XmlRootElement(name="MEventManagerchangeClientStreamPreviewReq")
@XmlType(name="MEventManagerchangeClientStreamPreviewReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.changeClientStreamPreview")
class MEventManagerchangeClientStreamPreviewReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * clientStreamInPreview can only contain [0-9a-zA-Z-_] characters
	 * Used to specify the name of the clientStream to push in preview. It is
	 * possibile to specify a clientStreamInPreview not present among the
	 * clientStreams of the event, so when a clientStream with the same name is added
	 * to the event will be published automatically.
	 */
	//#SWG#@ApiModelProperty(value = """clientStreamInPreview can only contain [0-9a-zA-Z-_] characters
	//#SWGNL#Used to specify the name of the clientStream to push in preview. It is possibile to specify a clientStreamInPreview not present among the clientStreams of the event, so when a clientStream with the same name is added to the event will be published automatically.""", required = true)
	@BeanProperty
	var clientStreamInPreview: String =_
	def withclientStreamInPreview(p:String):this.type ={ 	this.clientStreamInPreview = p; 	this }

}
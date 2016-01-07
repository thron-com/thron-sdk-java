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
@XmlRootElement(name="MPublishingProcessremoveThumbnailsFromChannelReq") 
 @XmlType(name="MPublishingProcessremoveThumbnailsFromChannelReq")
class MPublishingProcessremoveThumbnailsFromChannelReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MPublishingProcessremoveThumbnailsFromChannelReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):MPublishingProcessremoveThumbnailsFromChannelReq ={ 	this.mediaContentId = p; 	this }

	@BeanProperty 
	var channel: String =_
	def withchannel(p:String):MPublishingProcessremoveThumbnailsFromChannelReq ={ 	this.channel = p; 	this }

}
package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MThumbnailParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishingProcessreplaceThumbnailToChannelReq") 
 @XmlType(name="MPublishingProcessreplaceThumbnailToChannelReq")
class MPublishingProcessreplaceThumbnailToChannelReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MPublishingProcessreplaceThumbnailToChannelReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var params: MThumbnailParams =_
	def withparams(p:MThumbnailParams):MPublishingProcessreplaceThumbnailToChannelReq ={ 	this.params = p; 	this }

}
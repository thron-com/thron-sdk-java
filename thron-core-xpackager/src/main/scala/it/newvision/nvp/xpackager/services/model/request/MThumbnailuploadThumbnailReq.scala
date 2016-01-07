package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.MSource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JThumbnail.uploadThumbnail
 */
@XmlRootElement(name="MThumbnailuploadThumbnailReq")
@XmlType(name="MThumbnailuploadThumbnailReq")
//#SWG#@ApiModel(description = "Request message for service JThumbnail.uploadThumbnail")
class MThumbnailuploadThumbnailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MThumbnailuploadThumbnailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var buffer: MSource =_
	def withbuffer(p:MSource):MThumbnailuploadThumbnailReq ={ 	this.buffer = p; 	this }

}
package it.newvision.nvp.xpackager.services.model.request
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
 * Request message for service JThumbnail.deleteThumbnail
 */
@XmlRootElement(name="MThumbnaildeleteThumbnailReq")
@XmlType(name="MThumbnaildeleteThumbnailReq")
//#SWG#@ApiModel(description = "Request message for service JThumbnail.deleteThumbnail")
class MThumbnaildeleteThumbnailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MThumbnaildeleteThumbnailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var thumbnailId: String =_
	def withthumbnailId(p:String):MThumbnaildeleteThumbnailReq ={ 	this.thumbnailId = p; 	this }

}
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
/**
 * Request message for service JPublishingProcess.
 * replaceThumbnailInPublishedContent
 */
@XmlRootElement(name="MPublishingProcessreplaceThumbnailInPublishedContentReq")
@XmlType(name="MPublishingProcessreplaceThumbnailInPublishedContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.replaceThumbnailInPublishedContent")
class MPublishingProcessreplaceThumbnailInPublishedContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var params: MThumbnailParams =_
	def withparams(p:MThumbnailParams):this.type ={ 	this.params = p; 	this }

}
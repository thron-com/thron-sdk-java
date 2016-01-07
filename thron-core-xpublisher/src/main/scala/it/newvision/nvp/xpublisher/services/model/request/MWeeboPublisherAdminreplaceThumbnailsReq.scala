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
 * Request message for service JWeeboPublisherAdmin.replaceThumbnails
 */
@XmlRootElement(name="MWeeboPublisherAdminreplaceThumbnailsReq")
@XmlType(name="MWeeboPublisherAdminreplaceThumbnailsReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.replaceThumbnails")
class MWeeboPublisherAdminreplaceThumbnailsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminreplaceThumbnailsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):MWeeboPublisherAdminreplaceThumbnailsReq ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packageId: String =_
	def withpackageId(p:String):MWeeboPublisherAdminreplaceThumbnailsReq ={ 	this.packageId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminreplaceThumbnailsReq ={ 	this.pContentId = p; 	this }

}
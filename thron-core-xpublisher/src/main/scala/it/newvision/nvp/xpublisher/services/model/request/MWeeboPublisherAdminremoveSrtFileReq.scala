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
 * Request message for service JWeeboPublisherAdmin.removeSrtFile
 */
@XmlRootElement(name="MWeeboPublisherAdminremoveSrtFileReq")
@XmlType(name="MWeeboPublisherAdminremoveSrtFileReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.removeSrtFile")
class MWeeboPublisherAdminremoveSrtFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminremoveSrtFileReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminremoveSrtFileReq ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MWeeboPublisherAdminremoveSrtFileReq ={ 	this.locale = p; 	this }

}
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
 * Request message for service JWeeboPublisherAdmin.removeContent
 */
@XmlRootElement(name="MWeeboPublisherAdminremoveContentReq")
@XmlType(name="MWeeboPublisherAdminremoveContentReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.removeContent")
class MWeeboPublisherAdminremoveContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminremoveContentReq ={ 	this.clientId = p; 	this }

	/**
	 * Required only the 1st time when the content is published in the platform. The
	 * contenttype is never updated when new channels are published
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminremoveContentReq ={ 	this.pContentId = p; 	this }

}
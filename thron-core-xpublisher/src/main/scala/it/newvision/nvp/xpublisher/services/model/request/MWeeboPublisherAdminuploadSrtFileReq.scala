package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.MSource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisherAdmin.uploadSrtFile
 */
@XmlRootElement(name="MWeeboPublisherAdminuploadSrtFileReq")
@XmlType(name="MWeeboPublisherAdminuploadSrtFileReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.uploadSrtFile")
class MWeeboPublisherAdminuploadSrtFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):this.type ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var buffer: MSource =_
	def withbuffer(p:MSource):this.type ={ 	this.buffer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

}
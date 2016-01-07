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
 * Request message for service JWeeboPublisherAdmin.getSrtFiles
 */
@XmlRootElement(name="MWeeboPublisherAdmingetSrtFilesReq")
@XmlType(name="MWeeboPublisherAdmingetSrtFilesReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.getSrtFiles")
class MWeeboPublisherAdmingetSrtFilesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdmingetSrtFilesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdmingetSrtFilesReq ={ 	this.pContentId = p; 	this }

}
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
 * Request message for service JWeeboPublisherAdmin.changePlannedDate
 */
@XmlRootElement(name="MWeeboPublisherAdminchangePlannedDateReq")
@XmlType(name="MWeeboPublisherAdminchangePlannedDateReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.changePlannedDate")
class MWeeboPublisherAdminchangePlannedDateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminchangePlannedDateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminchangePlannedDateReq ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channelType: String =_
	def withchannelType(p:String):MWeeboPublisherAdminchangePlannedDateReq ={ 	this.channelType = p; 	this }

	/**
	 * planned publication date
	 */
	//#SWG#@ApiModelProperty(value = """planned publication date""", required = true)
	@BeanProperty
	var plannedPublication: Date =_
	def withplannedPublication(p:Date):MWeeboPublisherAdminchangePlannedDateReq ={ 	this.plannedPublication = p; 	this }

}
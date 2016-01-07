package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MChannel

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisherAdmin.publish
 */
@XmlRootElement(name="MWeeboPublisherAdminpublishReq")
@XmlType(name="MWeeboPublisherAdminpublishReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.publish")
class MWeeboPublisherAdminpublishReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublisherAdminpublishReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):MWeeboPublisherAdminpublishReq ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packageId: String =_
	def withpackageId(p:String):MWeeboPublisherAdminpublishReq ={ 	this.packageId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboPublisherAdminpublishReq ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channel: MChannel =_
	def withchannel(p:MChannel):MWeeboPublisherAdminpublishReq ={ 	this.channel = p; 	this }

	/**
	 * planned publication date
	 */
	//#SWG#@ApiModelProperty(value = """planned publication date""", required = true)
	@BeanProperty
	var plannedPublication: Date =_
	def withplannedPublication(p:Date):MWeeboPublisherAdminpublishReq ={ 	this.plannedPublication = p; 	this }

}
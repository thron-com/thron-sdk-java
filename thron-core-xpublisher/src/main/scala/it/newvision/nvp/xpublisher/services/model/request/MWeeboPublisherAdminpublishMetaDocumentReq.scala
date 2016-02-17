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
 * Request message for service JWeeboPublisherAdmin.publishMetaDocument
 */
@XmlRootElement(name="MWeeboPublisherAdminpublishMetaDocumentReq")
@XmlType(name="MWeeboPublisherAdminpublishMetaDocumentReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.publishMetaDocument")
class MWeeboPublisherAdminpublishMetaDocumentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * optional. Used to publish thumbnail linked to the playlist.
	 */
	//#SWG#@ApiModelProperty(value = """optional. Used to publish thumbnail linked to the playlist.""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packageId: String =_
	def withpackageId(p:String):this.type ={ 	this.packageId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):this.type ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channel: MChannel =_
	def withchannel(p:MChannel):this.type ={ 	this.channel = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var plannedPublication: Date =_
	def withplannedPublication(p:Date):this.type ={ 	this.plannedPublication = p; 	this }

}
package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MEContentType
import it.newvision.nvp.xpublisher.model.MRestrictionProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisherAdmin.createNewContent
 */
@XmlRootElement(name="MWeeboPublisherAdmincreateNewContentReq")
@XmlType(name="MWeeboPublisherAdmincreateNewContentReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.createNewContent")
class MWeeboPublisherAdmincreateNewContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Required only the first time when the content is published in the platform. The
	 * content type is never updated when new channels are published
	 */
	//#SWG#@ApiModelProperty(value = """Required only the first time when the content is published in the platform. The content type is never updated when new channels are published""", required = true)
	@BeanProperty
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):this.type ={ 	this.properties = p; 	this }

}
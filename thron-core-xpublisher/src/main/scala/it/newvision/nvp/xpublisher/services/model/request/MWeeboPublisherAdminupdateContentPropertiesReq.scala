package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MRestrictionProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisherAdmin.updateContentProperties
 */
@XmlRootElement(name="MWeeboPublisherAdminupdateContentPropertiesReq")
@XmlType(name="MWeeboPublisherAdminupdateContentPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.updateContentProperties")
class MWeeboPublisherAdminupdateContentPropertiesReq extends Serializable {

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
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):this.type ={ 	this.properties = p; 	this }

	/**
	 * The content version to update.
	 * Optional. Default is 0
	 * Change the content version only when content changed the source file and has
	 * been republished.
	 */
	//#SWG#@ApiModelProperty(value = """The content version to update.
	//#SWGNL#Optional. Default is 0
	//#SWGNL#Change the content version only when content changed the source file and has been republished.""", required = true)
	@BeanProperty
	var version: Integer =_
	def withversion(p:Integer):this.type ={ 	this.version = p; 	this }

}
package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MWowzaEvent
import it.newvision.nvp.xpublisher.model.MRestrictionProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboLiveEventAdmin.updateLiveEvent
 */
@XmlRootElement(name="MWeeboLiveEventAdminupdateLiveEventReq")
@XmlType(name="MWeeboLiveEventAdminupdateLiveEventReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboLiveEventAdmin.updateLiveEvent")
class MWeeboLiveEventAdminupdateLiveEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboLiveEventAdminupdateLiveEventReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId")
	var pContentId: String =_
	def withpContentId(p:String):MWeeboLiveEventAdminupdateLiveEventReq ={ 	this.pContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var liveProperties: MWowzaEvent =_
	def withliveProperties(p:MWowzaEvent):MWeeboLiveEventAdminupdateLiveEventReq ={ 	this.liveProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):MWeeboLiveEventAdminupdateLiveEventReq ={ 	this.properties = p; 	this }

}
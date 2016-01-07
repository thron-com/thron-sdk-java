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
 * Request message for service JWeeboLiveEventAdmin.createNewLiveEvent
 */
@XmlRootElement(name="MWeeboLiveEventAdmincreateNewLiveEventReq")
@XmlType(name="MWeeboLiveEventAdmincreateNewLiveEventReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboLiveEventAdmin.createNewLiveEvent")
class MWeeboLiveEventAdmincreateNewLiveEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboLiveEventAdmincreateNewLiveEventReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var liveProperties: MWowzaEvent =_
	def withliveProperties(p:MWowzaEvent):MWeeboLiveEventAdmincreateNewLiveEventReq ={ 	this.liveProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):MWeeboLiveEventAdmincreateNewLiveEventReq ={ 	this.properties = p; 	this }

}
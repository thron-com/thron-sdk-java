package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MHostnameDetails

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboLiveEvent.updatePublicHostnameEntries
 */
@XmlRootElement(name="MWeeboLiveEventupdatePublicHostnameEntriesReq")
@XmlType(name="MWeeboLiveEventupdatePublicHostnameEntriesReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboLiveEvent.updatePublicHostnameEntries")
class MWeeboLiveEventupdatePublicHostnameEntriesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboLiveEventupdatePublicHostnameEntriesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pcontentId: String =_
	def withpcontentId(p:String):MWeeboLiveEventupdatePublicHostnameEntriesReq ={ 	this.pcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var hdetails: MHostnameDetails =_
	def withhdetails(p:MHostnameDetails):MWeeboLiveEventupdatePublicHostnameEntriesReq ={ 	this.hdetails = p; 	this }

}
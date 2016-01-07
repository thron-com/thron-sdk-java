package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishLiveEventParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishLiveEvent
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishLiveEventReq")
@XmlType(name="MPublishInWeeboExpresspublishLiveEventReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishLiveEvent")
class MPublishInWeeboExpresspublishLiveEventReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishInWeeboExpresspublishLiveEventReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishLiveEventParams =_
	def withparam(p:MPublishLiveEventParams):MPublishInWeeboExpresspublishLiveEventReq ={ 	this.param = p; 	this }

}
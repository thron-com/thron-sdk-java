package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MDeliverySettings

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClient.initializeDelivery
 */
@XmlRootElement(name="MClientinitializeDeliveryReq")
@XmlType(name="MClientinitializeDeliveryReq")
//#SWG#@ApiModel(description = "Request message for service JClient.initializeDelivery")
class MClientinitializeDeliveryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var deliverySettings: MDeliverySettings =_
	def withdeliverySettings(p:MDeliverySettings):this.type ={ 	this.deliverySettings = p; 	this }

}
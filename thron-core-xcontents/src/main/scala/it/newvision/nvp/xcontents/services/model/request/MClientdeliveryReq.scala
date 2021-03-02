package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.delivery.MDeliverySettings

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClient.delivery
 */
@XmlRootElement(name="MClientdeliveryReq")
@XmlType(name="MClientdeliveryReq")
//#SWG#@ApiModel(description = "Request message for service JClient.delivery")
class MClientdeliveryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var delivery: MDeliverySettings =_
	def withdelivery(p:MDeliverySettings):this.type ={ 	this.delivery = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.client.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDelivery") 
@XmlType(name="MResponseDelivery")
//#SWG#@ApiModel(description = """""")
class MResponseDelivery extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var delivery: MDeliverySettings =_
	def withdelivery(p:MDeliverySettings):this.type ={ 	this.delivery = p; 	this }

}
package it.newvision.nvp.identity.services.model.client
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
@XmlRootElement(name="MResponseDelivery") 
@XmlType(name="MResponseDelivery")
//#SWG#@ApiModel(description = """""")
class MResponseDelivery extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var delivery: MDeliverySettings =_
	def withdelivery(p:MDeliverySettings):this.type ={ 	this.delivery = p; 	this }

}
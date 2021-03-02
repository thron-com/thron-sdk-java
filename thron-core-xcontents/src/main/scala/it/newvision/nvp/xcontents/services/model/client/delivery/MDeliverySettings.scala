package it.newvision.nvp.xcontents.services.model.client.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDeliverySettings") 
@XmlType(name="MDeliverySettings")
//#SWG#@ApiModel(description = """""")
class MDeliverySettings extends Serializable {

	/**
	 * Delivery protection by domains.
	 */
	//#SWG#@ApiModelProperty(value = """Delivery protection by domains.""")
	@BeanProperty 
	var domainProtection: MDomainProtection =_
	def withdomainProtection(p:MDomainProtection):this.type ={ 	this.domainProtection = p; 	this }

}
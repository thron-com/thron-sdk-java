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
@XmlRootElement(name="MDomainProtection") 
@XmlType(name="MDomainProtection")
//#SWG#@ApiModel(description = """""")
class MDomainProtection extends Serializable {

	/**
	 * The array of string, if there is at least one domain, the other will be blocked
	 * for all delivery channels.
	 * This list can't contain the domain of the first level.
	 * Wildcard '*' accepts only for subdomains of third level or higher. 
	 */
	//#SWG#@ApiModelProperty(value = """The array of string, if there is at least one domain, the other will be blocked for all delivery channels. 
	//#SWGNL#This list can't contain the domain of the first level.
	//#SWGNL#Wildcard '*' accepts only for subdomains of third level or higher. """)
	@BeanProperty 
	var allowedDomains: List[String] = new ArrayList[String]
	def withallowedDomains(p:List[String]):this.type ={ 	this.allowedDomains = p; 	this }

	/**
	 * State of domain protection, if INACTIVE, all restrictions are ignored, If
	 * ACTIVE all restrictions will be applied to assets delivery.
	 */
	//#SWG#@ApiModelProperty(value = """State of domain protection, if INACTIVE, all restrictions are ignored, If ACTIVE all restrictions will be applied to assets delivery.""")
	@BeanProperty 
	var state: MDomainProtectionState =_
	def withstate(p:MDomainProtectionState):this.type ={ 	this.state = p; 	this }

}
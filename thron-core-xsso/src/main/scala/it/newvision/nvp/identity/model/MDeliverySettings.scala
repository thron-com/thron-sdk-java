package it.newvision.nvp.identity.model
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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var customDomains: MCustomDomains =_
	def withcustomDomains(p:MCustomDomains):this.type ={ 	this.customDomains = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var domainProtection: MDomainProtection =_
	def withdomainProtection(p:MDomainProtection):this.type ={ 	this.domainProtection = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var hsts: MHstsSettings =_
	def withhsts(p:MHstsSettings):this.type ={ 	this.hsts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var state: MDeliverySettingsState =_
	def withstate(p:MDeliverySettingsState):this.type ={ 	this.state = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tokenProtection: MTokenProtection =_
	def withtokenProtection(p:MTokenProtection):this.type ={ 	this.tokenProtection = p; 	this }

}
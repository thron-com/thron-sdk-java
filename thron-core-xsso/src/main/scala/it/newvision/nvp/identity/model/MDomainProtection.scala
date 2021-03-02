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
@XmlRootElement(name="MDomainProtection") 
@XmlType(name="MDomainProtection")
//#SWG#@ApiModel(description = """""")
class MDomainProtection extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var allowedDomains: List[String] = new ArrayList[String]
	def withallowedDomains(p:List[String]):this.type ={ 	this.allowedDomains = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var allowEmptyReferer: Boolean =_
	def withallowEmptyReferer(p:Boolean):this.type ={ 	this.allowEmptyReferer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var state: MDomainProtectionState =_
	def withstate(p:MDomainProtectionState):this.type ={ 	this.state = p; 	this }

}
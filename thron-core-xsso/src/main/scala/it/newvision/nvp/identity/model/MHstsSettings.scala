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
@XmlRootElement(name="MHstsSettings") 
@XmlType(name="MHstsSettings")
//#SWG#@ApiModel(description = """""")
class MHstsSettings extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var includeSubDomains: Boolean =_
	def withincludeSubDomains(p:Boolean):this.type ={ 	this.includeSubDomains = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var maxAgeInSeconds: Long =_
	def withmaxAgeInSeconds(p:Long):this.type ={ 	this.maxAgeInSeconds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var state: MHstsSettingsState =_
	def withstate(p:MHstsSettingsState):this.type ={ 	this.state = p; 	this }

}
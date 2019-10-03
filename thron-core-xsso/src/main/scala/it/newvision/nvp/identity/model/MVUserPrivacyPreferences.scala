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
@XmlRootElement(name="MVUserPrivacyPreferences") 
@XmlType(name="MVUserPrivacyPreferences")
//#SWG#@ApiModel(description = """""")
class MVUserPrivacyPreferences extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var allowForMarketing: Boolean  = false
	def withallowForMarketing(p:Boolean):this.type ={ 	this.allowForMarketing = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var allowForUsage: Boolean  = false
	def withallowForUsage(p:Boolean):this.type ={ 	this.allowForUsage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

}
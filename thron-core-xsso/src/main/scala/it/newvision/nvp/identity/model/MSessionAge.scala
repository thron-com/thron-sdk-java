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
@XmlRootElement(name="MSessionAge") 
@XmlType(name="MSessionAge")
//#SWG#@ApiModel(description = """""")
class MSessionAge extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var disableRememberMeAutologin: Boolean  = false
	def withdisableRememberMeAutologin(p:Boolean):this.type ={ 	this.disableRememberMeAutologin = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var durationHours: Integer  = 2
	def withdurationHours(p:Integer):this.type ={ 	this.durationHours = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var inactivityDaysBeforeUserDisable: Integer  = 0
	def withinactivityDaysBeforeUserDisable(p:Integer):this.type ={ 	this.inactivityDaysBeforeUserDisable = p; 	this }

}
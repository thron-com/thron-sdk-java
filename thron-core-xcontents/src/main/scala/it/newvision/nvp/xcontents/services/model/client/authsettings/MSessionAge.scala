package it.newvision.nvp.xcontents.services.model.client.authsettings
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
	var disableRememberMeAutologin: Boolean =_
	def withdisableRememberMeAutologin(p:Boolean):this.type ={ 	this.disableRememberMeAutologin = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var durationHours: Integer =_
	def withdurationHours(p:Integer):this.type ={ 	this.durationHours = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var inactivityDaysBeforeUserDisable: Integer =_
	def withinactivityDaysBeforeUserDisable(p:Integer):this.type ={ 	this.inactivityDaysBeforeUserDisable = p; 	this }

}
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
@XmlRootElement(name="MPasswordAge") 
@XmlType(name="MPasswordAge")
//#SWG#@ApiModel(description = """""")
class MPasswordAge extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var durationDays: Integer =_
	def withdurationDays(p:Integer):this.type ={ 	this.durationDays = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var firstAccessLinkDurationDays: Integer =_
	def withfirstAccessLinkDurationDays(p:Integer):this.type ={ 	this.firstAccessLinkDurationDays = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var historySize: Integer =_
	def withhistorySize(p:Integer):this.type ={ 	this.historySize = p; 	this }

}
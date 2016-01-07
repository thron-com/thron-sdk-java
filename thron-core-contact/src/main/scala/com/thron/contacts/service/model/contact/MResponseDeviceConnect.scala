package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.device.MResponseDevice

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDeviceConnect") 
@XmlType(name="MResponseDeviceConnect")
//#SWG#@ApiModel(description = """""")
class MResponseDeviceConnect extends MResponseDevice with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contactId: String =_
	def withcontactId(p:String):MResponseDeviceConnect ={ 	this.contactId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var deviceId: String =_
	def withdeviceId(p:String):MResponseDeviceConnect ={ 	this.deviceId = p; 	this }

}
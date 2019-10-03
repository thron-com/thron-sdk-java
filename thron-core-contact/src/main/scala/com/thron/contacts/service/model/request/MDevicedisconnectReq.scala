package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDevice.disconnect
 */
@XmlRootElement(name="MDevicedisconnectReq")
@XmlType(name="MDevicedisconnectReq")
//#SWG#@ApiModel(description = "Request message for service JDevice.disconnect")
class MDevicedisconnectReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contactId: String =_
	def withcontactId(p:String):this.type ={ 	this.contactId = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var deviceId: String =_
	def withdeviceId(p:String):this.type ={ 	this.deviceId = p; 	this }

}
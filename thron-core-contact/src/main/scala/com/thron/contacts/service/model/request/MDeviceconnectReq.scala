package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MIdentityKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDevice.connect
 */
@XmlRootElement(name="MDeviceconnectReq")
@XmlType(name="MDeviceconnectReq")
//#SWG#@ApiModel(description = "Request message for service JDevice.connect")
class MDeviceconnectReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var deviceId: String =_
	def withdeviceId(p:String):this.type ={ 	this.deviceId = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var ik: MIdentityKey =_
	def withik(p:MIdentityKey):this.type ={ 	this.ik = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var contactName: String =_
	def withcontactName(p:String):this.type ={ 	this.contactName = p; 	this }

}
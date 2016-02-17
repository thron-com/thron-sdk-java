package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MDevice

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContactDeviceDetail") 
@XmlType(name="MResponseContactDeviceDetail")
//#SWG#@ApiModel(description = """""")
class MResponseContactDeviceDetail extends MResponseContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MContactDetail =_
	def withitem(p:MContactDetail):this.type ={ 	this.item = p; 	this }

	/**
	 * only the 1st 50 devices linked to the contact.
	 */
	//#SWG#@ApiModelProperty(value = """only the 1st 50 devices linked to the contact.""")
	@BeanProperty 
	var devices: List[MDevice] = new ArrayList[MDevice]
	def withdevices(p:List[MDevice]):this.type ={ 	this.devices = p; 	this }

}
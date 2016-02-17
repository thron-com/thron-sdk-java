package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MContactUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContact.update
 */
@XmlRootElement(name="MContactupdateReq")
@XmlType(name="MContactupdateReq")
//#SWG#@ApiModel(description = "Request message for service JContact.update")
class MContactupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contactId: String =_
	def withcontactId(p:String):this.type ={ 	this.contactId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MContactUpdate =_
	def withupdate(p:MContactUpdate):this.type ={ 	this.update = p; 	this }

}
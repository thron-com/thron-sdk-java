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
 * Request message for service JContact.removeKey
 */
@XmlRootElement(name="MContactremoveKeyReq")
@XmlType(name="MContactremoveKeyReq")
//#SWG#@ApiModel(description = "Request message for service JContact.removeKey")
class MContactremoveKeyReq extends Serializable {

	/**
	 * tmpId used to identify the task
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contactId: String =_
	def withcontactId(p:String):MContactremoveKeyReq ={ 	this.contactId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var key: String =_
	def withkey(p:String):MContactremoveKeyReq ={ 	this.key = p; 	this }

}
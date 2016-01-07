package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MContactValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContact.insert
 */
@XmlRootElement(name="MContactinsertReq")
@XmlType(name="MContactinsertReq")
//#SWG#@ApiModel(description = "Request message for service JContact.insert")
class MContactinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MContactValue =_
	def withvalue(p:MContactValue):MContactinsertReq ={ 	this.value = p; 	this }

}
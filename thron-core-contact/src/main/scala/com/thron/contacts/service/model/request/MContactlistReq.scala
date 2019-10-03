package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MContactCriteria
import com.thron.contacts.service.model.contact.MContactResponseOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContact.list
 */
@XmlRootElement(name="MContactlistReq")
@XmlType(name="MContactlistReq")
//#SWG#@ApiModel(description = "Request message for service JContact.list")
class MContactlistReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MContactCriteria =_
	def withcriteria(p:MContactCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Max and default value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Max and default value is 50""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):this.type ={ 	this.limit = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var option: MContactResponseOption =_
	def withoption(p:MContactResponseOption):this.type ={ 	this.option = p; 	this }

}
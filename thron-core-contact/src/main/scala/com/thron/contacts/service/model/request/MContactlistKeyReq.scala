package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MKeyCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContact.listKey
 */
@XmlRootElement(name="MContactlistKeyReq")
@XmlType(name="MContactlistKeyReq")
//#SWG#@ApiModel(description = "Request message for service JContact.listKey")
class MContactlistKeyReq extends Serializable {

	/**
	 * filter keys by name
	 */
	//#SWG#@ApiModelProperty(value = """filter keys by name""", required = true)
	@BeanProperty
	var criteria: MKeyCriteria =_
	def withcriteria(p:MKeyCriteria):this.type ={ 	this.criteria = p; 	this }

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

}
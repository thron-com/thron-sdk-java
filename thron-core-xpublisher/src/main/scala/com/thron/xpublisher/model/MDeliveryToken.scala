package com.thron.xpublisher.model

import _root_.java.util._
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.xml.bind.annotation._

import _root_.scala.beans.BeanProperty

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDeliveryToken") 
@XmlType(name="MDeliveryToken")
//#SWG#@ApiModel(description = """""")
class MDeliveryToken extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):this.type ={ 	this.xpublisherId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

}
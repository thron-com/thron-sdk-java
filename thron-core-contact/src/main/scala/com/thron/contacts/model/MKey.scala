package com.thron.contacts.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MKey") 
@XmlType(name="MKey")
//#SWG#@ApiModel(description = """""")
class MKey extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date  = new Date
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

}
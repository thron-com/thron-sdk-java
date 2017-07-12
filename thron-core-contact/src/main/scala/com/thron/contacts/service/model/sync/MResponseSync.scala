package com.thron.contacts.service.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.msg.MEContact

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSync") 
@XmlType(name="MResponseSync")
//#SWG#@ApiModel(description = """""")
class MResponseSync extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEContact =_
	def withresultCode(p:MEContact):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
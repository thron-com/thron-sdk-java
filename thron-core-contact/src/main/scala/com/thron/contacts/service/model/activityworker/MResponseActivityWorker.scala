package com.thron.contacts.service.model.activityworker
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.msg.MEActivityWorker

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseActivityWorker") 
@XmlType(name="MResponseActivityWorker")
//#SWG#@ApiModel(description = """""")
class MResponseActivityWorker extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEActivityWorker =_
	def withresultCode(p:MEActivityWorker):this.type ={ 	this.resultCode = p; 	this }

}
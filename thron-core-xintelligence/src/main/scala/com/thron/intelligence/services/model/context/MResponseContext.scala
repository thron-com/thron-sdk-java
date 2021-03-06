package com.thron.intelligence.services.model.context
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContext") 
@XmlType(name="MResponseContext")
//#SWG#@ApiModel(description = """""")
class MResponseContext extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEContext =_
	def withresultCode(p:MEContext):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

}
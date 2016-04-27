package com.thron.intelligence.services.model.tag
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
@XmlRootElement(name="MResponseITag") 
@XmlType(name="MResponseITag")
//#SWG#@ApiModel(description = """""")
class MResponseITag extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEITag =_
	def withresultCode(p:MEITag):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
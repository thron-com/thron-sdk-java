package com.thron.intelligence.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThresholdValue") 
@XmlType(name="MThresholdValue")
//#SWG#@ApiModel(description = """""")
class MThresholdValue extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var value: Integer =_
	def withvalue(p:Integer):this.type ={ 	this.value = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

}
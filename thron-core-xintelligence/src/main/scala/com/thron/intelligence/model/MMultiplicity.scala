package com.thron.intelligence.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMultiplicity") 
@XmlType(name="MMultiplicity")
//#SWG#@ApiModel(description = """""")
class MMultiplicity extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var minimumValue: Integer =_
	def withminimumValue(p:Integer):MMultiplicity ={ 	this.minimumValue = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var maximumValue: Integer =_
	def withmaximumValue(p:Integer):MMultiplicity ={ 	this.maximumValue = p; 	this }

}
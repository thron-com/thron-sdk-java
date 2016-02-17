package com.thron.intelligence.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMetadataDefinitionColorOption") 
@XmlType(name="MMetadataDefinitionColorOption")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionColorOption extends MMetadataDefinitionOptionClass with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var defaultValue: String =_
	def withdefaultValue(p:String):this.type ={ 	this.defaultValue = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		Option(defaultValue) forall (_.matches("#[A-Fa-f0-9]{6}"))
	}

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		value.matches("#[A-Fa-f0-9]{6}")
	}

}
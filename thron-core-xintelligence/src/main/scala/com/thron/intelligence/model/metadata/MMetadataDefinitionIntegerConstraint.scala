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
@XmlRootElement(name="MMetadataDefinitionIntegerConstraint") 
@XmlType(name="MMetadataDefinitionIntegerConstraint")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionIntegerConstraint extends MMetadataDefinitionGenericConstraint with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var minimumValue: Integer =_
	def withminimumValue(p:Integer):this.type ={ 	this.minimumValue = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var maximumValue: Integer =_
	def withmaximumValue(p:Integer):this.type ={ 	this.maximumValue = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		val validLimits: Option[Boolean] =
			for (mn <- Option(minimumValue); mx <- Option(maximumValue)) yield minimumValue <= maximumValue
		validLimits.forall(_ == true)
	}

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		if (!mandatory && org.apache.commons.lang.StringUtils.isEmpty(value)) true
		else {
			val tr = scala.util.Try({
				value.toInt
			}) map { v =>
				Option(minimumValue).forall(v >= _) && Option(maximumValue).forall(v <= _)
			}
			tr.toOption.exists(_ == true)
		}
	}

}
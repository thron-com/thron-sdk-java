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
@XmlRootElement(name="MMetadataDefinitionOptions") 
@XmlType(name="MMetadataDefinitionOptions")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionOptions extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var alternativeMOption: MMetadataDefinitionAlternativeMOption =_
	def withalternativeMOption(p:MMetadataDefinitionAlternativeMOption):this.type ={ 	this.alternativeMOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var alternativeSOption: MMetadataDefinitionAlternativeSOption =_
	def withalternativeSOption(p:MMetadataDefinitionAlternativeSOption):this.type ={ 	this.alternativeSOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var booleanOption: MMetadataDefinitionBooleanOption =_
	def withbooleanOption(p:MMetadataDefinitionBooleanOption):this.type ={ 	this.booleanOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var colorOption: MMetadataDefinitionColorOption =_
	def withcolorOption(p:MMetadataDefinitionColorOption):this.type ={ 	this.colorOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var keyOption: MMetadataDefinitionKeyOption =_
	def withkeyOption(p:MMetadataDefinitionKeyOption):this.type ={ 	this.keyOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var numericDoubleOption: MMetadataDefinitionNumericDoubleOption =_
	def withnumericDoubleOption(p:MMetadataDefinitionNumericDoubleOption):this.type ={ 	this.numericDoubleOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var numericIntegerOption: MMetadataDefinitionNumericIntegerOption =_
	def withnumericIntegerOption(p:MMetadataDefinitionNumericIntegerOption):this.type ={ 	this.numericIntegerOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var stringOption: MMetadataDefinitionStringOption =_
	def withstringOption(p:MMetadataDefinitionStringOption):this.type ={ 	this.stringOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var temporalInstantOption: MMetadataDefinitionTemporalInstantOption =_
	def withtemporalInstantOption(p:MMetadataDefinitionTemporalInstantOption):this.type ={ 	this.temporalInstantOption = p; 	this }

	/**
	 * @param metadataType : MEMetadataDefinitionDataType
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid(metadataType: MEMetadataDefinitionDataType):Boolean ={
		metadataType match {
			case MEMetadataDefinitionDataType.NUMERIC_INTEGER => Option(numericIntegerOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.NUMERIC_DOUBLE => Option(numericDoubleOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.STRING => Option(stringOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.TEMPORAL_INSTANT => Option(temporalInstantOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.BOOLEAN => Option(booleanOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.COLOR => Option(colorOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.ALTERNATIVE_S => Option(alternativeSOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.ALTERNATIVE_M => Option(alternativeMOption).exists(_.isValid)
			case MEMetadataDefinitionDataType.KEY => Option(keyOption).exists(_.isValid)
			case _ => true 
		}
	}

}
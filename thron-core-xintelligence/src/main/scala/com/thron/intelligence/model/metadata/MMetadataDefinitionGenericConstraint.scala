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
/**
 * Generic constraints for the metadata definition, that can be used client side.
 */
@XmlRootElement(name="MMetadataDefinitionGenericConstraint") 
@XmlType(name="MMetadataDefinitionGenericConstraint")
//#SWG#@ApiModel(description = """Generic constraints for the metadata definition, that can be used client side.""")
class MMetadataDefinitionGenericConstraint extends Serializable {

	/**
	 * used to specify that the metadata is required or not, and can not be empty
	 */
	//#SWG#@ApiModelProperty(value = """used to specify that the metadata is required or not, and can not be empty""" ,required = true)
	@BeanProperty 
	var mandatory: Boolean  = false
	def withmandatory(p:Boolean):MMetadataDefinitionGenericConstraint ={ 	this.mandatory = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validateData(value: String):Boolean ={
		if (mandatory && org.apache.commons.lang.StringUtils.isEmpty(value)) false
		else true
	}

}
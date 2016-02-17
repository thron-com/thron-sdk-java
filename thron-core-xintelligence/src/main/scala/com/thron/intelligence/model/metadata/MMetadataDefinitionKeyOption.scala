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
@XmlRootElement(name="MMetadataDefinitionKeyOption") 
@XmlType(name="MMetadataDefinitionKeyOption")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionKeyOption extends MMetadataDefinitionOptionClass with Serializable  {

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var fieldType: MEStringType =_
	def withfieldType(p:MEStringType):this.type ={ 	this.fieldType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		//Option(fieldType).isDefined
		true
	}

}
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
@XmlRootElement(name="MMetadataDefinitionStringOption") 
@XmlType(name="MMetadataDefinitionStringOption")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionStringOption extends MMetadataDefinitionOptionClass with Serializable  {

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var defaultValue: String =_
	def withdefaultValue(p:String):this.type ={ 	this.defaultValue = p; 	this }

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var fieldType: MEStringType =_
	def withfieldType(p:MEStringType):this.type ={ 	this.fieldType = p; 	this }

	/**
	 * Used for validation.
	 */
	//#SWG#@ApiModelProperty(value = """Used for validation.""")
	@BeanProperty 
	var localized: Boolean  = false
	def withlocalized(p:Boolean):this.type ={ 	this.localized = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		true
	}

}
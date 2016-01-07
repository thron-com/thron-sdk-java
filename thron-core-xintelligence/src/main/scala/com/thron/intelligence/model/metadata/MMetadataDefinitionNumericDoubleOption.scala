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
@XmlRootElement(name="MMetadataDefinitionNumericDoubleOption") 
@XmlType(name="MMetadataDefinitionNumericDoubleOption")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionNumericDoubleOption extends MMetadataDefinitionOptionClass with Serializable  {

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var defaultValue: Double =_
	def withdefaultValue(p:Double):MMetadataDefinitionNumericDoubleOption ={ 	this.defaultValue = p; 	this }

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		scala.util.Try({value.toDouble}).isSuccess
	}

}
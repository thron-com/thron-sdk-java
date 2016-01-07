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
@XmlRootElement(name="MMetadataDefinitionAlternativeSOption") 
@XmlType(name="MMetadataDefinitionAlternativeSOption")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionAlternativeSOption extends MMetadataDefinitionOptionClass with Serializable  {

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var fieldType: MEAlternativeSType =_
	def withfieldType(p:MEAlternativeSType):MMetadataDefinitionAlternativeSOption ={ 	this.fieldType = p; 	this }

	/**
	 * Used for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used for validation""")
	@BeanProperty 
	var values: List[MAlternativeValue] = new ArrayList[MAlternativeValue]
	def withvalues(p:List[MAlternativeValue]):MMetadataDefinitionAlternativeSOption ={ 	this.values = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		import scala.collection.JavaConversions._
		values.nonEmpty && values.forall(_.isValid)
	}

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		import scala.collection.JavaConversions._
		values.exists(_.value == value)
	}

}
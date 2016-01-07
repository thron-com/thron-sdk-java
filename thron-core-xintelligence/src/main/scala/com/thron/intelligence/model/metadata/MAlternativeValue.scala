package com.thron.intelligence.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to show in presentation (admin console) the channel description and the
 * information should be in multi language.
 */
@XmlRootElement(name="MAlternativeValue") 
@XmlType(name="MAlternativeValue")
//#SWG#@ApiModel(description = """Used to show in presentation (admin console) the channel description and the information should be in multi language.""")
class MAlternativeValue extends MLocalization with Serializable  {

	/**
	 * Metadata Value, as keyword
	 */
	//#SWG#@ApiModelProperty(value = """Metadata Value, as keyword""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):MAlternativeValue ={ 	this.value = p; 	this }

	/**
	 * used to identify the default value in the list
	 */
	//#SWG#@ApiModelProperty(value = """used to identify the default value in the list""" ,required = true)
	@BeanProperty 
	var selected: Boolean  = false
	def withselected(p:Boolean):MAlternativeValue ={ 	this.selected = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		super.isValid && Option(value).exists(!_.contains(","))
	}

}
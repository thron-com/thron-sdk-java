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
@XmlRootElement(name="MMetadataDefinitionStringConstraint") 
@XmlType(name="MMetadataDefinitionStringConstraint")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionStringConstraint extends MMetadataDefinitionGenericConstraint with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var regexp: String =_
	def withregexp(p:String):MMetadataDefinitionStringConstraint ={ 	this.regexp = p; 	this }

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>max length is 2000000 (if not defined)</li>
	 * 	<li>max length <=100 for metadata definition of type "KEY".</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length is 2000000 (if not defined)</li>
	//#SWGNL#	<li>max length <=100 for metadata definition of type "KEY".</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var maxSize: Integer  = 2000000
	def withmaxSize(p:Integer):MMetadataDefinitionStringConstraint ={ 	this.maxSize = p; 	this }

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		if (!mandatory && org.apache.commons.lang.StringUtils.isEmpty(value)) true
		else value.length <= maxSize && Option(regexp).forall(_.r.pattern.matcher(value).matches)
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		Option(maxSize).forall(x=>  x<=2000000)
	}

}
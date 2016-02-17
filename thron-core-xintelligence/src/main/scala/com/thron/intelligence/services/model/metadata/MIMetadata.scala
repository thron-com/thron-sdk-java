package com.thron.intelligence.services.model.metadata
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
 * This class should be used to store additional information. 
 */
@XmlRootElement(name="MIMetadata") 
@XmlType(name="MIMetadata")
//#SWG#@ApiModel(description = """This class should be used to store additional information. """)
class MIMetadata extends Serializable {

	/**
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: max length = 50""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	/**
	 * Optional for bulkRemove service.
	 * 
	 * Max length based on metadata definition constraints.
	 * Constraints for string:
	 * <ul>
	 * 	<li>max length is 2000000 (if not defined)</li>
	 * </ul>
	 * <ul>
	 * 	<li>max length <=100 for metadata definition of type "KEY".</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Optional for bulkRemove service.
	//#SWGNL#
	//#SWGNL#Max length based on metadata definition constraints.
	//#SWGNL#Constraints for string:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length is 2000000 (if not defined)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length <=100 for metadata definition of type "KEY".</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * @param forRemove : Boolean
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid(forRemove: Boolean):Boolean ={
		import org.apache.commons.lang.StringUtils
	
		val isValueValid = forRemove || (
			StringUtils.isNotBlank(value) &&
			StringUtils.length(value) <= 2000000
		)
	
		StringUtils.isNotBlank(key) &&
		StringUtils.length(key) <= 50 &&
		isValueValid
	}

}
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
 * Validation date format is ISO8601
 */
@XmlRootElement(name="MMetadataDefinitionTemporalInstantOption") 
@XmlType(name="MMetadataDefinitionTemporalInstantOption")
//#SWG#@ApiModel(description = """Validation date format is ISO8601""")
class MMetadataDefinitionTemporalInstantOption extends MMetadataDefinitionOptionClass with Serializable  {

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var dateFormat: String =_
	def withdateFormat(p:String):this.type ={ 	this.dateFormat = p; 	this }

	/**
	 * Used as layout directive, not for validation
	 */
	//#SWG#@ApiModelProperty(value = """Used as layout directive, not for validation""")
	@BeanProperty 
	var defaultValue: Date =_
	def withdefaultValue(p:Date):this.type ={ 	this.defaultValue = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		Option(dateFormat).forall(df => scala.util.Try({new java.text.SimpleDateFormat(df)}).isSuccess)
	}

	/**
	 * @param value : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def validateData(value: String):Boolean ={
		scala.util.Try({new it.newvision.nvp.core.libraries.rs.DateType(value)}).isSuccess
	}

}
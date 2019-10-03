package it.newvision.nvp.xcontents.model
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
 * Used to show in presentation (admin console) the channel description and the
 * information should be in multi language.
 */
@XmlRootElement(name="MCustomMetadataValueLabel") 
@XmlType(name="MCustomMetadataValueLabel")
//#SWG#@ApiModel(description = """Used to show in presentation (admin console) the channel description and the information should be in multi language.""")
class MCustomMetadataValueLabel extends MCustomMetadataKeyLabel with Serializable  {

	/**
	 * used to identify the default value in the list
	 */
	//#SWG#@ApiModelProperty(value = """used to identify the default value in the list""" ,required = true)
	@BeanProperty 
	var markedAsDefaultValue: Boolean  = false
	def withmarkedAsDefaultValue(p:Boolean):this.type ={ 	this.markedAsDefaultValue = p; 	this }

	/**
	 * Metadata Value, as keyword
	 */
	//#SWG#@ApiModelProperty(value = """Metadata Value, as keyword""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

}
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
 * Used to show in presentation (admin console) the channel description and the
 * information should be in multi language.
 */
@XmlRootElement(name="MMetadataDefinitionKeyLabel") 
@XmlType(name="MMetadataDefinitionKeyLabel")
//#SWG#@ApiModel(description = """Used to show in presentation (admin console) the channel description and the information should be in multi language.""")
class MMetadataDefinitionKeyLabel extends Serializable {

	/**
	 * en/it/ ....
	 */
	//#SWG#@ApiModelProperty(value = """en/it/ ....""" ,required = true)
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):MMetadataDefinitionKeyLabel ={ 	this.lang = p; 	this }

	/**
	 * Description in the specific locale. Used only for presentation
	 */
	//#SWG#@ApiModelProperty(value = """Description in the specific locale. Used only for presentation""" ,required = true)
	@BeanProperty 
	var label: String  = ""
	def withlabel(p:String):MMetadataDefinitionKeyLabel ={ 	this.label = p; 	this }

	/**
	 * The help text in the specific locale. Used only for presentation
	 */
	//#SWG#@ApiModelProperty(value = """The help text in the specific locale. Used only for presentation""" ,required = true)
	@BeanProperty 
	var hint: String =_
	def withhint(p:String):MMetadataDefinitionKeyLabel ={ 	this.hint = p; 	this }

}
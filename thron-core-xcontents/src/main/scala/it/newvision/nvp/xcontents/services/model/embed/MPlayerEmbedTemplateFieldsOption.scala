package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedTemplateFieldsOption") 
@XmlType(name="MPlayerEmbedTemplateFieldsOption")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateFieldsOption extends Serializable {

	/**
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Default=false""")
	@BeanProperty 
	var returnRoles: Boolean  = false
	def withreturnRoles(p:Boolean):this.type ={ 	this.returnRoles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnValues: Boolean  = false
	def withreturnValues(p:Boolean):this.type ={ 	this.returnValues = p; 	this }

}
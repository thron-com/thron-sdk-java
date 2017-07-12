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
@XmlRootElement(name="MPlayerEmbedCodeTemplateValue") 
@XmlType(name="MPlayerEmbedCodeTemplateValue")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeTemplateValue extends MPlayerEmbedCodeTemplateMinimalValue with Serializable  {

	/**
	 * Optional. If missing, template latest version will be used.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. If missing, template latest version will be used.""")
	@BeanProperty 
	var templateVersion: Integer =_
	def withtemplateVersion(p:Integer):this.type ={ 	this.templateVersion = p; 	this }

}
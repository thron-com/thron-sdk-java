package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEPlayerEmbedTemplateType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedCodeTemplateMinimalValue") 
@XmlType(name="MPlayerEmbedCodeTemplateMinimalValue")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeTemplateMinimalValue extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateId: String =_
	def withtemplateId(p:String):this.type ={ 	this.templateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateType: MEPlayerEmbedTemplateType =_
	def withtemplateType(p:MEPlayerEmbedTemplateType):this.type ={ 	this.templateType = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
	
		if (StringUtils.isEmpty(templateId)) throw new IllegalArgumentException("Missing templateId param")
		if (Option(templateType).isEmpty) throw new IllegalArgumentException("Missing templateType param")
	}

}
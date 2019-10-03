package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateCriteria
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.list
 */
@XmlRootElement(name="MPlayerEmbedTemplatelistReq")
@XmlType(name="MPlayerEmbedTemplatelistReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.list")
class MPlayerEmbedTemplatelistReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MPlayerEmbedTemplateCriteria =_
	def withcriteria(p:MPlayerEmbedTemplateCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):this.type ={ 	this.limit = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var options: MPlayerEmbedTemplateFieldsOption =_
	def withoptions(p:MPlayerEmbedTemplateFieldsOption):this.type ={ 	this.options = p; 	this }

}
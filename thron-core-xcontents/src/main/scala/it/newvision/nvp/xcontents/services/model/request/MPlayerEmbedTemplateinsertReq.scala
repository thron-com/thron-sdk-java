package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateValue
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateVersionValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.insert
 */
@XmlRootElement(name="MPlayerEmbedTemplateinsertReq")
@XmlType(name="MPlayerEmbedTemplateinsertReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.insert")
class MPlayerEmbedTemplateinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var templateValue: MPlayerEmbedTemplateValue =_
	def withtemplateValue(p:MPlayerEmbedTemplateValue):this.type ={ 	this.templateValue = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var versionValue: MPlayerEmbedTemplateVersionValue =_
	def withversionValue(p:MPlayerEmbedTemplateVersionValue):this.type ={ 	this.versionValue = p; 	this }

}
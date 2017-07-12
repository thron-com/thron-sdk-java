package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateVersionValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.createVersion
 */
@XmlRootElement(name="MPlayerEmbedTemplatecreateVersionReq")
@XmlType(name="MPlayerEmbedTemplatecreateVersionReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.createVersion")
class MPlayerEmbedTemplatecreateVersionReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MPlayerEmbedTemplateVersionValue =_
	def withupdate(p:MPlayerEmbedTemplateVersionValue):this.type ={ 	this.update = p; 	this }

}
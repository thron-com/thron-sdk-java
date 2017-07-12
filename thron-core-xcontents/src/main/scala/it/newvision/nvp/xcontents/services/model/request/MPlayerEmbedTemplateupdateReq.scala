package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.update
 */
@XmlRootElement(name="MPlayerEmbedTemplateupdateReq")
@XmlType(name="MPlayerEmbedTemplateupdateReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.update")
class MPlayerEmbedTemplateupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MPlayerEmbedTemplateUpdate =_
	def withupdate(p:MPlayerEmbedTemplateUpdate):this.type ={ 	this.update = p; 	this }

}
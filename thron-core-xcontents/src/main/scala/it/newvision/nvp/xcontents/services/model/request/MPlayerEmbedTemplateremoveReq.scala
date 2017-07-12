package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeTemplateMinimalValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedTemplate.remove
 */
@XmlRootElement(name="MPlayerEmbedTemplateremoveReq")
@XmlType(name="MPlayerEmbedTemplateremoveReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.remove")
class MPlayerEmbedTemplateremoveReq extends Serializable {

	/**
	 * linked embedCodes will be migrated to the target template.
	 * The targetTemplate should link to the same platformTemplateId (major release of
	 * the player) of the removed template.
	 */
	//#SWG#@ApiModelProperty(value = """linked embedCodes will be migrated to the target template.
	//#SWGNL#The targetTemplate should link to the same platformTemplateId (major release of the player) of the removed template.""", required = true)
	@BeanProperty
	var targetTemplate: MPlayerEmbedCodeTemplateMinimalValue =_
	def withtargetTemplate(p:MPlayerEmbedCodeTemplateMinimalValue):this.type ={ 	this.targetTemplate = p; 	this }

}
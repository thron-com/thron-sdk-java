package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeList
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeTemplateValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedCode.updateTemplate
 */
@XmlRootElement(name="MPlayerEmbedCodeupdateTemplateReq")
@XmlType(name="MPlayerEmbedCodeupdateTemplateReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.updateTemplate")
class MPlayerEmbedCodeupdateTemplateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var embedCodes: MPlayerEmbedCodeList =_
	def withembedCodes(p:MPlayerEmbedCodeList):this.type ={ 	this.embedCodes = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var template: MPlayerEmbedCodeTemplateValue =_
	def withtemplate(p:MPlayerEmbedCodeTemplateValue):this.type ={ 	this.template = p; 	this }

}
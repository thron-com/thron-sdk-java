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
 * Request message for service JPlayerEmbedCode.sync
 */
@XmlRootElement(name="MPlayerEmbedCodesyncReq")
@XmlType(name="MPlayerEmbedCodesyncReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.sync")
class MPlayerEmbedCodesyncReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var template: MPlayerEmbedCodeTemplateMinimalValue =_
	def withtemplate(p:MPlayerEmbedCodeTemplateMinimalValue):this.type ={ 	this.template = p; 	this }

}
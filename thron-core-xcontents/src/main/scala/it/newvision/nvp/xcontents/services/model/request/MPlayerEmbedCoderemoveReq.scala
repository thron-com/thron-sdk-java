package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeEntity

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedCode.remove
 */
@XmlRootElement(name="MPlayerEmbedCoderemoveReq")
@XmlType(name="MPlayerEmbedCoderemoveReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.remove")
class MPlayerEmbedCoderemoveReq extends Serializable {

	/**
	 * The Player Embed Code Id
	 */
	//#SWG#@ApiModelProperty(value = """The Player Embed Code Id""", required = true)
	@BeanProperty
	var embedCodeId: String =_
	def withembedCodeId(p:String):this.type ={ 	this.embedCodeId = p; 	this }

	/**
	 * Optional. xcontentId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """Optional. xcontentId or prettyId""", required = true)
	@BeanProperty
	var source: MPlayerEmbedCodeEntity =_
	def withsource(p:MPlayerEmbedCodeEntity):this.type ={ 	this.source = p; 	this }

}
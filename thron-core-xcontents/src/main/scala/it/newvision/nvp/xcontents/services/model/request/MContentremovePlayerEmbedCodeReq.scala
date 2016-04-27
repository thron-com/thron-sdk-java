package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.removePlayerEmbedCode
 */
@XmlRootElement(name="MContentremovePlayerEmbedCodeReq")
@XmlType(name="MContentremovePlayerEmbedCodeReq")
//#SWG#@ApiModel(description = "Request message for service JContent.removePlayerEmbedCode")
class MContentremovePlayerEmbedCodeReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * xcontentId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """xcontentId or prettyId""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var embedCodeId: String =_
	def withembedCodeId(p:String):this.type ={ 	this.embedCodeId = p; 	this }

}
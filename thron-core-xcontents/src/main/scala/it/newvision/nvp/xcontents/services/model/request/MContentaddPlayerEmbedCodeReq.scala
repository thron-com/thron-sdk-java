package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedCode

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.addPlayerEmbedCode
 */
@XmlRootElement(name="MContentaddPlayerEmbedCodeReq")
@XmlType(name="MContentaddPlayerEmbedCodeReq")
//#SWG#@ApiModel(description = "Request message for service JContent.addPlayerEmbedCode")
class MContentaddPlayerEmbedCodeReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var embedCode: MPlayerEmbedCode =_
	def withembedCode(p:MPlayerEmbedCode):this.type ={ 	this.embedCode = p; 	this }

}
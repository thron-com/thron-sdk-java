package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeEntity
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedCode.update
 */
@XmlRootElement(name="MPlayerEmbedCodeupdateReq")
@XmlType(name="MPlayerEmbedCodeupdateReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.update")
class MPlayerEmbedCodeupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var embedCodeId: String =_
	def withembedCodeId(p:String):this.type ={ 	this.embedCodeId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var source: MPlayerEmbedCodeEntity =_
	def withsource(p:MPlayerEmbedCodeEntity):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MPlayerEmbedCodeUpdate =_
	def withupdate(p:MPlayerEmbedCodeUpdate):this.type ={ 	this.update = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeEntity
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedCode.insert
 */
@XmlRootElement(name="MPlayerEmbedCodeinsertReq")
@XmlType(name="MPlayerEmbedCodeinsertReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.insert")
class MPlayerEmbedCodeinsertReq extends Serializable {

	/**
	 * xcontentId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """xcontentId or prettyId""", required = true)
	@BeanProperty
	var source: MPlayerEmbedCodeEntity =_
	def withsource(p:MPlayerEmbedCodeEntity):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MPlayerEmbedCodeValue =_
	def withvalue(p:MPlayerEmbedCodeValue):this.type ={ 	this.value = p; 	this }

	/**
	 * Whether or not service should skip pkey creation for this Player Embed Code.
	 */
	//#SWG#@ApiModelProperty(value = """Whether or not service should skip pkey creation for this Player Embed Code.""", required = true)
	@BeanProperty
	var skipPkeyCreation: Boolean =_
	def withskipPkeyCreation(p:Boolean):this.type ={ 	this.skipPkeyCreation = p; 	this }

}
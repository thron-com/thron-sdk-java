package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeEntity
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedCodeCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlayerEmbedCode.list
 */
@XmlRootElement(name="MPlayerEmbedCodelistReq")
@XmlType(name="MPlayerEmbedCodelistReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedCode.list")
class MPlayerEmbedCodelistReq extends Serializable {

	/**
	 * Optional only for user with role 4ME_MANAGE_PLAYER_EMBED_VERSIONS
	 */
	//#SWG#@ApiModelProperty(value = """Optional only for user with role 4ME_MANAGE_PLAYER_EMBED_VERSIONS""", required = true)
	@BeanProperty
	var source: MPlayerEmbedCodeEntity =_
	def withsource(p:MPlayerEmbedCodeEntity):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MPlayerEmbedCodeCriteria =_
	def withcriteria(p:MPlayerEmbedCodeCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pageSize: Integer =_
	def withpageSize(p:Integer):this.type ={ 	this.pageSize = p; 	this }

}
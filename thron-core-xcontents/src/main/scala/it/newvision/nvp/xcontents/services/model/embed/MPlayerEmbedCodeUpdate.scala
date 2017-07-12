package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata
import it.newvision.nvp.xcontents.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedCodeUpdate") 
@XmlType(name="MPlayerEmbedCodeUpdate")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeUpdate extends MUpdater with Serializable  {

	/**
	 * short name or description of the embed code
	 */
	//#SWG#@ApiModelProperty(value = """short name or description of the embed code""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var template: MPlayerEmbedCodeTemplateValue =_
	def withtemplate(p:MPlayerEmbedCodeTemplateValue):this.type ={ 	this.template = p; 	this }

	/**
	 * Optional. A list of parameters to be used by the player when delivering the
	 * content (CE version > 1.x)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. A list of parameters to be used by the player when delivering the content (CE version > 1.x)""")
	@BeanProperty 
	var values: List[MMetadata] =_
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * Optional. specific param to use with RTIE thumbs and images
	 */
	//#SWG#@ApiModelProperty(value = """Optional. specific param to use with RTIE thumbs and images""")
	@BeanProperty 
	var rtieValues: List[MMetadata] =_
	def withrtieValues(p:List[MMetadata]):this.type ={ 	this.rtieValues = p; 	this }

	/**
	 * The contextId to use for traking.
	 */
	//#SWG#@ApiModelProperty(value = """The contextId to use for traking.""")
	@BeanProperty 
	var useContextId: String =_
	def withuseContextId(p:String):this.type ={ 	this.useContextId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var enabled: Boolean =_
	def withenabled(p:Boolean):this.type ={ 	this.enabled = p; 	this }

}
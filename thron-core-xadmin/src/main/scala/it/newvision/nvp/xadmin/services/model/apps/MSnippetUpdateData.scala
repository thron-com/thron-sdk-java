package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMetadata
import it.newvision.nvp.xadmin.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Snippet update class, used to selectively update snippet information.
 */
@XmlRootElement(name="MSnippetUpdateData") 
@XmlType(name="MSnippetUpdateData")
//#SWG#@ApiModel(description = """Snippet update class, used to selectively update snippet information.""")
class MSnippetUpdateData extends MUpdater with Serializable  {

	/**
	 * custom metadata (json format) used to store the configuration metadata of the
	 * snippet.
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata (json format) used to store the configuration metadata of the snippet.""")
	@BeanProperty 
	var configData: String =_
	def withconfigData(p:String):this.type ={ 	this.configData = p; 	this }

	/**
	 * custom description of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the snippet""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	/**
	 * generic metadata linked to the snippet
	 */
	//#SWG#@ApiModelProperty(value = """generic metadata linked to the snippet""")
	@BeanProperty 
	var metadata: List[MMetadata] =_
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var snippetType: String =_
	def withsnippetType(p:String):this.type ={ 	this.snippetType = p; 	this }

	/**
	 * used to enable/disable a snippet
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MESnippetStatus =_
	def withstatus(p:MESnippetStatus):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateId: String =_
	def withtemplateId(p:String):this.type ={ 	this.templateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateVersion: String =_
	def withtemplateVersion(p:String):this.type ={ 	this.templateVersion = p; 	this }

	/**
	 * the version id of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """the version id of the snippet""" ,required = true)
	@BeanProperty 
	var version: String =_
	def withversion(p:String):this.type ={ 	this.version = p; 	this }

}
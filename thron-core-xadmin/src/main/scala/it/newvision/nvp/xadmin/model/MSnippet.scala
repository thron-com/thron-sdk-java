package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MESnippetStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * A snippet is a pice of code used to solve a specific use case.
 * The snippet class is used to store the configuration data of a snippet.
 */
@XmlRootElement(name="MSnippet") 
@XmlType(name="MSnippet")
//#SWG#@ApiModel(description = """A snippet is a pice of code used to solve a specific use case. 
//#SWGNL#The snippet class is used to store the configuration data of a snippet.""")
class MSnippet extends Serializable {

	/**
	 * the snippet id
	 */
	//#SWG#@ApiModelProperty(value = """the snippet id""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString.replaceAll("-", "")
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * used to enable/disable a snippet
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MESnippetStatus  = MESnippetStatus.ACTIVE
	def withstatus(p:MESnippetStatus):this.type ={ 	this.status = p; 	this }

	/**
	 * the version id of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """the version id of the snippet""" ,required = true)
	@BeanProperty 
	var version: String =_
	def withversion(p:String):this.type ={ 	this.version = p; 	this }

	/**
	 * used to define the snippet "class"
	 */
	//#SWG#@ApiModelProperty(value = """used to define the snippet "class"""" ,required = true)
	@BeanProperty 
	var snippetType: String =_
	def withsnippetType(p:String):this.type ={ 	this.snippetType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateId: String =_
	def withtemplateId(p:String):this.type ={ 	this.templateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateVersion: String =_
	def withtemplateVersion(p:String):this.type ={ 	this.templateVersion = p; 	this }

	/**
	 * username of the owner of the snippet.
	 * The user who created the snippet instance
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner of the snippet.
	//#SWGNL#The user who created the snippet instance""" ,required = true)
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):this.type ={ 	this.ownerUsername = p; 	this }

	/**
	 * derived at runtime.
	 */
	//#SWG#@ApiModelProperty(value = """derived at runtime.""")
	@BeanProperty 
	var ownerFullName: String =_
	def withownerFullName(p:String):this.type ={ 	this.ownerFullName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * custom metadata (json format) used to store the configuration metadata of the
	 * snippet.
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata (json format) used to store the configuration metadata of the snippet.""")
	@BeanProperty 
	var configData: String =_
	def withconfigData(p:String):this.type ={ 	this.configData = p; 	this }

	/**
	 * custom metadata linked to the snippet
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata linked to the snippet""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * the display name of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """the display name of the snippet""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	/**
	 * custom description of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the snippet""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

}
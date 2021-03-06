package it.newvision.nvp.xadmin.services.model.apps
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
 * A snippet is a pice of code used to solve a specific use case.
 * The snippet class is used to store the configuration data of a snippet.
 */
@XmlRootElement(name="MSnippetSummary") 
@XmlType(name="MSnippetSummary")
//#SWG#@ApiModel(description = """A snippet is a pice of code used to solve a specific use case. 
//#SWGNL#The snippet class is used to store the configuration data of a snippet.""")
class MSnippetSummary extends Serializable {

	/**
	 * custom description of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the snippet""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * the display name of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """the display name of the snippet""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	/**
	 * the snippet id.
	 * Empty if the user has no roles for the Snippet
	 */
	//#SWG#@ApiModelProperty(value = """the snippet id.
	//#SWGNL#Empty if the user has no roles for the Snippet""")
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * derived at runtime.
	 */
	//#SWG#@ApiModelProperty(value = """derived at runtime.""")
	@BeanProperty 
	var ownerFullName: String =_
	def withownerFullName(p:String):this.type ={ 	this.ownerFullName = p; 	this }

	/**
	 * username of the owner of the snippet.
	 * The user who created the snippet instance
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner of the snippet.
	//#SWGNL#The user who created the snippet instance""")
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):this.type ={ 	this.ownerUsername = p; 	this }

	/**
	 * used to define the snippet "class"
	 */
	//#SWG#@ApiModelProperty(value = """used to define the snippet "class"""")
	@BeanProperty 
	var snippetType: String =_
	def withsnippetType(p:String):this.type ={ 	this.snippetType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var status: MESnippetStatus =_
	def withstatus(p:MESnippetStatus):this.type ={ 	this.status = p; 	this }

	/**
	 * the version id of the snippet
	 */
	//#SWG#@ApiModelProperty(value = """the version id of the snippet""")
	@BeanProperty 
	var version: String =_
	def withversion(p:String):this.type ={ 	this.version = p; 	this }

}
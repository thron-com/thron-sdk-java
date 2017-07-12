package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MPlayerEmbedTemplateRole

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * A template used to customize the Player layout
 */
@XmlRootElement(name="MPlayerEmbedTemplate") 
@XmlType(name="MPlayerEmbedTemplate")
//#SWG#@ApiModel(description = """A template used to customize the Player layout""")
class MPlayerEmbedTemplate extends Serializable {

	/**
	 * template Id
	 */
	//#SWG#@ApiModelProperty(value = """template Id""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * template version
	 */
	//#SWG#@ApiModelProperty(value = """template version""" ,required = true)
	@BeanProperty 
	var version: Integer  = 1
	def withversion(p:Integer):this.type ={ 	this.version = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * template name
	 */
	//#SWG#@ApiModelProperty(value = """template name""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

	/**
	 * Define the player version in use
	 */
	//#SWG#@ApiModelProperty(value = """Define the player version in use""")
	@BeanProperty 
	var playerVersion: String =_
	def withplayerVersion(p:String):this.type ={ 	this.playerVersion = p; 	this }

	/**
	 * link to the platform template Id (CE1,CE2...) used to set the playerVersion
	 */
	//#SWG#@ApiModelProperty(value = """link to the platform template Id (CE1,CE2...) used to set the playerVersion""" ,required = true)
	@BeanProperty 
	var platformTemplateId: String =_
	def withplatformTemplateId(p:String):this.type ={ 	this.platformTemplateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var platformTemplateVersion: Integer =_
	def withplatformTemplateVersion(p:Integer):this.type ={ 	this.platformTemplateVersion = p; 	this }

	/**
	 * Custom properties for the template (CEM parameters)
	 */
	//#SWG#@ApiModelProperty(value = """Custom properties for the template (CEM parameters)""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * Optional. The owner of the PlayerEmbedTemplate
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdBy: String =_
	def withcreatedBy(p:String):this.type ={ 	this.createdBy = p; 	this }

	/**
	 * Custom Javascript resource URL
	 */
	//#SWG#@ApiModelProperty(value = """Custom Javascript resource URL""")
	@BeanProperty 
	var jsUrl: String =_
	def withjsUrl(p:String):this.type ={ 	this.jsUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * Custom CSS resource URL
	 */
	//#SWG#@ApiModelProperty(value = """Custom CSS resource URL""")
	@BeanProperty 
	var cssUrl: String =_
	def withcssUrl(p:String):this.type ={ 	this.cssUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

	/**
	 * Optional. The owner of the PlayerEmbedTemplate
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The owner of the PlayerEmbedTemplate""")
	@BeanProperty 
	var modifiedBy: String =_
	def withmodifiedBy(p:String):this.type ={ 	this.modifiedBy = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var default: Boolean =_
	@Deprecated
	def withdefault(p:Boolean):this.type ={ 	this.default = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var roles: List[MPlayerEmbedTemplateRole] = new ArrayList[MPlayerEmbedTemplateRole]
	  def withroles(p:List[MPlayerEmbedTemplateRole]):this.type ={ 	this.roles = p; 	this }

}
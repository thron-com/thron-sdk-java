package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * A template used to customize the Player layout
 */
@XmlRootElement(name="MPlayerEmbedTemplateDetail") 
@XmlType(name="MPlayerEmbedTemplateDetail")
//#SWG#@ApiModel(description = """A template used to customize the Player layout""")
class MPlayerEmbedTemplateDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cssUrl: String =_
	def withcssUrl(p:String):this.type ={ 	this.cssUrl = p; 	this }

	/**
	 * template Id
	 */
	//#SWG#@ApiModelProperty(value = """template Id""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var jsUrl: String =_
	def withjsUrl(p:String):this.type ={ 	this.jsUrl = p; 	this }

	/**
	 * Deprecated. Parameter available only for player 4x version.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated. Parameter available only for player 4x version.""")
	@BeanProperty 
	@Deprecated
	var noLogo: Boolean  = false
	@Deprecated
	def withnoLogo(p:Boolean):this.type ={ 	this.noLogo = p; 	this }

	/**
	 * link to the platform template Id (CE1,CE2...) used to set the playerVersion
	 */
	//#SWG#@ApiModelProperty(value = """link to the platform template Id (CE1,CE2...) used to set the playerVersion""" ,required = true)
	@BeanProperty 
	var platformTemplateId: String =_
	def withplatformTemplateId(p:String):this.type ={ 	this.platformTemplateId = p; 	this }

	/**
	 * Define the player version in use
	 */
	//#SWG#@ApiModelProperty(value = """Define the player version in use""")
	@BeanProperty 
	var playerVersion: String =_
	def withplayerVersion(p:String):this.type ={ 	this.playerVersion = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var playerVersions: List[String] = new ArrayList[String]
	@Deprecated
	def withplayerVersions(p:List[String]):this.type ={ 	this.playerVersions = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var trackerGA: String =_
	@Deprecated
	def withtrackerGA(p:String):this.type ={ 	this.trackerGA = p; 	this }

	/**
	 * Custom properties for the template (CEM parameters)
	 */
	//#SWG#@ApiModelProperty(value = """Custom properties for the template (CEM parameters)""")
	@BeanProperty 
	var values: List[MMetadata] = new ArrayList[MMetadata]
	def withvalues(p:List[MMetadata]):this.type ={ 	this.values = p; 	this }

	/**
	 * template version
	 */
	//#SWG#@ApiModelProperty(value = """template version""" ,required = true)
	@BeanProperty 
	var version: Integer =_
	def withversion(p:Integer):this.type ={ 	this.version = p; 	this }

}
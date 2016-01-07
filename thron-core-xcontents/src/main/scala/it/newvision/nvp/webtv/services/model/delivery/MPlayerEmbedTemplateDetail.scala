package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedTemplate

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
class MPlayerEmbedTemplateDetail extends MPlayerEmbedTemplate with Serializable  {

	/**
	 * Parameter available only for player 4x version.
	 */
	//#SWG#@ApiModelProperty(value = """Parameter available only for player 4x version.""")
	@BeanProperty 
	var noLogo: Boolean  = false
	def withnoLogo(p:Boolean):MPlayerEmbedTemplateDetail ={ 	this.noLogo = p; 	this }

	/**
	 * Define the player versions in use
	 */
	//#SWG#@ApiModelProperty(value = """Define the player versions in use""")
	@BeanProperty 
	var playerVersions: List[String] = new ArrayList[String]
	def withplayerVersions(p:List[String]):MPlayerEmbedTemplateDetail ={ 	this.playerVersions = p; 	this }

	/**
	 * Google Analytics ID. Used by the player for statistics and reports.
	 * This attribute is derived from the clientId properties.
	 */
	//#SWG#@ApiModelProperty(value = """Google Analytics ID. Used by the player for statistics and reports.
	//#SWGNL#This attribute is derived from the clientId properties.""")
	@BeanProperty 
	@Deprecated
	var trackerGA: String =_
	@Deprecated
	def withtrackerGA(p:String):MPlayerEmbedTemplateDetail ={ 	this.trackerGA = p; 	this }

	/**
	 * @param p : MPlayerEmbedTemplate
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(p: MPlayerEmbedTemplate){
		this()
		this.id = p.id
		this.name = p.name
		this.description = p.description
		this.active = p.active
		this.default = p.default
		this.values = p.values
	}

}
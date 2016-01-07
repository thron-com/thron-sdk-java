package it.newvision.nvp.identity.model
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
 * Commons properties of 4ME Player
 */
@XmlRootElement(name="MPropertyPlayer") 
@XmlType(name="MPropertyPlayer")
//#SWG#@ApiModel(description = """Commons properties of 4ME Player""")
class MPropertyPlayer extends Serializable {

	/**
	 * the player url.
	 */
	//#SWG#@ApiModelProperty(value = """the player url.""" ,required = true)
	@BeanProperty 
	var playerUrl: String  = "-4me.weebo.it/static/player/swf/player.swf"
	def withplayerUrl(p:String):MPropertyPlayer ={ 	this.playerUrl = p; 	this }

	/**
	 * used to override the default player versions
	 * Define all versions the client should be used. It's possible to override only
	 * major versions (4.x, 5.x ...)
	 */
	//#SWG#@ApiModelProperty(value = """used to override the default player versions
	//#SWGNL#Define all versions the client should be used. It's possible to override only major versions (4.x, 5.x ...)""")
	@BeanProperty 
	var fixedVersions: List[String] = new ArrayList[String]
	def withfixedVersions(p:List[String]):MPropertyPlayer ={ 	this.fixedVersions = p; 	this }

	/**
	 * Optional parameter to use only with 4x version.
	 */
	//#SWG#@ApiModelProperty(value = """Optional parameter to use only with 4x version.""" ,required = true)
	@BeanProperty 
	var noLogo: Boolean  = false
	def withnoLogo(p:Boolean):MPropertyPlayer ={ 	this.noLogo = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(clientId: String){
		this()
		this.playerUrl = "http://"+clientId + this.playerUrl
	
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(clientId: String){
		this.playerUrl = "http://"+clientId + this.playerUrl
	
	}

}
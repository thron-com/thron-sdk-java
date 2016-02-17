package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishedContent") 
@XmlType(name="MPublishedContent")
//#SWG#@ApiModel(description = """""")
class MPublishedContent extends MAChannel with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId") 
	var pContentId: String =_
	def withpContentId(p:String):this.type ={ 	this.pContentId = p; 	this }

	/**
	 * Defines the restriction properties for the published content (user
	 * authentication, geo blocking, player restrictions).
	 */
	//#SWG#@ApiModelProperty(value = """Defines the restriction properties for the published content (user authentication, geo blocking, player restrictions).""")
	@BeanProperty 
	var deliveryProperties: MRestrictionProperties =_
	def withdeliveryProperties(p:MRestrictionProperties):this.type ={ 	this.deliveryProperties = p; 	this }

	/**
	 * The list of available cue points. The cuePoints list is not specific for a
	 * single channel, but is the full cuePoints list of the published content, and is
	 * the player that can decide to use or not the information.
	 */
	//#SWG#@ApiModelProperty(value = """The list of available cue points. The cuePoints list is not specific for a single channel, but is the full cuePoints list of the published content, and is the player that can decide to use or not the information.""")
	@BeanProperty 
	var subTitles: List[MSubtitle] = new ArrayList[MSubtitle]
	def withsubTitles(p:List[MSubtitle]):this.type ={ 	this.subTitles = p; 	this }

}
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
@XmlRootElement(name="MContent") 
@XmlType(name="MContent")
//#SWG#@ApiModel(description = """""")
class MContent extends Serializable {

	/**
	 * The published content ID. Each pcontentId can have multiple contents published
	 * in different channels
	 */
	//#SWG#@ApiModelProperty(value = """The published content ID. Each pcontentId can have multiple contents published in different channels""" ,required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId") 
	var pContentId: String =_
	def withpContentId(p:String):MContent ={ 	this.pContentId = p; 	this }

	/**
	 * specify the content type like: VIDEO, IMAGE, AUDIO ...
	 */
	//#SWG#@ApiModelProperty(value = """specify the content type like: VIDEO, IMAGE, AUDIO ...""")
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):MContent ={ 	this.contentType = p; 	this }

	/**
	 * Defines the restriction properties for the published content (user
	 * authentication, geo blocking, player restrictions).
	 */
	//#SWG#@ApiModelProperty(value = """Defines the restriction properties for the published content (user authentication, geo blocking, player restrictions).""" ,required = true)
	@BeanProperty 
	var deliveryProperties: MRestrictionProperties  = new MRestrictionProperties
	def withdeliveryProperties(p:MRestrictionProperties):MContent ={ 	this.deliveryProperties = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@BeanProperty 
	var subTitles: List[MSubtitleFile] = new ArrayList[MSubtitleFile]
	def withsubTitles(p:List[MSubtitleFile]):MContent ={ 	this.subTitles = p; 	this }

	/**
	 * used to store the version of the published content. The version number change
	 * when the content is republished using a different source file or when the
	 * thumbnail change. The version doe not change id the content is published in a
	 * new channel.
	 */
	//#SWG#@ApiModelProperty(value = """used to store the version of the published content. The version number change when the content is republished using a different source file or when the thumbnail change. The version doe not change id the content is published in a new channel.""")
	@BeanProperty 
	var version: Integer  = 0
	def withversion(p:Integer):MContent ={ 	this.version = p; 	this }

	/**
	 * used for the user quota calculus
	 */
	//#SWG#@ApiModelProperty(value = """used for the user quota calculus""" ,required = true)
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MContent ={ 	this.userId = p; 	this }

	/**
	 * Used to store the html code (or other format) for PAGELET contents.
	 */
	//#SWG#@ApiModelProperty(value = """Used to store the html code (or other format) for PAGELET contents.""")
	@BeanProperty 
	var contentBody: MContentBody =_
	def withcontentBody(p:MContentBody):MContent ={ 	this.contentBody = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var channels: List[MChannel] = new ArrayList[MChannel]
	  def withchannels(p:List[MChannel]):MContent ={ 	this.channels = p; 	this }

	/**
	 * Deprecated!
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """Deprecated!""")
	var thumbnails: List[MThumbnail] = new ArrayList[MThumbnail]
	  def withthumbnails(p:List[MThumbnail]):MContent ={ 	this.thumbnails = p; 	this }

	/**
	 * @param channelToBeFilteredOut : String
	 * @param onlyPublished : Boolean
	 * @return MChannel
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getFilteredChannels(channelToBeFilteredOut: String, 
			onlyPublished: Boolean):List[MChannel] ={
		import scala.collection.JavaConversions._
		this.channels filter {c=>
		  c.channelType != channelToBeFilteredOut && {
			if(onlyPublished){c.status == MEChannelStatus.PUBLISHED}else{true}        
		  }
		}
	}

}
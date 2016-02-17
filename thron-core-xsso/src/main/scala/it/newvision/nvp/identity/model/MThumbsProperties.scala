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
 * Thumbnails properties for the different content Types.
 */
@XmlRootElement(name="MThumbsProperties") 
@XmlType(name="MThumbsProperties")
//#SWG#@ApiModel(description = """Thumbnails properties for the different content Types.""")
class MThumbsProperties extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesVideo: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesVideo(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesVideo = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesImage: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesImage(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesImage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesLive: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesLive(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesLive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesNdoc: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesNdoc(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesNdoc = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesAudio: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesAudio(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesAudio = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesDocument: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesDocument(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesDocument = p; 	this }

	/**
	 * thumbs properties for pagelet contents
	 */
	//#SWG#@ApiModelProperty(value = """thumbs properties for pagelet contents""" ,required = true)
	@BeanProperty 
	var thumbsPropertiesPagelet: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsPropertiesPagelet(p:MPropertyThumbnail):this.type ={ 	this.thumbsPropertiesPagelet = p; 	this }

	/**
	 * ONLY FOR VIDEO: defined in seconds
	 */
	//#SWG#@ApiModelProperty(value = """ONLY FOR VIDEO: defined in seconds""" ,required = true)
	@BeanProperty 
	var thumbVideoFrameTime: Integer  = 10
	def withthumbVideoFrameTime(p:Integer):this.type ={ 	this.thumbVideoFrameTime = p; 	this }

	/**
	 * Only for NDoc documents: create the thumbnail using the specified page.
	 */
	//#SWG#@ApiModelProperty(value = """Only for NDoc documents: create the thumbnail using the specified page.""" ,required = true)
	@BeanProperty 
	var thumbNdocPageNumber: Integer  = 1
	def withthumbNdocPageNumber(p:Integer):this.type ={ 	this.thumbNdocPageNumber = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){
		thumbsPropertiesVideo.init()
		thumbsPropertiesAudio.init()
		thumbsPropertiesImage.init()
		thumbsPropertiesLive.init()
		thumbsPropertiesNdoc.init()
		thumbsPropertiesDocument.init()
		thumbsPropertiesPagelet.init()
	}

}
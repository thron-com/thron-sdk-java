package it.newvision.nvp.xadmin.services.model.weebo
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
 * only one of thumbSource, thumbMediaLibrary, thumbVideoFrameTime or
 * thumbUploaded is allowed.
 */
@XmlRootElement(name="MThumbnailParams") 
@XmlType(name="MThumbnailParams")
//#SWG#@ApiModel(description = """only one of thumbSource, thumbMediaLibrary, thumbVideoFrameTime or thumbUploaded is allowed.""")
class MThumbnailParams extends Serializable {

	/**
	 * Deprecated.
	 * Thumbnail ingestion for a specific channel
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Thumbnail ingestion for a specific channel""")
	@BeanProperty 
	@Deprecated
	var channel: List[String] = new ArrayList[String]
	@Deprecated
	def withchannel(p:List[String]):this.type ={ 	this.channel = p; 	this }

	/**
	 * deprecated by xcontentId attribute
	 */
	//#SWG#@ApiModelProperty(value = """deprecated by xcontentId attribute""")
	@BeanProperty 
	@Deprecated
	var mediaContentId: String =_
	@Deprecated
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbFromVideo: MThumbnailVideoSource =_
	def withthumbFromVideo(p:MThumbnailVideoSource):this.type ={ 	this.thumbFromVideo = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbSource: MThumbnailSource =_
	def withthumbSource(p:MThumbnailSource):this.type ={ 	this.thumbSource = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbUploaded: MThumbnailUploaded =_
	def withthumbUploaded(p:MThumbnailUploaded):this.type ={ 	this.thumbUploaded = p; 	this }

	/**
	 * the content Id.
	 */
	//#SWG#@ApiModelProperty(value = """the content Id.""")
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}
package it.newvision.nvp.webtv.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.playlist.MResponsePlayList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * is the playlist content with the linked contents filled.
 * The linked contents have the full description, the locale
 */
@XmlRootElement(name="MResponsePlayListDescriptor") 
@XmlType(name="MResponsePlayListDescriptor")
//#SWG#@ApiModel(description = """is the playlist content with the linked contents filled. 
//#SWGNL#The linked contents have the full description, the locale""")
class MResponsePlayListDescriptor extends MResponsePlayList with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var content: MPlayListDetail =_
	def withcontent(p:MPlayListDetail):MResponsePlayListDescriptor ={ 	this.content = p; 	this }

	/**
	 * The channel code used in xpublisher (WEB, STREAMRTMP, STREAMHTTPFLASH,...)
	 */
	//#SWG#@ApiModelProperty(value = """The channel code used in xpublisher (WEB, STREAMRTMP, STREAMHTTPFLASH,...)""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):MResponsePlayListDescriptor ={ 	this.channelType = p; 	this }

	/**
	 * the locale code
	 */
	//#SWG#@ApiModelProperty(value = """the locale code""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):MResponsePlayListDescriptor ={ 	this.locale = p; 	this }

	/**
	 * specifies that the following playlist is based on a specific content type (all
	 * elements of the playlist have the same content type). match the EContentType in
	 * xcontents (VIDEO, AUDIO)
	 */
	//#SWG#@ApiModelProperty(value = """specifies that the following playlist is based on a specific content type (all elements of the playlist have the same content type). match the EContentType in xcontents (VIDEO, AUDIO)""")
	@BeanProperty 
	var playlistTemplate: String =_
	def withplaylistTemplate(p:String):MResponsePlayListDescriptor ={ 	this.playlistTemplate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playlistThumbnails: MThumbnailDetail =_
	def withplaylistThumbnails(p:MThumbnailDetail):MResponsePlayListDescriptor ={ 	this.playlistThumbnails = p; 	this }

	/**
	 * Defined if divArea parameter is specified on the request.
	 * Return the thumbnail that best suits to the given area.
	 * Format: <widht>x<height>
	 */
	//#SWG#@ApiModelProperty(value = """Defined if divArea parameter is specified on the request.
	//#SWGNL#Return the thumbnail that best suits to the given area.
	//#SWGNL#Format: <widht>x<height>""")
	@BeanProperty 
	var bestThumbUrl: String =_
	def withbestThumbUrl(p:String):MResponsePlayListDescriptor ={ 	this.bestThumbUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var elements: List[MItemDetail] = new ArrayList[MItemDetail]
	def withelements(p:List[MItemDetail]):MResponsePlayListDescriptor ={ 	this.elements = p; 	this }

	/**
	 * the total number of playlist elements.
	 */
	//#SWG#@ApiModelProperty(value = """the total number of playlist elements.""" ,required = true)
	@BeanProperty 
	var totalNumberOfElements: Integer =_
	def withtotalNumberOfElements(p:Integer):MResponsePlayListDescriptor ={ 	this.totalNumberOfElements = p; 	this }

}
package it.newvision.nvp.webtv.services.model.playlist
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
 * generic content element inside a playlist
 */
@XmlRootElement(name="MItemDetail") 
@XmlType(name="MItemDetail")
//#SWG#@ApiModel(description = """generic content element inside a playlist""")
class MItemDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var position: Integer =_
	def withposition(p:Integer):MItemDetail ={ 	this.position = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):MItemDetail ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):MItemDetail ={ 	this.xpublisherId = p; 	this }

	/**
	 * match the EContentType in xcontent
	 */
	//#SWG#@ApiModelProperty(value = """match the EContentType in xcontent""" ,required = true)
	@BeanProperty 
	var contentType: String =_
	def withcontentType(p:String):MItemDetail ={ 	this.contentType = p; 	this }

	/**
	 * The creation date of the content.
	 */
	//#SWG#@ApiModelProperty(value = """The creation date of the content.""" ,required = true)
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):MItemDetail ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MItemDetail ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):MItemDetail ={ 	this.name = p; 	this }

	/**
	 * summary of the content
	 */
	//#SWG#@ApiModelProperty(value = """summary of the content""")
	@BeanProperty 
	@Deprecated
	var excerpt: String =_
	@Deprecated
	def withexcerpt(p:String):MItemDetail ={ 	this.excerpt = p; 	this }

	/**
	 * The content url , or descriptor url.
	 */
	//#SWG#@ApiModelProperty(value = """The content url , or descriptor url.""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):MItemDetail ={ 	this.url = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@BeanProperty 
	@Deprecated
	var thumbnails: MThumbnailDetail =_
	@Deprecated
	def withthumbnails(p:MThumbnailDetail):MItemDetail ={ 	this.thumbnails = p; 	this }

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
	def withbestThumbUrl(p:String):MItemDetail ={ 	this.bestThumbUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var duration: Long =_
	def withduration(p:Long):MItemDetail ={ 	this.duration = p; 	this }

	/**
	 * The list of Content.metadatas (xcontent).
	 */
	//#SWG#@ApiModelProperty(value = """The list of Content.metadatas (xcontent).""")
	@BeanProperty 
	var metadata: List[MMetadataDetail] = new ArrayList[MMetadataDetail]
	def withmetadata(p:List[MMetadataDetail]):MItemDetail ={ 	this.metadata = p; 	this }

	/**
	 * The list of Channel.metadatas (xpublisher). These are the system metadata used
	 * to define some specific properties of the elements in CDN in the specific
	 * channel.
	 */
	//#SWG#@ApiModelProperty(value = """The list of Channel.metadatas (xpublisher). These are the system metadata used to define some specific properties of the elements in CDN in the specific channel.""")
	@BeanProperty 
	var sysMetadata: List[MMetadataDetail] = new ArrayList[MMetadataDetail]
	def withsysMetadata(p:List[MMetadataDetail]):MItemDetail ={ 	this.sysMetadata = p; 	this }

}
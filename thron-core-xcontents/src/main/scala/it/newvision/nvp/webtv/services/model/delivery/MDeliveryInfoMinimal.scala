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
 * Used to provide some delivery information necessary to layout the list of
 * linked contents.
 */
@XmlRootElement(name="MDeliveryInfoMinimal") 
@XmlType(name="MDeliveryInfoMinimal")
//#SWG#@ApiModel(description = """Used to provide some delivery information necessary to layout the list of linked contents.""")
class MDeliveryInfoMinimal extends Serializable {

	/**
	 * DEPRECATED. Use bestThymbUrl or dynThumbService
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED. Use bestThymbUrl or dynThumbService""")
	@BeanProperty 
	@Deprecated
	var thumbsUrl: List[String] = new ArrayList[String]
	@Deprecated
	def withthumbsUrl(p:List[String]):MDeliveryInfoMinimal ={ 	this.thumbsUrl = p; 	this }

	/**
	 * DEPRECATED. Use bestThymbUrl or dynThumbService
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED. Use bestThymbUrl or dynThumbService""")
	@BeanProperty 
	var defaultThumbUrl: String =_
	def withdefaultThumbUrl(p:String):MDeliveryInfoMinimal ={ 	this.defaultThumbUrl = p; 	this }

	/**
	 * Defined if divArea parameter is specified on the request.
	 * Return the thumbnail that best suits to the given area (DivArea format:
	 * <widht>x<height>)
	 * bestThumbUrl provides the static url of the thumbnail in 4me CDN (Content
	 * Delivery Network); the url is volatile and may change with time. In order to
	 * obtain a dynamic link to the best thumbnail (for the given content and div
	 * area) use the "dynThumbService" attribute (see reference for details)
	 */
	//#SWG#@ApiModelProperty(value = """Defined if divArea parameter is specified on the request.
	//#SWGNL#Return the thumbnail that best suits to the given area (DivArea format: <widht>x<height>)
	//#SWGNL#bestThumbUrl provides the static url of the thumbnail in 4me CDN (Content Delivery Network); the url is volatile and may change with time. In order to obtain a dynamic link to the best thumbnail (for the given content and div area) use the "dynThumbService" attribute (see reference for details)""")
	@BeanProperty 
	var bestThumbUrl: String =_
	def withbestThumbUrl(p:String):MDeliveryInfoMinimal ={ 	this.bestThumbUrl = p; 	this }

	/**
	 * Returns a dynamic link to the best thumbnail for the given content and DivArea
	 * provided by the service JDelivery.getThumbnail.
	 * Thumbnail resolution is the closest to fit the given DivArea (DivArea format:
	 * <widht>x<height>)
	 */
	//#SWG#@ApiModelProperty(value = """Returns a dynamic link to the best thumbnail for the given content and DivArea provided by the service JDelivery.getThumbnail.
	//#SWGNL#Thumbnail resolution is the closest to fit the given DivArea (DivArea format: <widht>x<height>)""" ,required = true)
	@BeanProperty 
	var dynThumbService: String =_
	def withdynThumbService(p:String):MDeliveryInfoMinimal ={ 	this.dynThumbService = p; 	this }

	/**
	 * used only with "downloadable contents"
	 */
	//#SWG#@ApiModelProperty(value = """used only with "downloadable contents"""")
	@BeanProperty 
	var contentUrl: String =_
	def withcontentUrl(p:String):MDeliveryInfoMinimal ={ 	this.contentUrl = p; 	this }

	/**
	 * The list of all system metadata stored in xpublisher channel.sysMetadata. like
	 * video length, and size...
	 */
	//#SWG#@ApiModelProperty(value = """The list of all system metadata stored in xpublisher channel.sysMetadata. like video length, and size...""")
	@BeanProperty 
	var sysMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withsysMetadata(p:List[MMetadata]):MDeliveryInfoMinimal ={ 	this.sysMetadata = p; 	this }

}
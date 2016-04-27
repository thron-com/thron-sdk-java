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
 * Used to return the xpublisher information of content. Thumbnails, contentUrl,
 * for a single channel.
 */
@XmlRootElement(name="MDeliveryInfo") 
@XmlType(name="MDeliveryInfo")
//#SWG#@ApiModel(description = """Used to return the xpublisher information of content. Thumbnails, contentUrl, for a single channel.""")
class MDeliveryInfo extends Serializable {

	/**
	 * channel id: WEB, STTEAMHTTPFLASH, ....
	 */
	//#SWG#@ApiModelProperty(value = """channel id: WEB, STTEAMHTTPFLASH, ....""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

	/**
	 * DEPRECATED. Use bestThymbUrl
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED. Use bestThymbUrl""")
	@BeanProperty 
	@Deprecated
	var thumbsUrl: List[String] = new ArrayList[String]
	@Deprecated
	def withthumbsUrl(p:List[String]):this.type ={ 	this.thumbsUrl = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@BeanProperty 
	@Deprecated
	var defaultThumbUrl: String =_
	@Deprecated
	def withdefaultThumbUrl(p:String):this.type ={ 	this.defaultThumbUrl = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@BeanProperty 
	@Deprecated
	var bestThumbUrl: String =_
	@Deprecated
	def withbestThumbUrl(p:String):this.type ={ 	this.bestThumbUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentDescriptorUrl: String =_
	def withcontentDescriptorUrl(p:String):this.type ={ 	this.contentDescriptorUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentUrl: String =_
	def withcontentUrl(p:String):this.type ={ 	this.contentUrl = p; 	this }

	/**
	 * The list of all system metadata stored in xpublisher  channel.sysMetadata. The
	 * list of srtFiles is saved as Metadata information.
	 */
	//#SWG#@ApiModelProperty(value = """The list of all system metadata stored in xpublisher  channel.sysMetadata. The list of srtFiles is saved as Metadata information.""")
	@BeanProperty 
	var sysMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withsysMetadata(p:List[MMetadata]):this.type ={ 	this.sysMetadata = p; 	this }

}
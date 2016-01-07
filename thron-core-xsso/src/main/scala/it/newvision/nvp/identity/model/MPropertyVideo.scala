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
 * Properties for the Video Ingestion.
 * The client can have the properties to convert video in MP4 with codec h264 or
 * in MP4 with codec vp6. This is used for single video ingestion published as
 * Progressive Download in WEB Channel
 */
@XmlRootElement(name="MPropertyVideo") 
@XmlType(name="MPropertyVideo")
//#SWG#@ApiModel(description = """Properties for the Video Ingestion.
//#SWGNL#The client can have the properties to convert video in MP4 with codec h264 or in MP4 with codec vp6. This is used for single video ingestion published as Progressive Download in WEB Channel""")
class MPropertyVideo extends Serializable {

	/**
	 * it's the profile identifier. it can be:
	 * <ul>
	 * 	<li>WEB</li>
	 * 	<li>IPHONE</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """it's the profile identifier. it can be:
	//#SWGNL#<ul>
	//#SWGNL#	<li>WEB</li>
	//#SWGNL#	<li>IPHONE</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var channelType: String  = "WEB"
	def withchannelType(p:String):MPropertyVideo ={ 	this.channelType = p; 	this }

	/**
	 * FLV o MP4 per il multibitrate
	 */
	//#SWG#@ApiModelProperty(value = """FLV o MP4 per il multibitrate""" ,required = true)
	@BeanProperty 
	var convertTo: String  = "MP4"
	def withconvertTo(p:String):MPropertyVideo ={ 	this.convertTo = p; 	this }

	/**
	 * vp6, h264
	 */
	//#SWG#@ApiModelProperty(value = """vp6, h264""" ,required = true)
	@BeanProperty 
	var codec: String  = "h264"
	def withcodec(p:String):MPropertyVideo ={ 	this.codec = p; 	this }

	/**
	 * converti il video al bitrate approssimato più simile a videoBitrate
	 */
	//#SWG#@ApiModelProperty(value = """converti il video al bitrate approssimato più simile a videoBitrate""" ,required = true)
	@BeanProperty 
	var videoBitRate: Integer  = 700
	def withvideoBitRate(p:Integer):MPropertyVideo ={ 	this.videoBitRate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var audioBitRate: Integer  = 96
	def withaudioBitRate(p:Integer):MPropertyVideo ={ 	this.audioBitRate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalBitRate: Integer  = 800
	def withtotalBitRate(p:Integer):MPropertyVideo ={ 	this.totalBitRate = p; 	this }

	/**
	 * the audio hertz rates
	 */
	//#SWG#@ApiModelProperty(value = """the audio hertz rates""" ,required = true)
	@BeanProperty 
	var sampleRate: Integer  = 44100
	def withsampleRate(p:Integer):MPropertyVideo ={ 	this.sampleRate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var thumbsProperties: MPropertyThumbnail  = new MPropertyThumbnail
	def withthumbsProperties(p:MPropertyThumbnail):MPropertyVideo ={ 	this.thumbsProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defaultThumbnailFormat: String  = "L"
	def withdefaultThumbnailFormat(p:String):MPropertyVideo ={ 	this.defaultThumbnailFormat = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){
		this.thumbsProperties.init
	}

}
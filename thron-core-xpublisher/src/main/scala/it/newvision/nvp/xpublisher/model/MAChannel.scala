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
@XmlRootElement(name="MAChannel") 
@XmlType(name="MAChannel")
//#SWG#@ApiModel(description = """""")
abstract class MAChannel extends Serializable {

	/**
	 * please refer to ChannelType for available channels.A string field is used for
	 * flexibility. A special semantic is applied depending on the value of this field.
	 */
	//#SWG#@ApiModelProperty(value = """please refer to ChannelType for available channels.A string field is used for flexibility. A special semantic is applied depending on the value of this field.""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):MAChannel ={ 	this.channelType = p; 	this }

	/**
	 * not used by EChannelType.VOD
	 * Contain the http url or the list of urls for multiple files. (STREAMWEB channel)
	 */
	//#SWG#@ApiModelProperty(value = """not used by EChannelType.VOD
	//#SWGNL#Contain the http url or the list of urls for multiple files. (STREAMWEB channel)""")
	@BeanProperty 
	var urlContent: String =_
	def withurlContent(p:String):MAChannel ={ 	this.urlContent = p; 	this }

	/**
	 * url to get the content descriptor (smil, m3u8...)
	 */
	//#SWG#@ApiModelProperty(value = """url to get the content descriptor (smil, m3u8...)""")
	@BeanProperty 
	var urlDescriptor: String =_
	def withurlDescriptor(p:String):MAChannel ={ 	this.urlDescriptor = p; 	this }

	/**
	 * it is automatically generated (SMIL descriptor) for the vod contents where it
	 * is necessary to verify the availability of the content in the storage network.
	 * The descriptor is defined only for the EChannelType.VOD
	 */
	//#SWG#@ApiModelProperty(value = """it is automatically generated (SMIL descriptor) for the vod contents where it is necessary to verify the availability of the content in the storage network.
	//#SWGNL#The descriptor is defined only for the EChannelType.VOD""")
	@BeanProperty 
	var descriptor: String =_
	def withdescriptor(p:String):MAChannel ={ 	this.descriptor = p; 	this }

	/**
	 * Optional folder name defined by the client
	 */
	//#SWG#@ApiModelProperty(value = """Optional folder name defined by the client""")
	@BeanProperty 
	var path: String =_
	def withpath(p:String):MAChannel ={ 	this.path = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var status: MEChannelStatus =_
	def withstatus(p:MEChannelStatus):MAChannel ={ 	this.status = p; 	this }

	/**
	 * the publication date of the content (in the channel). If the date is in the
	 * future a scheduled task will automatically publish the content.
	 */
	//#SWG#@ApiModelProperty(value = """the publication date of the content (in the channel). If the date is in the future a scheduled task will automatically publish the content.""")
	@BeanProperty 
	var plannedDate: Date =_
	def withplannedDate(p:Date):MAChannel ={ 	this.plannedDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var publishedDate: Date  = new Date()
	def withpublishedDate(p:Date):MAChannel ={ 	this.publishedDate = p; 	this }

	/**
	 * It defines the different type of manifests used for the streaming,
	 * like m3u8, f4m and smil
	 */
	//#SWG#@ApiModelProperty(value = """It defines the different type of manifests used for the streaming,
	//#SWGNL#like m3u8, f4m and smil""")
	@BeanProperty 
	var descriptorMimeType: String =_
	def withdescriptorMimeType(p:String):MAChannel ={ 	this.descriptorMimeType = p; 	this }

	/**
	 * The total space (in Bytes) of the published content.
	 * Used for the user quota calculus
	 */
	//#SWG#@ApiModelProperty(value = """The total space (in Bytes) of the published content.
	//#SWGNL#Used for the user quota calculus""")
	@BeanProperty 
	var totalSize: Long =_
	def withtotalSize(p:Long):MAChannel ={ 	this.totalSize = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var defaultThumb: MThumbnail =_
	  def withdefaultThumb(p:MThumbnail):MAChannel ={ 	this.defaultThumb = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var thumbnails: List[MThumbnail] = new ArrayList[MThumbnail]
	  def withthumbnails(p:List[MThumbnail]):MAChannel ={ 	this.thumbnails = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var sysMetadata: List[MMetadata] = new ArrayList[MMetadata]
	  def withsysMetadata(p:List[MMetadata]):MAChannel ={ 	this.sysMetadata = p; 	this }

}
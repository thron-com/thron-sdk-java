package it.newvision.nvp.xadmin.model
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
 * The MediaContent class keeps s all information about the content's channels,
 * the packaging and ingestion reference, the original source file and the status
 * of the publishing process. It's used by the admin services to keep track of the
 * publishing process, to restart the ingestion of a single channel, or republish
 * the content in the CDN.
 * When a new content is created in the platform using the specific webservice to
 * publish a content.
 */
@XmlRootElement(name="MMediaContent") 
@XmlType(name="MMediaContent")
//#SWG#@ApiModel(description = """The MediaContent class keeps s all information about the content's channels, the packaging and ingestion reference, the original source file and the status of the publishing process. It's used by the admin services to keep track of the publishing process, to restart the ingestion of a single channel, or republish the content in the CDN.
//#SWGNL#When a new content is created in the platform using the specific webservice to publish a content.""")
class MMediaContent extends Serializable {

	/**
	 * it's the unique reference ID for a given MediaContent object. It's the
	 * mediacontentId
	 */
	//#SWG#@ApiModelProperty(value = """it's the unique reference ID for a given MediaContent object. It's the mediacontentId""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * It is the content reference id of the xcontent component.
	 */
	//#SWG#@ApiModelProperty(value = """It is the content reference id of the xcontent component.""")
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var packagedId: List[String] = new ArrayList[String]
	@Deprecated
	def withpackagedId(p:List[String]):this.type ={ 	this.packagedId = p; 	this }

	/**
	 * It is the content reference id of the xpublisher component.
	 */
	//#SWG#@ApiModelProperty(value = """It is the content reference id of the xpublisher component.""")
	@BeanProperty 
	var xpublishedId: String =_
	def withxpublishedId(p:String):this.type ={ 	this.xpublishedId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * The userId of the user who created the content. Can be an internal userId or
	 * external depending where the user component is handled.
	 */
	//#SWG#@ApiModelProperty(value = """The userId of the user who created the content. Can be an internal userId or external depending where the user component is handled.""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType  = MEContentType.OTHER
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	/**
	 * The display name of the Author.
	 * Free text used to show the full name of the author.
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """The display name of the Author.
	//#SWGNL#Free text used to show the full name of the author.
	//#SWGNL#Constraints: max length = 50""" ,required = true)
	@BeanProperty 
	var owner: String  = ""
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	/**
	 * DEPRECATED.
	 * The attribute shows from which solution the content has been created. This
	 * information is used to filter the contents by solution.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#The attribute shows from which solution the content has been created. This information is used to filter the contents by solution.""")
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * DEPRECATED.
	 * The attribute shows the solutions that can  use the content. This information
	 * is used to filter the contents by solution. Each solution shows only the
	 * contents available for that solution.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#The attribute shows the solutions that can  use the content. This information is used to filter the contents by solution. Each solution shows only the contents available for that solution.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	/**
	 * used to flag the User Generated Contents.
	 */
	//#SWG#@ApiModelProperty(value = """used to flag the User Generated Contents.""")
	@BeanProperty 
	var contentUGC: Boolean =_
	def withcontentUGC(p:Boolean):this.type ={ 	this.contentUGC = p; 	this }

	/**
	 * The specific channel for the thumbnails.
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """The specific channel for the thumbnails.""")
	var thumbChannel: MChannel =_
	  def withthumbChannel(p:MChannel):this.type ={ 	this.thumbChannel = p; 	this }

	/**
	 * the original uploaded file properties. calculated using the Repository services.
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """the original uploaded file properties. calculated using the Repository services.""")
	var sourceFiles: List[MFile] = new ArrayList[MFile]
	  def withsourceFiles(p:List[MFile]):this.type ={ 	this.sourceFiles = p; 	this }

	/**
	 * Used as link to the source files in repository used in past. The current source
	 * files is moved in this list when the user call the service JDashboard.
	 * replaceSourceFiles
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """Used as link to the source files in repository used in past. The current source files is moved in this list when the user call the service JDashboard.replaceSourceFiles""")
	var sourcefilesOldVersions: List[MFile] = new ArrayList[MFile]
	  def withsourcefilesOldVersions(p:List[MFile]):this.type ={ 	this.sourcefilesOldVersions = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var channels: List[MChannel] = new ArrayList[MChannel]
	  def withchannels(p:List[MChannel]):this.type ={ 	this.channels = p; 	this }

	/**
	 * @return MEContentStatus
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getStatus():MEContentStatus ={
		//todo: should be equal to MWeeboProvider.UpdateStatus
		import scala.collection.JavaConversions._
		var result:Option[MEContentStatus] = None
	
		def statusInProgress(channelStatus:MEPublishingStatus)= {
		  (channelStatus == MEPublishingStatus.INGESTION_INPROGRESS || channelStatus == MEPublishingStatus.PACKAGING_INPROGRESS)
		}
		def statusInPublishing(channelStatus:MEPublishingStatus)= channelStatus == MEPublishingStatus.PUBLISHING_INPROGRESS
		def statusPublished(channelStatus:MEPublishingStatus)= {
		  (channelStatus == MEPublishingStatus.PUBLISHED || channelStatus == MEPublishingStatus.PUBLISHED_THUMBNAIL)
		}
		// the thumbs are published when the channel does not exists or there is a process to replace thumbs in act.
		def statusThumbPublished(channelStatus:MEPublishingStatus)= {
		  (channelStatus == MEPublishingStatus.PUBLISHED || channelStatus == MEPublishingStatus.PUBLISHED_THUMBNAIL ||
		   channelStatus == MEPublishingStatus.PACKAGED_THUMBNAIL || channelStatus == MEPublishingStatus.PACKAGED_THUMBNAIL_ERROR ||
		   channelStatus == MEPublishingStatus.PACKAGED_THUMBNAIL_INPROGRESS
		  )
		}
		def statusThumbInError(channelStatus:MEPublishingStatus)= {
			  (channelStatus == MEPublishingStatus.PACKAGED_ERROR || channelStatus == MEPublishingStatus.PUBLISHED_ERROR)
		}
	
		//DRAFT if all channels are empty
		result = result.orElse(
		  if(channels.isEmpty)  Some(MEContentStatus.DRAFT)
		  else None
		)
		// error when exists one channel in error (also thumbs channel)
		result = result.orElse(
		  if(channels.exists(el => el.status.toString.indexOf("ERROR") > -1)||
			 Option(thumbChannel).exists(tc=> statusThumbInError(tc.status))
			)  Some(MEContentStatus.ERROR)
		  else None
		)
		// INGESTION_INPROGRESS if exists one channel in progress
		result = result.orElse(
		  if(channels.exists(el=> statusInProgress(el.status))||(Option(thumbChannel).exists(tc=> statusInProgress(tc.status)))){
					  Some(MEContentStatus.INGESTION_IN_PROGRESS)
				}else None
		)
		 // PUBLISHING_INPROGRESS if exists one channel in progress
		result = result.orElse(
		  if(channels.exists(el=> statusInPublishing(el.status))||(Option(thumbChannel).exists(tc=> statusInPublishing(tc.status)))){
					  Some(MEContentStatus.PUBLISH_IN_PROGRESS)
				}else None
		)
		// UNPUBLISHING_IN_PROGRESS if the content is not in progress and the channels are published
		result = result.orElse(
		  if(channels.exists(el => el.status == MEPublishingStatus.UNPUBLISHING_INPROGRESS)) Some(MEContentStatus.UNPUBLISHING_IN_PROGRESS)
		  else None
		)
		// READY if exists one channel packaged or thumbs are packaged
		result = result.orElse(
		  if(channels.exists(el => el.status == MEPublishingStatus.PACKAGED) || Option(thumbChannel).exists(tc => tc.status == MEPublishingStatus.PACKAGED)) Some(MEContentStatus.READY)
		  else None
		)
		// PUBLISHED if the content is not in progress and the channels are published
		result = result.orElse(
		  if(channels.exists(el => statusPublished(el.status)) &&
			Option(thumbChannel).forall(tc=> statusThumbPublished(tc.status))
		  ) Some(MEContentStatus.PUBLISHED)
		  else None
		)
		result.getOrElse(MEContentStatus.DRAFT)
	}

	/**
	 * @return MChannel
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getAllChannels():List[MChannel] ={
		import scala.collection.JavaConversions._
		this.channels ++ Option(this.thumbChannel)
	}

}
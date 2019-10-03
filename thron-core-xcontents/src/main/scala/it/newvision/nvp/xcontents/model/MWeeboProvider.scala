package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MWeeboProvider") 
@XmlType(name="MWeeboProvider")
//#SWG#@ApiModel(description = """""")
class MWeeboProvider extends MProvider with Serializable  {

	/**
	 * DEPRECATED.
	 * available channels in xpublisher. List of comma separated values.
	 * To know the list of channels is defined in weeboChannels attribute (the channes
	 * with status PUBLISHED).
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#available channels in xpublisher. List of comma separated values.
	//#SWGNL#To know the list of channels is defined in weeboChannels attribute (the channes with status PUBLISHED).""")
	@BeanProperty 
	@Deprecated
	var channels: String =_
	@Deprecated
	def withchannels(p:String):this.type ={ 	this.channels = p; 	this }

	/**
	 * the published Id of the content published in Weebo
	 */
	//#SWG#@ApiModelProperty(value = """the published Id of the content published in Weebo""" ,required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId") 
	var pContentId: String =_
	def withpContentId(p:String):this.type ={ 	this.pContentId = p; 	this }

	/**
	 * The total number of versions for the content.
	 * Each version corresponds to a replacement of the  source file
	 */
	//#SWG#@ApiModelProperty(value = """The total number of versions for the content. 
	//#SWGNL#Each version corresponds to a replacement of the  source file""")
	@BeanProperty 
	var totalVersions: Integer =_
	def withtotalVersions(p:Integer):this.type ={ 	this.totalVersions = p; 	this }

	/**
	 * the list of channels where the content is published
	 */
	//#SWG#@ApiModelProperty(value = """the list of channels where the content is published""")
	@BeanProperty 
	var weeboChannels: List[MWeeboChannel] = new ArrayList[MWeeboChannel]
	def withweeboChannels(p:List[MWeeboChannel]):this.type ={ 	this.weeboChannels = p; 	this }

	/**
	 * the thumbnail channel
	 */
	//#SWG#@ApiModelProperty(value = """the thumbnail channel""")
	@BeanProperty 
	var weeboThumbChannel: MWeeboChannel =_
	def withweeboThumbChannel(p:MWeeboChannel):this.type ={ 	this.weeboThumbChannel = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//(pContentId != null)
		Option(pContentId).exists(_.length<=50) && 
		Option(channels).forall(_.length<=500)
	}

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def updateChannels(){
		import scala.collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isEmpty(this.channels)) {
		  this.channels = this.weeboChannels.filter(_.status==MEWeeboChannelStatus.PUBLISHED).map(_.channelType).mkString(",")
		}
	}

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def updateStatus(){
		//todo: should be equal to MMEdiaContent.getStatus
		import scala.collection.JavaConversions._
		var result:Option[String] = None
	
		def statusInProgress(channelStatus:MEWeeboChannelStatus)= {
		  (channelStatus == MEWeeboChannelStatus.INGESTION_INPROGRESS || channelStatus == MEWeeboChannelStatus.PACKAGING_INPROGRESS)
		}
		def statusInPublishing(channelStatus:MEWeeboChannelStatus)= channelStatus == MEWeeboChannelStatus.PUBLISHING_INPROGRESS
		def statusPublished(channelStatus:MEWeeboChannelStatus)= {
		  (channelStatus == MEWeeboChannelStatus.PUBLISHED || channelStatus == MEWeeboChannelStatus.PUBLISHED_THUMBNAIL)
		}
		// the thumbs are published when the channel does not exists or there is a process to replace thumbs in act.
		def statusThumbPublished(channelStatus:MEWeeboChannelStatus)= {
		  (channelStatus == MEWeeboChannelStatus.PUBLISHED || channelStatus == MEWeeboChannelStatus.PUBLISHED_THUMBNAIL ||
		   channelStatus == MEWeeboChannelStatus.PACKAGED_THUMBNAIL || channelStatus == MEWeeboChannelStatus.PACKAGED_THUMBNAIL_ERROR ||
		   channelStatus == MEWeeboChannelStatus.PACKAGED_THUMBNAIL_INPROGRESS
		  )
		}
		def statusThumbInError(channelStatus:MEWeeboChannelStatus)= {
		  (channelStatus == MEWeeboChannelStatus.PACKAGED_ERROR || channelStatus == MEWeeboChannelStatus.PUBLISHED_ERROR )
		}
	
		//DRAFT if all channels are empty
		result = result.orElse(
		  if(this.weeboChannels.isEmpty)  Some("DRAFT")
		  else None
		)
		// error when exists one channel in error (also thumbs channel)
		result = result.orElse(
		  if(this.weeboChannels.exists(el => el.status.toString.indexOf("ERROR") > -1) ||
			Option(this.weeboThumbChannel).exists(tc=> statusThumbInError(tc.status))
			)  Some("ERROR")
		  else None
		)
		// INGESTION_INPROGRESS if exists one channel in progress
		result = result.orElse(
		  if(this.weeboChannels.exists(el=> statusInProgress(el.status))||(Option(this.weeboThumbChannel).exists(tc=> statusInProgress(tc.status)))){
				Some("INGESTION_IN_PROGRESS")
			}else None
		)
		 // PUBLISHING_INPROGRESS if exists one channel in progress
		result = result.orElse(
		  if(this.weeboChannels.exists(el=> statusInPublishing(el.status))||(Option(weeboThumbChannel).exists(tc=> statusInPublishing(tc.status)))){
				Some("PUBLISH_IN_PROGRESS")
			}else None
		)
		// UNPUBLISHING_INPROGRESS if exists one channel in progress
		result = result.orElse(
		  if(this.weeboChannels.exists(el => el.status == MEWeeboChannelStatus.UNPUBLISHING_INPROGRESS)) Some("UNPUBLISHING_IN_PROGRESS")
		  else None
		)
		// READY if exists one channel packaged or thumbs are packaged
		result = result.orElse(
		  if(this.weeboChannels.exists(el => el.status == MEWeeboChannelStatus.PACKAGED)||(Option(this.weeboThumbChannel).exists(tc=> tc.status == MEWeeboChannelStatus.PACKAGED))){
			  Some("READY")
		  }else None
		)
		// PUBLISHED if the content is not in progress and the channels are published
		result = result.orElse(
		  if(this.weeboChannels.exists(el => statusPublished(el.status)) &&
			Option(this.weeboThumbChannel).forall(tc=> statusThumbPublished(tc.status))
		  ) Some("PUBLISHED")
		  else None
		)
		this.status = result.getOrElse("DRAFT")
	}

	/**
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def updateStatusForImage(){
		import scala.collection.JavaConversions._
		var result: Option[String] = None
	
		def statusInProgress(channelStatus: MEWeeboChannelStatus) = {
			(channelStatus == MEWeeboChannelStatus.INGESTION_INPROGRESS ||
				channelStatus == MEWeeboChannelStatus.PACKAGING_INPROGRESS ||
				channelStatus == MEWeeboChannelStatus.PACKAGED_THUMBNAIL_INPROGRESS)
		}
	
		def statusInPublishing(channelStatus: MEWeeboChannelStatus) = channelStatus == MEWeeboChannelStatus.PUBLISHING_INPROGRESS
	
		def statusPublished(channelStatus: MEWeeboChannelStatus) = {
			(channelStatus == MEWeeboChannelStatus.PUBLISHED || channelStatus == MEWeeboChannelStatus.PUBLISHED_THUMBNAIL)
		}
	
		def statusThumbInError(channelStatus: MEWeeboChannelStatus) = {
			(channelStatus == MEWeeboChannelStatus.PACKAGED_ERROR ||
				channelStatus == MEWeeboChannelStatus.PUBLISHED_ERROR ||
				channelStatus == MEWeeboChannelStatus.PACKAGED_THUMBNAIL_ERROR)
		}
	
		//DRAFT if all channels are empty
		result = result.orElse(
			if (this.weeboChannels.isEmpty) Some("DRAFT")
			else None
		)
		// error when exists one channel in error (also thumbs channel)
		result = result.orElse(
			if (this.weeboChannels.exists(el => el.status.toString.indexOf("ERROR") > -1) ||
				Option(this.weeboThumbChannel).exists(tc => statusThumbInError(tc.status))
			) Some("ERROR")
			else None
		)
		// INGESTION_INPROGRESS if exists one channel in progress
		result = result.orElse(
			if (this.weeboChannels.exists(el => statusInProgress(el.status)) || (Option(this.weeboThumbChannel).exists(tc => statusInProgress(tc.status)))) {
				Some("INGESTION_IN_PROGRESS")
			} else None
		)
		// PUBLISHING_INPROGRESS if exists one channel in progress
		result = result.orElse(
			if (this.weeboChannels.exists(el => statusInPublishing(el.status)) || (Option(weeboThumbChannel).exists(tc => statusInPublishing(tc.status)))) {
				Some("PUBLISH_IN_PROGRESS")
			} else None
		)
		// UNPUBLISHING_INPROGRESS if exists one channel in progress
		result = result.orElse(
			if (this.weeboChannels.exists(el => el.status == MEWeeboChannelStatus.UNPUBLISHING_INPROGRESS)) Some("UNPUBLISHING_IN_PROGRESS")
			else None
		)
		// READY if exists one channel packaged or thumbs are packaged
		result = result.orElse(
			if (this.weeboChannels.exists(el => el.status == MEWeeboChannelStatus.PACKAGED) ||
				(Option(this.weeboThumbChannel).exists(tc => tc.status == MEWeeboChannelStatus.PACKAGED_THUMBNAIL))) {
				Some("READY")
			} else None
		)
		// PUBLISHED if the content is not in progress and the channels are published
		result = result.orElse(
			if (this.weeboChannels.exists(el => statusPublished(el.status)) &&
				Option(this.weeboThumbChannel).forall(tc => statusPublished(tc.status))
			) Some("PUBLISHED")
			else None
		)
		this.status = result.getOrElse("DRAFT")
	}

}
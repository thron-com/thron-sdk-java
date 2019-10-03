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
 * This is the channel descriptor. During a Publishing process, the user can
 * publish a content to a channel, and each channel has a set of packaged task.
 * usually one packaged task. MediaContent provides all the necessary information
 * of the published content, and the current status of the content.
 */
@XmlRootElement(name="MChannel") 
@XmlType(name="MChannel")
//#SWG#@ApiModel(description = """This is the channel descriptor. During a Publishing process, the user can publish a content to a channel, and each channel has a set of packaged task. usually one packaged task. MediaContent provides all the necessary information of the published content, and the current status of the content.""")
class MChannel extends Serializable {

	/**
	 * DEPRECATED.
	 * user to store the packageId of the process that change the thumbnail in cdn.
	 * Only available for MMediaContent.thumbChannel
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#user to store the packageId of the process that change the thumbnail in cdn.
	//#SWGNL#Only available for MMediaContent.thumbChannel""" ,required = true)
	@BeanProperty 
	@Deprecated
	var changethumbnailPkId: String =_
	@Deprecated
	def withchangethumbnailPkId(p:String):this.type ={ 	this.changethumbnailPkId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

	/**
	 * Finish Time of the publishing process for the current channel
	 */
	//#SWG#@ApiModelProperty(value = """Finish Time of the publishing process for the current channel""")
	@BeanProperty 
	var finishTime: Date =_
	def withfinishTime(p:Date):this.type ={ 	this.finishTime = p; 	this }

	/**
	 * it's the main package Id of the packaging process used to prepare the content
	 * before the publishing process.
	 * Each publishing process is specific for a channel type
	 */
	//#SWG#@ApiModelProperty(value = """it's the main package Id of the packaging process used to prepare the content before the publishing process. 
	//#SWGNL#Each publishing process is specific for a channel type""")
	@BeanProperty 
	var packagedId: String =_
	def withpackagedId(p:String):this.type ={ 	this.packagedId = p; 	this }

	/**
	 * Start Time of the publishing process for the current channel
	 */
	//#SWG#@ApiModelProperty(value = """Start Time of the publishing process for the current channel""" ,required = true)
	@BeanProperty 
	var startTime: Date  = new Date
	def withstartTime(p:Date):this.type ={ 	this.startTime = p; 	this }

	/**
	 * Indicates the percentage of the conversion process. The value is automatically
	 * calculated and never stored in the database. The value is calculated only for
	 * the detailMediaContent service.
	 */
	//#SWG#@ApiModelProperty(value = """Indicates the percentage of the conversion process. The value is automatically calculated and never stored in the database. The value is calculated only for the detailMediaContent service.""")
	@BeanProperty 
	var stateOfProgress: Integer =_
	def withstateOfProgress(p:Integer):this.type ={ 	this.stateOfProgress = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEPublishingStatus  = MEPublishingStatus.UPLOADED
	def withstatus(p:MEPublishingStatus):this.type ={ 	this.status = p; 	this }

}
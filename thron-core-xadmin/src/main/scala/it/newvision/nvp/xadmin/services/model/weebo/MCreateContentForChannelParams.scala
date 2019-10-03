package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCreateContentForChannelParams") 
@XmlType(name="MCreateContentForChannelParams")
//#SWG#@ApiModel(description = """""")
class MCreateContentForChannelParams extends Serializable {

	/**
	 * The channel code where the content should be published.
	 */
	//#SWG#@ApiModelProperty(value = """The channel code where the content should be published.""" ,required = true)
	@BeanProperty 
	var channel: String =_
	def withchannel(p:String):this.type ={ 	this.channel = p; 	this }

	/**
	 * the source File Descriptor. 
	 */
	//#SWG#@ApiModelProperty(value = """the source File Descriptor. """)
	@BeanProperty 
	var file: List[MFile] = new ArrayList[MFile]
	def withfile(p:List[MFile]):this.type ={ 	this.file = p; 	this }

	/**
	 * Optional. Used to publish a new video from the recorded video file of a live
	 * Event. It's necessary to know the liveEvent xcontentId.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to publish a new video from the recorded video file of a live Event. It's necessary to know the liveEvent xcontentId.""")
	@BeanProperty 
	var liveEventRec: MLiveEventRecParams =_
	def withliveEventRec(p:MLiveEventRecParams):this.type ={ 	this.liveEventRec = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var mediaContentId: String =_
	@Deprecated
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var newFileName: String =_
	def withnewFileName(p:String):this.type ={ 	this.newFileName = p; 	this }

	/**
	 * the content Id.
	 */
	//#SWG#@ApiModelProperty(value = """the content Id.""")
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}
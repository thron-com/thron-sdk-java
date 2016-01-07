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
/**
 * This is the channel descriptor. During a Publishing process, the user can
 * publish a content to a channel, and each channel has a set of packaged task.
 * usually one packaged task. MediaContent provides all the necessary information
 * of the published content, and the current status of the content.
 */
@XmlRootElement(name="MWeeboChannel") 
@XmlType(name="MWeeboChannel")
//#SWG#@ApiModel(description = """This is the channel descriptor. During a Publishing process, the user can publish a content to a channel, and each channel has a set of packaged task. usually one packaged task. MediaContent provides all the necessary information of the published content, and the current status of the content.""")
class MWeeboChannel extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):MWeeboChannel ={ 	this.channelType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEWeeboChannelStatus  = MEWeeboChannelStatus.UPLOADED
	def withstatus(p:MEWeeboChannelStatus):MWeeboChannel ={ 	this.status = p; 	this }

}
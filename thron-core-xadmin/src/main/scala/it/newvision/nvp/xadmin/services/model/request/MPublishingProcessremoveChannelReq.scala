package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JPublishingProcess.removeChannel
 */
@XmlRootElement(name="MPublishingProcessremoveChannelReq")
@XmlType(name="MPublishingProcessremoveChannelReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.removeChannel")
class MPublishingProcessremoveChannelReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channel: String =_
	def withchannel(p:String):this.type ={ 	this.channel = p; 	this }

}
package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.playlist.MContentList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisherAdmin.getContentsForPlayList
 */
@XmlRootElement(name="MWeeboPublisherAdmingetContentsForPlayListReq")
@XmlType(name="MWeeboPublisherAdmingetContentsForPlayListReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisherAdmin.getContentsForPlayList")
class MWeeboPublisherAdmingetContentsForPlayListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentIds: MContentList =_
	def withcontentIds(p:MContentList):this.type ={ 	this.contentIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channelType: String =_
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfReults: Integer =_
	def withnumberOfReults(p:Integer):this.type ={ 	this.numberOfReults = p; 	this }

}
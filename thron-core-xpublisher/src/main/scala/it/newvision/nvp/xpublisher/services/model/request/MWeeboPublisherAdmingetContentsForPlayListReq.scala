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
	def withclientId(p:String):MWeeboPublisherAdmingetContentsForPlayListReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentIds: MContentList =_
	def withcontentIds(p:MContentList):MWeeboPublisherAdmingetContentsForPlayListReq ={ 	this.contentIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var channelType: String =_
	def withchannelType(p:String):MWeeboPublisherAdmingetContentsForPlayListReq ={ 	this.channelType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MWeeboPublisherAdmingetContentsForPlayListReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfReults: Integer =_
	def withnumberOfReults(p:Integer):MWeeboPublisherAdmingetContentsForPlayListReq ={ 	this.numberOfReults = p; 	this }

}
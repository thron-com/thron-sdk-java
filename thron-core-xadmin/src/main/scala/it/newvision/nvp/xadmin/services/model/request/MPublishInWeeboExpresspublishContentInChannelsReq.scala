package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishInChannelsParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishContentInChannels
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishContentInChannelsReq")
@XmlType(name="MPublishInWeeboExpresspublishContentInChannelsReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishContentInChannels")
class MPublishInWeeboExpresspublishContentInChannelsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishInWeeboExpresspublishContentInChannelsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishInChannelsParams =_
	def withparam(p:MPublishInChannelsParams):MPublishInWeeboExpresspublishContentInChannelsReq ={ 	this.param = p; 	this }

}
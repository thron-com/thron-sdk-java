package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MCreateContentForChannelParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.createContentForChannel
 */
@XmlRootElement(name="MPublishingProcesscreateContentForChannelReq")
@XmlType(name="MPublishingProcesscreateContentForChannelReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.createContentForChannel")
class MPublishingProcesscreateContentForChannelReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MCreateContentForChannelParams =_
	def withparam(p:MCreateContentForChannelParams):this.type ={ 	this.param = p; 	this }

}
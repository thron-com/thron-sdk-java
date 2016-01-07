package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MContentPageletParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.newPageletContent
 */
@XmlRootElement(name="MPublishingProcessnewPageletContentReq")
@XmlType(name="MPublishingProcessnewPageletContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.newPageletContent")
class MPublishingProcessnewPageletContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishingProcessnewPageletContentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MContentPageletParams =_
	def withparam(p:MContentPageletParams):MPublishingProcessnewPageletContentReq ={ 	this.param = p; 	this }

}
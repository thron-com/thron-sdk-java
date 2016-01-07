package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MContentParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.newContent
 */
@XmlRootElement(name="MPublishingProcessnewContentReq")
@XmlType(name="MPublishingProcessnewContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.newContent")
class MPublishingProcessnewContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishingProcessnewContentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MContentParams =_
	def withparam(p:MContentParams):MPublishingProcessnewContentReq ={ 	this.param = p; 	this }

}
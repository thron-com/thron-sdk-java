package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishExpressVideoParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishVideo
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishVideoReq")
@XmlType(name="MPublishInWeeboExpresspublishVideoReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishVideo")
class MPublishInWeeboExpresspublishVideoReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishInWeeboExpresspublishVideoReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishExpressVideoParams =_
	def withparam(p:MPublishExpressVideoParams):MPublishInWeeboExpresspublishVideoReq ={ 	this.param = p; 	this }

}
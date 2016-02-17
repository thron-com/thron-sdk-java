package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishPageletParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishPagelet
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishPageletReq")
@XmlType(name="MPublishInWeeboExpresspublishPageletReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishPagelet")
class MPublishInWeeboExpresspublishPageletReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishPageletParams =_
	def withparam(p:MPublishPageletParams):this.type ={ 	this.param = p; 	this }

}
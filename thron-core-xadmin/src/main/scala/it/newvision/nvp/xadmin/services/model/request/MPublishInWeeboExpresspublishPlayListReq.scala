package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishExpressPlayListParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishPlayList
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishPlayListReq")
@XmlType(name="MPublishInWeeboExpresspublishPlayListReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishPlayList")
class MPublishInWeeboExpresspublishPlayListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishInWeeboExpresspublishPlayListReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishExpressPlayListParams =_
	def withparam(p:MPublishExpressPlayListParams):MPublishInWeeboExpresspublishPlayListReq ={ 	this.param = p; 	this }

}
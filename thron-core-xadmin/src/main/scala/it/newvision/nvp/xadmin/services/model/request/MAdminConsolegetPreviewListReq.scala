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
 * Request message for service JAdminConsole.getPreviewList
 */
@XmlRootElement(name="MAdminConsolegetPreviewListReq")
@XmlType(name="MAdminConsolegetPreviewListReq")
//#SWG#@ApiModel(description = "Request message for service JAdminConsole.getPreviewList")
class MAdminConsolegetPreviewListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAdminConsolegetPreviewListReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MAdminConsolegetPreviewListReq ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var tokenId: String =_
	def withtokenId(p:String):MAdminConsolegetPreviewListReq ={ 	this.tokenId = p; 	this }

}
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
 * Request message for service JEventManager.addClientStreamWithPassword
 */
@XmlRootElement(name="MEventManageraddClientStreamWithPasswordReq")
@XmlType(name="MEventManageraddClientStreamWithPasswordReq")
//#SWG#@ApiModel(description = "Request message for service JEventManager.addClientStreamWithPassword")
class MEventManageraddClientStreamWithPasswordReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientStream: String =_
	def withclientStream(p:String):this.type ={ 	this.clientStream = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientStreamPassword: String =_
	def withclientStreamPassword(p:String):this.type ={ 	this.clientStreamPassword = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

}
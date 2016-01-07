package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.common.MSource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.updateImage
 */
@XmlRootElement(name="MVUserManagerupdateImageReq")
@XmlType(name="MVUserManagerupdateImageReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.updateImage")
class MVUserManagerupdateImageReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerupdateImageReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MVUserManagerupdateImageReq ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var buffer: MSource =_
	def withbuffer(p:MSource):MVUserManagerupdateImageReq ={ 	this.buffer = p; 	this }

}
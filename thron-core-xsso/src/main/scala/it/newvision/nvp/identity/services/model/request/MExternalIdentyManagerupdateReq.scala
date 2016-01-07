package it.newvision.nvp.identity.services.model.request
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
 * Request message for service JExternalIdentyManager.update
 */
@XmlRootElement(name="MExternalIdentyManagerupdateReq")
@XmlType(name="MExternalIdentyManagerupdateReq")
//#SWG#@ApiModel(description = "Request message for service JExternalIdentyManager.update")
class MExternalIdentyManagerupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MExternalIdentyManagerupdateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MExternalIdentyManagerupdateReq ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var password: String =_
	def withpassword(p:String):MExternalIdentyManagerupdateReq ={ 	this.password = p; 	this }

}
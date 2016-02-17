package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JClient.updateSecureConnectionEnabled
 */
@XmlRootElement(name="MClientupdateSecureConnectionEnabledReq")
@XmlType(name="MClientupdateSecureConnectionEnabledReq")
//#SWG#@ApiModel(description = "Request message for service JClient.updateSecureConnectionEnabled")
class MClientupdateSecureConnectionEnabledReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var secureConnectionEnabled: Boolean =_
	def withsecureConnectionEnabled(p:Boolean):this.type ={ 	this.secureConnectionEnabled = p; 	this }

}
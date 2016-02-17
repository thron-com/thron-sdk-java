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
 * Request message for service JIdentityAdmin.whois
 */
@XmlRootElement(name="MIdentityAdminwhoisReq")
@XmlType(name="MIdentityAdminwhoisReq")
//#SWG#@ApiModel(description = "Request message for service JIdentityAdmin.whois")
class MIdentityAdminwhoisReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var tokenId: String =_
	def withtokenId(p:String):this.type ={ 	this.tokenId = p; 	this }

}
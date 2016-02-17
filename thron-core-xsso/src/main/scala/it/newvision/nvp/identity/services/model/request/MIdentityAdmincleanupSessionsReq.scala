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
 * Request message for service JIdentityAdmin.cleanupSessions
 */
@XmlRootElement(name="MIdentityAdmincleanupSessionsReq")
@XmlType(name="MIdentityAdmincleanupSessionsReq")
//#SWG#@ApiModel(description = "Request message for service JIdentityAdmin.cleanupSessions")
class MIdentityAdmincleanupSessionsReq extends Serializable {

	/**
	 * Used to limit the scope. Value can be a csv of clientIds
	 */
	//#SWG#@ApiModelProperty(value = """Used to limit the scope. Value can be a csv of clientIds""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

}
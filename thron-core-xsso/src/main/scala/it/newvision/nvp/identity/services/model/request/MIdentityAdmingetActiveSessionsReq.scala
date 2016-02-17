package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.identity.MSessionCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIdentityAdmin.getActiveSessions
 */
@XmlRootElement(name="MIdentityAdmingetActiveSessionsReq")
@XmlType(name="MIdentityAdmingetActiveSessionsReq")
//#SWG#@ApiModel(description = "Request message for service JIdentityAdmin.getActiveSessions")
class MIdentityAdmingetActiveSessionsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MSessionCriteria =_
	def withcriteria(p:MSessionCriteria):this.type ={ 	this.criteria = p; 	this }

}
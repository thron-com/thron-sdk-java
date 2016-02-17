package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MVUserCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.remove
 */
@XmlRootElement(name="MVUserManagerremoveReq")
@XmlType(name="MVUserManagerremoveReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.remove")
class MVUserManagerremoveReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MVUserCriteria =_
	def withcriteria(p:MVUserCriteria):this.type ={ 	this.criteria = p; 	this }

}
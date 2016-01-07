package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEClientStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClient.updateClientStatus
 */
@XmlRootElement(name="MClientupdateClientStatusReq")
@XmlType(name="MClientupdateClientStatusReq")
//#SWG#@ApiModel(description = "Request message for service JClient.updateClientStatus")
class MClientupdateClientStatusReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MClientupdateClientStatusReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var status: MEClientStatus =_
	def withstatus(p:MEClientStatus):MClientupdateClientStatusReq ={ 	this.status = p; 	this }

}
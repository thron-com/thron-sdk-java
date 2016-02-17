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
 * Request message for service JClient.updateAuditDurationDays
 */
@XmlRootElement(name="MClientupdateAuditDurationDaysReq")
@XmlType(name="MClientupdateAuditDurationDaysReq")
//#SWG#@ApiModel(description = "Request message for service JClient.updateAuditDurationDays")
class MClientupdateAuditDurationDaysReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var auditDurationDays: Integer =_
	def withauditDurationDays(p:Integer):this.type ={ 	this.auditDurationDays = p; 	this }

}
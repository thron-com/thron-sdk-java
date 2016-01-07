package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppSubscriptionData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsUtils.updateSubscriptionData
 */
@XmlRootElement(name="MAppsUtilsupdateSubscriptionDataReq")
@XmlType(name="MAppsUtilsupdateSubscriptionDataReq")
//#SWG#@ApiModel(description = "Request message for service JAppsUtils.updateSubscriptionData")
class MAppsUtilsupdateSubscriptionDataReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsUtilsupdateSubscriptionDataReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsUtilsupdateSubscriptionDataReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MAppSubscriptionData =_
	def withupdate(p:MAppSubscriptionData):MAppsUtilsupdateSubscriptionDataReq ={ 	this.update = p; 	this }

}
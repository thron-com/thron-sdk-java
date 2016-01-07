package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.response.MQuotaCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JWeeboPublisher.getQuotaUsageByUserId
 */
@XmlRootElement(name="MWeeboPublishergetQuotaUsageByUserIdReq")
@XmlType(name="MWeeboPublishergetQuotaUsageByUserIdReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboPublisher.getQuotaUsageByUserId")
class MWeeboPublishergetQuotaUsageByUserIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboPublishergetQuotaUsageByUserIdReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MQuotaCriteria =_
	def withcriteria(p:MQuotaCriteria):MWeeboPublishergetQuotaUsageByUserIdReq ={ 	this.criteria = p; 	this }

}
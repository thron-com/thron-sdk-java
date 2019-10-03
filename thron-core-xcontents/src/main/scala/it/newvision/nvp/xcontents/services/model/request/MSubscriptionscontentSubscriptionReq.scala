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
 * Request message for service JSubscriptions.contentSubscription
 */
@XmlRootElement(name="MSubscriptionscontentSubscriptionReq")
@XmlType(name="MSubscriptionscontentSubscriptionReq")
//#SWG#@ApiModel(description = "Request message for service JSubscriptions.contentSubscription")
class MSubscriptionscontentSubscriptionReq extends Serializable {

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * revoke the subscription to the given content.
	 */
	//#SWG#@ApiModelProperty(value = """revoke the subscription to the given content.""", required = true)
	@BeanProperty
	var revokeSubscription: Boolean =_
	def withrevokeSubscription(p:Boolean):this.type ={ 	this.revokeSubscription = p; 	this }

}
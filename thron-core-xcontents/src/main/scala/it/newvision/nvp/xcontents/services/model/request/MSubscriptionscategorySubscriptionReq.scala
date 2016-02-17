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
 * Request message for service JSubscriptions.categorySubscription
 */
@XmlRootElement(name="MSubscriptionscategorySubscriptionReq")
@XmlType(name="MSubscriptionscategorySubscriptionReq")
//#SWG#@ApiModel(description = "Request message for service JSubscriptions.categorySubscription")
class MSubscriptionscategorySubscriptionReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	/**
	 * revoke the subscription to the given category
	 */
	//#SWG#@ApiModelProperty(value = """revoke the subscription to the given category""", required = true)
	@BeanProperty
	var revokeSubscription: Boolean =_
	def withrevokeSubscription(p:Boolean):this.type ={ 	this.revokeSubscription = p; 	this }

}
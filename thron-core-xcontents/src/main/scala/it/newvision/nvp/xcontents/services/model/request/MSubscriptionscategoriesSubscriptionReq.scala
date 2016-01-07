package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.category.MCategoryIds

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSubscriptions.categoriesSubscription
 */
@XmlRootElement(name="MSubscriptionscategoriesSubscriptionReq")
@XmlType(name="MSubscriptionscategoriesSubscriptionReq")
//#SWG#@ApiModel(description = "Request message for service JSubscriptions.categoriesSubscription")
class MSubscriptionscategoriesSubscriptionReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MSubscriptionscategoriesSubscriptionReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryList: MCategoryIds =_
	def withcategoryList(p:MCategoryIds):MSubscriptionscategoriesSubscriptionReq ={ 	this.categoryList = p; 	this }

	/**
	 * revoke the subscription to the categories
	 */
	//#SWG#@ApiModelProperty(value = """revoke the subscription to the categories""", required = true)
	@BeanProperty
	var revokeSubscription: Boolean =_
	def withrevokeSubscription(p:Boolean):MSubscriptionscategoriesSubscriptionReq ={ 	this.revokeSubscription = p; 	this }

	/**
	 * Optional. used to subscribe a given user to the category
	 */
	//#SWG#@ApiModelProperty(value = """Optional. used to subscribe a given user to the category""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MSubscriptionscategoriesSubscriptionReq ={ 	this.username = p; 	this }

}
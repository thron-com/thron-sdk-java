package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.MDateRange

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JBilling.billingInfo
 */
@XmlRootElement(name="MBillingbillingInfoReq")
@XmlType(name="MBillingbillingInfoReq")
//#SWG#@ApiModel(description = "Request message for service JBilling.billingInfo")
class MBillingbillingInfoReq extends Serializable {

	/**
	 * list of clientIds as comma separated value
	 */
	//#SWG#@ApiModelProperty(value = """list of clientIds as comma separated value""", required = true)
	@BeanProperty
	var clientIds: String =_
	def withclientIds(p:String):this.type ={ 	this.clientIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var timeRange: MDateRange =_
	def withtimeRange(p:MDateRange):this.type ={ 	this.timeRange = p; 	this }

}
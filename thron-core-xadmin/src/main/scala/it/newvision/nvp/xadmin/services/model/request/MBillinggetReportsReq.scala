package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.billing.MBillingReportCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JBilling.getReports
 */
@XmlRootElement(name="MBillinggetReportsReq")
@XmlType(name="MBillinggetReportsReq")
//#SWG#@ApiModel(description = "Request message for service JBilling.getReports")
class MBillinggetReportsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MBillingReportCriteria =_
	def withcriteria(p:MBillingReportCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. Used to filter the result set from the list of BillingItems
	 * (MBillingReport.items)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to filter the result set from the list of BillingItems (MBillingReport.items)""", required = true)
	@BeanProperty
	var withItemsDetail: Boolean =_
	def withwithItemsDetail(p:Boolean):this.type ={ 	this.withItemsDetail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

}
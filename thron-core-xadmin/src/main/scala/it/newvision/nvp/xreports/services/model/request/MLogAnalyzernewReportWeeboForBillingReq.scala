package it.newvision.nvp.xreports.services.model.request
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
 * Request message for service JLogAnalyzer.newReportWeeboForBilling
 */
@XmlRootElement(name="MLogAnalyzernewReportWeeboForBillingReq")
@XmlType(name="MLogAnalyzernewReportWeeboForBillingReq")
//#SWG#@ApiModel(description = "Request message for service JLogAnalyzer.newReportWeeboForBilling")
class MLogAnalyzernewReportWeeboForBillingReq extends Serializable {

	/**
	 * csv list
	 */
	//#SWG#@ApiModelProperty(value = """csv list""", required = true)
	@BeanProperty
	var clientIds: String =_
	def withclientIds(p:String):this.type ={ 	this.clientIds = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

}
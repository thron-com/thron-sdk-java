package it.newvision.nvp.xadmin.services.model.billing
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MBillingReportCriteria") 
@XmlType(name="MBillingReportCriteria")
//#SWG#@ApiModel(description = """""")
class MBillingReportCriteria extends Serializable {

	/**
	 * date rage for MBillingReport.reportFromDate
	 */
	//#SWG#@ApiModelProperty(value = """date rage for MBillingReport.reportFromDate""")
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * date rage for MBillingReport.reportFromDate
	 */
	//#SWG#@ApiModelProperty(value = """date rage for MBillingReport.reportFromDate""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

}
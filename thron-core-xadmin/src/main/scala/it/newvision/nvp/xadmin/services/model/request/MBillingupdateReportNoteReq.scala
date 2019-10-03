package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JBilling.updateReportNote
 */
@XmlRootElement(name="MBillingupdateReportNoteReq")
@XmlType(name="MBillingupdateReportNoteReq")
//#SWG#@ApiModel(description = "Request message for service JBilling.updateReportNote")
class MBillingupdateReportNoteReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var reportId: String =_
	def withreportId(p:String):this.type ={ 	this.reportId = p; 	this }

}
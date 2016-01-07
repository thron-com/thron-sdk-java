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
 * Request message for service JLogAnalyzer.deleteReportResults
 */
@XmlRootElement(name="MLogAnalyzerdeleteReportResultsReq")
@XmlType(name="MLogAnalyzerdeleteReportResultsReq")
//#SWG#@ApiModel(description = "Request message for service JLogAnalyzer.deleteReportResults")
class MLogAnalyzerdeleteReportResultsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MLogAnalyzerdeleteReportResultsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var reportId: String =_
	def withreportId(p:String):MLogAnalyzerdeleteReportResultsReq ={ 	this.reportId = p; 	this }

}
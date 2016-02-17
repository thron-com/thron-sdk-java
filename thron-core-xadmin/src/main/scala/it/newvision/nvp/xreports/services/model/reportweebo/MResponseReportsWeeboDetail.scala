package it.newvision.nvp.xreports.services.model.reportweebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MReportWeebo
import it.newvision.nvp.xreports.services.model.report.MResponseReports

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseReportsWeeboDetail") 
@XmlType(name="MResponseReportsWeeboDetail")
//#SWG#@ApiModel(description = """""")
class MResponseReportsWeeboDetail extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var report: MReportWeebo =_
	def withreport(p:MReportWeebo):this.type ={ 	this.report = p; 	this }

}
package it.newvision.nvp.xreports.services.model.loganalyzer
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MEReportStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLogAnalyzerDetail") 
@XmlType(name="MResponseLogAnalyzerDetail")
//#SWG#@ApiModel(description = """""")
class MResponseLogAnalyzerDetail extends MResponseLogAnalyzer with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEReportStatus =_
	def withstatus(p:MEReportStatus):this.type ={ 	this.status = p; 	this }

}
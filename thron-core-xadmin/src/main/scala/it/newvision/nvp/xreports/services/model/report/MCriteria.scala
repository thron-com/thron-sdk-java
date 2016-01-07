package it.newvision.nvp.xreports.services.model.report
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MEReportType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCriteria") 
@XmlType(name="MCriteria")
//#SWG#@ApiModel(description = """""")
class MCriteria extends MCriteriaForReport with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var reportType: MEReportType =_
	def withreportType(p:MEReportType):MCriteria ={ 	this.reportType = p; 	this }

}
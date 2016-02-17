package it.newvision.nvp.xreports.services.model.report
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MReport

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseReportsFindByProperties") 
@XmlType(name="MResponseReportsFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseReportsFindByProperties extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reports: List[MReport] = new ArrayList[MReport]
	def withreports(p:List[MReport]):this.type ={ 	this.reports = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}
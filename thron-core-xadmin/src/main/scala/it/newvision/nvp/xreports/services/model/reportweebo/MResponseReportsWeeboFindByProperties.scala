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
@XmlRootElement(name="MResponseReportsWeeboFindByProperties") 
@XmlType(name="MResponseReportsWeeboFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseReportsWeeboFindByProperties extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reports: List[MReportWeebo] = new ArrayList[MReportWeebo]
	def withreports(p:List[MReportWeebo]):MResponseReportsWeeboFindByProperties ={ 	this.reports = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseReportsWeeboFindByProperties ={ 	this.totalResults = p; 	this }

}
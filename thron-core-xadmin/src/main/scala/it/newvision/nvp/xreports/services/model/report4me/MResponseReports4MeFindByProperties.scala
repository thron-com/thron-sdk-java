package it.newvision.nvp.xreports.services.model.report4me
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MReport4ME
import it.newvision.nvp.xreports.services.model.report.MResponseReports

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseReports4MeFindByProperties") 
@XmlType(name="MResponseReports4MeFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseReports4MeFindByProperties extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reports: List[MReport4ME] = new ArrayList[MReport4ME]
	def withreports(p:List[MReport4ME]):MResponseReports4MeFindByProperties ={ 	this.reports = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseReports4MeFindByProperties ={ 	this.totalResults = p; 	this }

}
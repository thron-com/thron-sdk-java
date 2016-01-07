package it.newvision.nvp.xreports.services.model.report
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
@XmlRootElement(name="MResult") 
@XmlType(name="MResult")
//#SWG#@ApiModel(description = """""")
class MResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var resultsUrl4CountryCode: List[String] = new ArrayList[String]
	def withresultsUrl4CountryCode(p:List[String]):MResult ={ 	this.resultsUrl4CountryCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var resultsUrl4TimeUnit: List[String] = new ArrayList[String]
	def withresultsUrl4TimeUnit(p:List[String]):MResult ={ 	this.resultsUrl4TimeUnit = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEReportStatus =_
	def withstatus(p:MEReportStatus):MResult ={ 	this.status = p; 	this }

}
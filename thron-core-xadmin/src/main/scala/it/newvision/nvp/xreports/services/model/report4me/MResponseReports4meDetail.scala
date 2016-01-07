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
@XmlRootElement(name="MResponseReports4meDetail") 
@XmlType(name="MResponseReports4meDetail")
//#SWG#@ApiModel(description = """""")
class MResponseReports4meDetail extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var report: MReport4ME =_
	def withreport(p:MReport4ME):MResponseReports4meDetail ={ 	this.report = p; 	this }

}
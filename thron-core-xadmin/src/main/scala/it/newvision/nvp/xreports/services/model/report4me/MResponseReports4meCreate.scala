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
@XmlRootElement(name="MResponseReports4meCreate") 
@XmlType(name="MResponseReports4meCreate")
//#SWG#@ApiModel(description = """""")
class MResponseReports4meCreate extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var report: MReport4ME =_
	def withreport(p:MReport4ME):this.type ={ 	this.report = p; 	this }

}
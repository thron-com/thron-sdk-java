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
@XmlRootElement(name="MResponseReportsUpdate") 
@XmlType(name="MResponseReportsUpdate")
//#SWG#@ApiModel(description = """""")
class MResponseReportsUpdate extends MResponseReports with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var report: MReport =_
	def withreport(p:MReport):this.type ={ 	this.report = p; 	this }

}
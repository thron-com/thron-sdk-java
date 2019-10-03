package it.newvision.nvp.xreports.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.model.MQueryWeebo

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JLogAnalyzer.newReportWeebo
 */
@XmlRootElement(name="MLogAnalyzernewReportWeeboReq")
@XmlType(name="MLogAnalyzernewReportWeeboReq")
//#SWG#@ApiModel(description = "Request message for service JLogAnalyzer.newReportWeebo")
class MLogAnalyzernewReportWeeboReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var query: MQueryWeebo =_
	def withquery(p:MQueryWeebo):this.type ={ 	this.query = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var reportId: String =_
	def withreportId(p:String):this.type ={ 	this.reportId = p; 	this }

}
package it.newvision.nvp.xreports.services.model.request
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
/**
 * Request message for service JReportsCallback.callback
 */
@XmlRootElement(name="MReportsCallbackcallbackReq")
@XmlType(name="MReportsCallbackcallbackReq")
//#SWG#@ApiModel(description = "Request message for service JReportsCallback.callback")
class MReportsCallbackcallbackReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MReportsCallbackcallbackReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var reportId: String =_
	def withreportId(p:String):MReportsCallbackcallbackReq ={ 	this.reportId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var status: MEReportStatus =_
	def withstatus(p:MEReportStatus):MReportsCallbackcallbackReq ={ 	this.status = p; 	this }

}
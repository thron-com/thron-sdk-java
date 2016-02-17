package it.newvision.nvp.xreports.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.report.MCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JReports.findByProperties
 */
@XmlRootElement(name="MReportsfindByPropertiesReq")
@XmlType(name="MReportsfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JReports.findByProperties")
class MReportsfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MCriteria =_
	def withcriteria(p:MCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):this.type ={ 	this.numberOfResults = p; 	this }

}
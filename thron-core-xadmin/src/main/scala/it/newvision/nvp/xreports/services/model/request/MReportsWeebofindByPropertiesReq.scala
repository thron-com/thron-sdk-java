package it.newvision.nvp.xreports.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.report.MCriteriaForReport

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JReportsWeebo.findByProperties
 */
@XmlRootElement(name="MReportsWeebofindByPropertiesReq")
@XmlType(name="MReportsWeebofindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JReportsWeebo.findByProperties")
class MReportsWeebofindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MReportsWeebofindByPropertiesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MCriteriaForReport =_
	def withcriteria(p:MCriteriaForReport):MReportsWeebofindByPropertiesReq ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MReportsWeebofindByPropertiesReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):MReportsWeebofindByPropertiesReq ={ 	this.numberOfResults = p; 	this }

}
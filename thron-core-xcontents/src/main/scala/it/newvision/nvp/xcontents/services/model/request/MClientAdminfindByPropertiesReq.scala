package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MClientCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClientAdmin.findByProperties
 */
@XmlRootElement(name="MClientAdminfindByPropertiesReq")
@XmlType(name="MClientAdminfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JClientAdmin.findByProperties")
class MClientAdminfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MClientCriteria =_
	def withcriteria(p:MClientCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

}
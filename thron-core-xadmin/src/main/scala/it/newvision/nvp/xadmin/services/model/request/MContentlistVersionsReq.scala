package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MVersionSearchCriteria
import it.newvision.nvp.xadmin.services.model.content.MContentVersionResponseOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.listVersions
 */
@XmlRootElement(name="MContentlistVersionsReq")
@XmlType(name="MContentlistVersionsReq")
//#SWG#@ApiModel(description = "Request message for service JContent.listVersions")
class MContentlistVersionsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MVersionSearchCriteria =_
	def withcriteria(p:MVersionSearchCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):this.type ={ 	this.numberOfResults = p; 	this }

	/**
	 * Optional. Do not send any notification at the end of the publishing process.
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var responseOptions: MContentVersionResponseOptions =_
	def withresponseOptions(p:MContentVersionResponseOptions):this.type ={ 	this.responseOptions = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchCriteria
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchResponseOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.search
 */
@XmlRootElement(name="MContentsearchReq")
@XmlType(name="MContentsearchReq")
//#SWG#@ApiModel(description = "Request message for service JContent.search")
class MContentsearchReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MContentSearchCriteria =_
	def withcriteria(p:MContentSearchCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. Used to move to the next page results
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to move to the next page results""", required = true)
	@BeanProperty
	var pageToken: String =_
	def withpageToken(p:String):this.type ={ 	this.pageToken = p; 	this }

	/**
	 * Optional. Used to specify if the service should return or not some additional
	 * information about the content
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to specify if the service should return or not some additional information about the content""", required = true)
	@BeanProperty
	var responseOptions: MContentSearchResponseOptions =_
	def withresponseOptions(p:MContentSearchResponseOptions):this.type ={ 	this.responseOptions = p; 	this }

}
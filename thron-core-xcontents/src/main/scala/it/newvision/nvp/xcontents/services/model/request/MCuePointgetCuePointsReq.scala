package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.cuepoint.MCuePointCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCuePoint.getCuePoints
 */
@XmlRootElement(name="MCuePointgetCuePointsReq")
@XmlType(name="MCuePointgetCuePointsReq")
//#SWG#@ApiModel(description = "Request message for service JCuePoint.getCuePoints")
class MCuePointgetCuePointsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * search criteria used to filter the cue points list of a content
	 */
	//#SWG#@ApiModelProperty(value = """search criteria used to filter the cue points list of a content""", required = true)
	@BeanProperty
	var criteria: MCuePointCriteria =_
	def withcriteria(p:MCuePointCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

}
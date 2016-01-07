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
 * Request message for service JCuePoint.removeCuePoints
 */
@XmlRootElement(name="MCuePointremoveCuePointsReq")
@XmlType(name="MCuePointremoveCuePointsReq")
//#SWG#@ApiModel(description = "Request message for service JCuePoint.removeCuePoints")
class MCuePointremoveCuePointsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MCuePointremoveCuePointsReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MCuePointremoveCuePointsReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var cuePointCriteria: MCuePointCriteria =_
	def withcuePointCriteria(p:MCuePointCriteria):MCuePointremoveCuePointsReq ={ 	this.cuePointCriteria = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MCuePointremoveCuePointsReq ={ 	this.categoryIdForAcl = p; 	this }

}
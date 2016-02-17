package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MLinkedContentRemoveCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.removeLinkedContents
 */
@XmlRootElement(name="MContentremoveLinkedContentsReq")
@XmlType(name="MContentremoveLinkedContentsReq")
//#SWG#@ApiModel(description = "Request message for service JContent.removeLinkedContents")
class MContentremoveLinkedContentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * search criteria
	 */
	//#SWG#@ApiModelProperty(value = """search criteria""", required = true)
	@BeanProperty
	var criteria: MLinkedContentRemoveCriteria =_
	def withcriteria(p:MLinkedContentRemoveCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

}
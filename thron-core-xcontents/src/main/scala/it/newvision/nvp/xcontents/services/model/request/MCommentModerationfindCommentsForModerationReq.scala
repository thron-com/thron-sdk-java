package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.comment.MCommentCriteria
import it.newvision.nvp.xcontents.services.model.common.MModerationCriteria
import it.newvision.nvp.xcontents.services.model.msg.MECommentOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCommentModeration.findCommentsForModeration
 */
@XmlRootElement(name="MCommentModerationfindCommentsForModerationReq")
@XmlType(name="MCommentModerationfindCommentsForModerationReq")
//#SWG#@ApiModel(description = "Request message for service JCommentModeration.findCommentsForModeration")
class MCommentModerationfindCommentsForModerationReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Optional Parameter
	 */
	//#SWG#@ApiModelProperty(value = """Optional Parameter""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * Optional parameter
	 */
	//#SWG#@ApiModelProperty(value = """Optional parameter""", required = true)
	@BeanProperty
	var criteria: MCommentCriteria =_
	def withcriteria(p:MCommentCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var moderationCriteria: MModerationCriteria =_
	def withmoderationCriteria(p:MModerationCriteria):this.type ={ 	this.moderationCriteria = p; 	this }

	/**
	 * The content Metadata is returned in the specified locale. Optional parameter
	 */
	//#SWG#@ApiModelProperty(value = """The content Metadata is returned in the specified locale. Optional parameter""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Optional orderBy parameter. The default order is by creationDate
	 */
	//#SWG#@ApiModelProperty(value = """Optional orderBy parameter. The default order is by creationDate""", required = true)
	@BeanProperty
	var orderBy: MECommentOrderBy =_
	def withorderBy(p:MECommentOrderBy):this.type ={ 	this.orderBy = p; 	this }

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
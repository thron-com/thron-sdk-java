package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.rating.MRatingCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRating.findRatingByProperties
 */
@XmlRootElement(name="MRatingfindRatingByPropertiesReq")
@XmlType(name="MRatingfindRatingByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JRating.findRatingByProperties")
class MRatingfindRatingByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var credential: MCredential =_
	def withcredential(p:MCredential):MRatingfindRatingByPropertiesReq ={ 	this.credential = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MRatingfindRatingByPropertiesReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MRatingCriteria =_
	def withcriteria(p:MRatingCriteria):MRatingfindRatingByPropertiesReq ={ 	this.criteria = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MRatingfindRatingByPropertiesReq ={ 	this.categoryIdForAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MRatingfindRatingByPropertiesReq ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MRatingfindRatingByPropertiesReq ={ 	this.numberOfResult = p; 	this }

}
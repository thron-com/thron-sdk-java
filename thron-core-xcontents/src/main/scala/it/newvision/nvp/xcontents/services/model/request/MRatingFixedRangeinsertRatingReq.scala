package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRatingFixedRange.insertRating
 */
@XmlRootElement(name="MRatingFixedRangeinsertRatingReq")
@XmlType(name="MRatingFixedRangeinsertRatingReq")
//#SWG#@ApiModel(description = "Request message for service JRatingFixedRange.insertRating")
class MRatingFixedRangeinsertRatingReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * with fixed Range [0..1]
	 */
	//#SWG#@ApiModelProperty(value = """with fixed Range [0..1]""", required = true)
	@BeanProperty
	var score: Double =_
	def withscore(p:Double):this.type ={ 	this.score = p; 	this }

	/**
	 * The userId who rated the content. The parameter is Optional
	 */
	//#SWG#@ApiModelProperty(value = """The userId who rated the content. The parameter is Optional""", required = true)
	@BeanProperty
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

}
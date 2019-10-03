package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRating.insertRating
 */
@XmlRootElement(name="MRatinginsertRatingReq")
@XmlType(name="MRatinginsertRatingReq")
//#SWG#@ApiModel(description = "Request message for service JRating.insertRating")
class MRatinginsertRatingReq extends Serializable {

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var credential: MCredential =_
	def withcredential(p:MCredential):this.type ={ 	this.credential = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
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

}
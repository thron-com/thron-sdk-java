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
 * Request message for service JContent.removeContentPrettyId
 */
@XmlRootElement(name="MContentremoveContentPrettyIdReq")
@XmlType(name="MContentremoveContentPrettyIdReq")
//#SWG#@ApiModel(description = "Request message for service JContent.removeContentPrettyId")
class MContentremoveContentPrettyIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MContentremoveContentPrettyIdReq ={ 	this.clientId = p; 	this }

	/**
	 * no prettyId are allowed.
	 */
	//#SWG#@ApiModelProperty(value = """no prettyId are allowed.""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MContentremoveContentPrettyIdReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MContentremoveContentPrettyIdReq ={ 	this.locale = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MContentremoveContentPrettyIdReq ={ 	this.categoryIdForAcl = p; 	this }

}
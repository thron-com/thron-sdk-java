package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MContent4Locale

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateContent4Locale
 */
@XmlRootElement(name="MContentupdateContent4LocaleReq")
@XmlType(name="MContentupdateContent4LocaleReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateContent4Locale")
class MContentupdateContent4LocaleReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	/**
	 * xcontentId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """xcontentId or prettyId""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	/**
	 * Be aware that each information (i.e., name or description) already defined for
	 * the specific contentId will be overwritten by those defined in the body of the
	 * request; therefore, if specific value is omitted, related information will be
	 * deleted; on the other hand, if an empty value is included in the request, its
	 * information value will be set to null.
	 */
	//#SWG#@ApiModelProperty(value = """Be aware that each information (i.e., name or description) already defined for the specific contentId will be overwritten by those defined in the body of the request; therefore, if specific value is omitted, related information will be deleted; on the other hand, if an empty value is included in the request, its information value will be set to null.""", required = true)
	@BeanProperty
	var detail: MContent4Locale =_
	def withdetail(p:MContent4Locale):this.type ={ 	this.detail = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MBuffer

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCuePoint.uploadSrtFile
 */
@XmlRootElement(name="MCuePointuploadSrtFileReq")
@XmlType(name="MCuePointuploadSrtFileReq")
//#SWG#@ApiModel(description = "Request message for service JCuePoint.uploadSrtFile")
class MCuePointuploadSrtFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MCuePointuploadSrtFileReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MCuePointuploadSrtFileReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MCuePointuploadSrtFileReq ={ 	this.locale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var buffer: MBuffer =_
	def withbuffer(p:MBuffer):MCuePointuploadSrtFileReq ={ 	this.buffer = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MCuePointuploadSrtFileReq ={ 	this.categoryIdForAcl = p; 	this }

}
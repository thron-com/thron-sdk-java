package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JPublishingProcess.updatePageletContent
 */
@XmlRootElement(name="MPublishingProcessupdatePageletContentReq")
@XmlType(name="MPublishingProcessupdatePageletContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.updatePageletContent")
class MPublishingProcessupdatePageletContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * raw body source (html or other formats).
	 * constraints: length < 10000000 chars (10.000.000 bytes)
	 */
	//#SWG#@ApiModelProperty(value = """raw body source (html or other formats).
	//#SWGNL#constraints: length < 10000000 chars (10.000.000 bytes)""", required = true)
	@BeanProperty
	var body: String =_
	def withbody(p:String):this.type ={ 	this.body = p; 	this }

	/**
	 * Optional. Used to specify the mime type of the body value.
	 * If empty the content mimeType doesn't change.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to specify the mime type of the body value.
	//#SWGNL#If empty the content mimeType doesn't change.
	//#SWGNL#""", required = true)
	@BeanProperty
	var mimeType: String =_
	def withmimeType(p:String):this.type ={ 	this.mimeType = p; 	this }

}
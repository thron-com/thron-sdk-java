package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPrettyId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateContentPrettyId
 */
@XmlRootElement(name="MContentupdateContentPrettyIdReq")
@XmlType(name="MContentupdateContentPrettyIdReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateContentPrettyId")
class MContentupdateContentPrettyIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * xcontentId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """xcontentId or prettyId""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):this.type ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var prettyId: MPrettyId =_
	def withprettyId(p:MPrettyId):this.type ={ 	this.prettyId = p; 	this }

}
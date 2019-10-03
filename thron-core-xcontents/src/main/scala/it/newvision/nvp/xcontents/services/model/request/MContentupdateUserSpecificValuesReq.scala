package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MContentUserSpecificParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateUserSpecificValues
 */
@XmlRootElement(name="MContentupdateUserSpecificValuesReq")
@XmlType(name="MContentupdateUserSpecificValuesReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateUserSpecificValues")
class MContentupdateUserSpecificValuesReq extends Serializable {

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
	var contentParams: MContentUserSpecificParams =_
	def withcontentParams(p:MContentUserSpecificParams):this.type ={ 	this.contentParams = p; 	this }

	/**
	 * Optional: used to specify that a specific username read or not the content.
	 * The default value if the username of the user that call the service.
	 */
	//#SWG#@ApiModelProperty(value = """Optional: used to specify that a specific username read or not the content.
	//#SWGNL#The default value if the username of the user that call the service.""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}
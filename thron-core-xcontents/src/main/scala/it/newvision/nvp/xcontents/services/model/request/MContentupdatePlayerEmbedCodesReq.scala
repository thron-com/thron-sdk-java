package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MPlayerEmbedCodes

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updatePlayerEmbedCodes
 */
@XmlRootElement(name="MContentupdatePlayerEmbedCodesReq")
@XmlType(name="MContentupdatePlayerEmbedCodesReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updatePlayerEmbedCodes")
class MContentupdatePlayerEmbedCodesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MContentupdatePlayerEmbedCodesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MContentupdatePlayerEmbedCodesReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var embedCodes: MPlayerEmbedCodes =_
	def withembedCodes(p:MPlayerEmbedCodes):MContentupdatePlayerEmbedCodesReq ={ 	this.embedCodes = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MContentupdatePlayerEmbedCodesReq ={ 	this.categoryIdForAcl = p; 	this }

}
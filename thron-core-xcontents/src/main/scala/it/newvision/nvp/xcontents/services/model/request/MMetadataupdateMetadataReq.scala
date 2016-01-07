package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.metadata.MMetadataUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMetadata.updateMetadata
 */
@XmlRootElement(name="MMetadataupdateMetadataReq")
@XmlType(name="MMetadataupdateMetadataReq")
//#SWG#@ApiModel(description = "Request message for service JMetadata.updateMetadata")
class MMetadataupdateMetadataReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MMetadataupdateMetadataReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MMetadataupdateMetadataReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var metadata: MMetadataUpdate =_
	def withmetadata(p:MMetadataUpdate):MMetadataupdateMetadataReq ={ 	this.metadata = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MMetadataupdateMetadataReq ={ 	this.categoryIdForAcl = p; 	this }

}
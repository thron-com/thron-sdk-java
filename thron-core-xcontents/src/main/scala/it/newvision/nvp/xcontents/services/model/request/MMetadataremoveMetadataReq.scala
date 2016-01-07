package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMetadata.removeMetadata
 */
@XmlRootElement(name="MMetadataremoveMetadataReq")
@XmlType(name="MMetadataremoveMetadataReq")
//#SWG#@ApiModel(description = "Request message for service JMetadata.removeMetadata")
class MMetadataremoveMetadataReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MMetadataremoveMetadataReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MMetadataremoveMetadataReq ={ 	this.contentId = p; 	this }

	/**
	 * only name and locale (both optional) are considered
	 */
	//#SWG#@ApiModelProperty(value = """only name and locale (both optional) are considered""", required = true)
	@BeanProperty
	var metadata: MMetadata =_
	def withmetadata(p:MMetadata):MMetadataremoveMetadataReq ={ 	this.metadata = p; 	this }

}
package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MS3Resource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.addS3ResourceToPlatform
 */
@XmlRootElement(name="MRepositoryaddS3ResourceToPlatformReq")
@XmlType(name="MRepositoryaddS3ResourceToPlatformReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.addS3ResourceToPlatform")
class MRepositoryaddS3ResourceToPlatformReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MRepositoryaddS3ResourceToPlatformReq ={ 	this.clientId = p; 	this }

	/**
	 * source file in S3 storage
	 */
	//#SWG#@ApiModelProperty(value = """source file in S3 storage""", required = true)
	@BeanProperty
	var resource: MS3Resource =_
	def withresource(p:MS3Resource):MRepositoryaddS3ResourceToPlatformReq ={ 	this.resource = p; 	this }

	/**
	 * remove the source file once imported in 4me Platform (if possible). Default
	 * value is false
	 */
	//#SWG#@ApiModelProperty(value = """remove the source file once imported in 4me Platform (if possible). Default value is false""", required = true)
	@BeanProperty
	var removeResourceIfPossible: Boolean =_
	def withremoveResourceIfPossible(p:Boolean):MRepositoryaddS3ResourceToPlatformReq ={ 	this.removeResourceIfPossible = p; 	this }

}
package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.MFileList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.addFilesToPlatform
 */
@XmlRootElement(name="MRepositoryaddFilesToPlatformReq")
@XmlType(name="MRepositoryaddFilesToPlatformReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.addFilesToPlatform")
class MRepositoryaddFilesToPlatformReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MRepositoryaddFilesToPlatformReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var files: MFileList =_
	def withfiles(p:MFileList):MRepositoryaddFilesToPlatformReq ={ 	this.files = p; 	this }

}
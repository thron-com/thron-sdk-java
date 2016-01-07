package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.MSource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.uploadFile
 */
@XmlRootElement(name="MRepositoryuploadFileReq")
@XmlType(name="MRepositoryuploadFileReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.uploadFile")
class MRepositoryuploadFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MRepositoryuploadFileReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentID: String =_
	def withcontentID(p:String):MRepositoryuploadFileReq ={ 	this.contentID = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var buffer: MSource =_
	def withbuffer(p:MSource):MRepositoryuploadFileReq ={ 	this.buffer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var fileName: String =_
	def withfileName(p:String):MRepositoryuploadFileReq ={ 	this.fileName = p; 	this }

}
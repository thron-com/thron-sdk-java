package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.deleteFtpFile
 */
@XmlRootElement(name="MRepositorydeleteFtpFileReq")
@XmlType(name="MRepositorydeleteFtpFileReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.deleteFtpFile")
class MRepositorydeleteFtpFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var file: MFile =_
	def withfile(p:MFile):this.type ={ 	this.file = p; 	this }

}
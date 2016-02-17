package it.newvision.nvp.xpackager.services.model.request
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
 * Request message for service JPackager.startPackagingTask
 */
@XmlRootElement(name="MPackagerstartPackagingTaskReq")
@XmlType(name="MPackagerstartPackagingTaskReq")
//#SWG#@ApiModel(description = "Request message for service JPackager.startPackagingTask")
class MPackagerstartPackagingTaskReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packagingContentDescriptor: String =_
	def withpackagingContentDescriptor(p:String):this.type ={ 	this.packagingContentDescriptor = p; 	this }

}
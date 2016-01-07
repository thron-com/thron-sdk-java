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
 * Request message for service JDownloaderQueue.removeTask
 */
@XmlRootElement(name="MDownloaderQueueremoveTaskReq")
@XmlType(name="MDownloaderQueueremoveTaskReq")
//#SWG#@ApiModel(description = "Request message for service JDownloaderQueue.removeTask")
class MDownloaderQueueremoveTaskReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var taskId: String =_
	def withtaskId(p:String):MDownloaderQueueremoveTaskReq ={ 	this.taskId = p; 	this }

}
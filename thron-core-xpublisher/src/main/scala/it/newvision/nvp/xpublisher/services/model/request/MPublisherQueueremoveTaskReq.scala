package it.newvision.nvp.xpublisher.services.model.request
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
 * Request message for service JPublisherQueue.removeTask
 */
@XmlRootElement(name="MPublisherQueueremoveTaskReq")
@XmlType(name="MPublisherQueueremoveTaskReq")
//#SWG#@ApiModel(description = "Request message for service JPublisherQueue.removeTask")
class MPublisherQueueremoveTaskReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var taskId: String =_
	def withtaskId(p:String):this.type ={ 	this.taskId = p; 	this }

}
package it.newvision.nvp.xpublisher.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.queue.MTaskCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublisherQueue.showQueue
 */
@XmlRootElement(name="MPublisherQueueshowQueueReq")
@XmlType(name="MPublisherQueueshowQueueReq")
//#SWG#@ApiModel(description = "Request message for service JPublisherQueue.showQueue")
class MPublisherQueueshowQueueReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MTaskCriteria =_
	def withcriteria(p:MTaskCriteria):MPublisherQueueshowQueueReq ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):MPublisherQueueshowQueueReq ={ 	this.limit = p; 	this }

}
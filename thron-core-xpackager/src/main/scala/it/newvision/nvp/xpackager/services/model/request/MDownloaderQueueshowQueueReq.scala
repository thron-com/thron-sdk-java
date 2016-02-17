package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.queue.MTaskCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDownloaderQueue.showQueue
 */
@XmlRootElement(name="MDownloaderQueueshowQueueReq")
@XmlType(name="MDownloaderQueueshowQueueReq")
//#SWG#@ApiModel(description = "Request message for service JDownloaderQueue.showQueue")
class MDownloaderQueueshowQueueReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MTaskCriteria =_
	def withcriteria(p:MTaskCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):this.type ={ 	this.limit = p; 	this }

}
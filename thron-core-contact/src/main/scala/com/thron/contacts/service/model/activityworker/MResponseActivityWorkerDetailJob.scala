package com.thron.contacts.service.model.activityworker
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.msg.MEJobStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseActivityWorkerDetailJob") 
@XmlType(name="MResponseActivityWorkerDetailJob")
//#SWG#@ApiModel(description = """""")
class MResponseActivityWorkerDetailJob extends MResponseActivityWorker with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var jobId: String =_
	def withjobId(p:String):this.type ={ 	this.jobId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var jobStatus: MEJobStatus =_
	def withjobStatus(p:MEJobStatus):this.type ={ 	this.jobStatus = p; 	this }

}
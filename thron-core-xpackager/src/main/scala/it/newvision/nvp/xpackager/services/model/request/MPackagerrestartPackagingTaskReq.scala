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
 * Request message for service JPackager.restartPackagingTask
 */
@XmlRootElement(name="MPackagerrestartPackagingTaskReq")
@XmlType(name="MPackagerrestartPackagingTaskReq")
//#SWG#@ApiModel(description = "Request message for service JPackager.restartPackagingTask")
class MPackagerrestartPackagingTaskReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packagedId: String =_
	def withpackagedId(p:String):this.type ={ 	this.packagedId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var restartIngestion: Boolean =_
	def withrestartIngestion(p:Boolean):this.type ={ 	this.restartIngestion = p; 	this }

}
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
 * Request message for service JPackager.stopPackagingTask
 */
@XmlRootElement(name="MPackagerstopPackagingTaskReq")
@XmlType(name="MPackagerstopPackagingTaskReq")
//#SWG#@ApiModel(description = "Request message for service JPackager.stopPackagingTask")
class MPackagerstopPackagingTaskReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var packagedId: String =_
	def withpackagedId(p:String):this.type ={ 	this.packagedId = p; 	this }

}
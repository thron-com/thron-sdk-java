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
 * Request message for service JRepositoryAdmin.getFilesToCleanUp
 */
@XmlRootElement(name="MRepositoryAdmingetFilesToCleanUpReq")
@XmlType(name="MRepositoryAdmingetFilesToCleanUpReq")
//#SWG#@ApiModel(description = "Request message for service JRepositoryAdmin.getFilesToCleanUp")
class MRepositoryAdmingetFilesToCleanUpReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):this.type ={ 	this.numberOfResults = p; 	this }

}
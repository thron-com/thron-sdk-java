package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MWebResource

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.addWebResourceToPlatform
 */
@XmlRootElement(name="MRepositoryaddWebResourceToPlatformReq")
@XmlType(name="MRepositoryaddWebResourceToPlatformReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.addWebResourceToPlatform")
class MRepositoryaddWebResourceToPlatformReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var webResource: MWebResource =_
	def withwebResource(p:MWebResource):this.type ={ 	this.webResource = p; 	this }

}
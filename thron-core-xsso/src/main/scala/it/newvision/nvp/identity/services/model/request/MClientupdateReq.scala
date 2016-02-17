package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClient.update
 */
@XmlRootElement(name="MClientupdateReq")
@XmlType(name="MClientupdateReq")
//#SWG#@ApiModel(description = "Request message for service JClient.update")
class MClientupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MClient =_
	def withclient(p:MClient):this.type ={ 	this.client = p; 	this }

}
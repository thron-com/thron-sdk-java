package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClientAdmin.createClient
 */
@XmlRootElement(name="MClientAdmincreateClientReq")
@XmlType(name="MClientAdmincreateClientReq")
//#SWG#@ApiModel(description = "Request message for service JClientAdmin.createClient")
class MClientAdmincreateClientReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MClient =_
	def withclient(p:MClient):MClientAdmincreateClientReq ={ 	this.client = p; 	this }

}
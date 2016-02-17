package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClientAdmin.detailClient
 */
@XmlRootElement(name="MClientAdmindetailClientReq")
@XmlType(name="MClientAdmindetailClientReq")
//#SWG#@ApiModel(description = "Request message for service JClientAdmin.detailClient")
class MClientAdmindetailClientReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

}
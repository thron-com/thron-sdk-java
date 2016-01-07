package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MLiveEvent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JLiveEventAdmin.create
 */
@XmlRootElement(name="MLiveEventAdmincreateReq")
@XmlType(name="MLiveEventAdmincreateReq")
//#SWG#@ApiModel(description = "Request message for service JLiveEventAdmin.create")
class MLiveEventAdmincreateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):MLiveEventAdmincreateReq ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var liveEvent: MLiveEvent =_
	def withliveEvent(p:MLiveEvent):MLiveEventAdmincreateReq ={ 	this.liveEvent = p; 	this }

}
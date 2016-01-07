package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JBilling.newSnapshot
 */
@XmlRootElement(name="MBillingnewSnapshotReq")
@XmlType(name="MBillingnewSnapshotReq")
//#SWG#@ApiModel(description = "Request message for service JBilling.newSnapshot")
class MBillingnewSnapshotReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MBillingnewSnapshotReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var forCheck: Boolean =_
	def withforCheck(p:Boolean):MBillingnewSnapshotReq ={ 	this.forCheck = p; 	this }

}
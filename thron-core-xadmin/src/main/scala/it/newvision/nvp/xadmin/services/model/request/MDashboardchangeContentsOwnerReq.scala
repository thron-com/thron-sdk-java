package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MContentsParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDashboard.changeContentsOwner
 */
@XmlRootElement(name="MDashboardchangeContentsOwnerReq")
@XmlType(name="MDashboardchangeContentsOwnerReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.changeContentsOwner")
class MDashboardchangeContentsOwnerReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MDashboardchangeContentsOwnerReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contents: MContentsParams =_
	def withcontents(p:MContentsParams):MDashboardchangeContentsOwnerReq ={ 	this.contents = p; 	this }

}
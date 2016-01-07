package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MContentTrashList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDashboard.trashContent
 */
@XmlRootElement(name="MDashboardtrashContentReq")
@XmlType(name="MDashboardtrashContentReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.trashContent")
class MDashboardtrashContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MDashboardtrashContentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentList: MContentTrashList =_
	def withcontentList(p:MContentTrashList):MDashboardtrashContentReq ={ 	this.contentList = p; 	this }

}
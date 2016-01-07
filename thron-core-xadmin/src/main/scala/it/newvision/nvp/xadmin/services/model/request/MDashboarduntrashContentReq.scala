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
 * Request message for service JDashboard.untrashContent
 */
@XmlRootElement(name="MDashboarduntrashContentReq")
@XmlType(name="MDashboarduntrashContentReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.untrashContent")
class MDashboarduntrashContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MDashboarduntrashContentReq ={ 	this.clientId = p; 	this }

	/**
	 * if newUserId is empty the contents will be un trash to the original owner
	 */
	//#SWG#@ApiModelProperty(value = """if newUserId is empty the contents will be un trash to the original owner""", required = true)
	@BeanProperty
	var contentList: MContentsParams =_
	def withcontentList(p:MContentsParams):MDashboarduntrashContentReq ={ 	this.contentList = p; 	this }

}
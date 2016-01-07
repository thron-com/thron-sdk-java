package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MApp

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsUtils.update
 */
@XmlRootElement(name="MAppsUtilsupdateReq")
@XmlType(name="MAppsUtilsupdateReq")
//#SWG#@ApiModel(description = "Request message for service JAppsUtils.update")
class MAppsUtilsupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsUtilsupdateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsUtilsupdateReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MApp =_
	def withupdate(p:MApp):MAppsUtilsupdateReq ={ 	this.update = p; 	this }

}
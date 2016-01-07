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
 * Request message for service JAppsAdmin.removeGroupApp
 */
@XmlRootElement(name="MAppsAdminremoveGroupAppReq")
@XmlType(name="MAppsAdminremoveGroupAppReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.removeGroupApp")
class MAppsAdminremoveGroupAppReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsAdminremoveGroupAppReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsAdminremoveGroupAppReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):MAppsAdminremoveGroupAppReq ={ 	this.groupId = p; 	this }

}
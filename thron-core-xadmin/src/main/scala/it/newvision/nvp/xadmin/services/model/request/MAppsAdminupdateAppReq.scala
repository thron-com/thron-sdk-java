package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppCapabilities
import it.newvision.nvp.xadmin.services.model.apps.MAppUpdateData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.updateApp
 */
@XmlRootElement(name="MAppsAdminupdateAppReq")
@XmlType(name="MAppsAdminupdateAppReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.updateApp")
class MAppsAdminupdateAppReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	/**
	 * Optional. Used to update all capabilities and roles of the application
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to update all capabilities and roles of the application""", required = true)
	@BeanProperty
	var caps: MAppCapabilities =_
	def withcaps(p:MAppCapabilities):this.type ={ 	this.caps = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MAppUpdateData =_
	def withupdate(p:MAppUpdateData):this.type ={ 	this.update = p; 	this }

}
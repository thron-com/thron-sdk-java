package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppAddCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.addGroupApp
 */
@XmlRootElement(name="MAppsAdminaddGroupAppReq")
@XmlType(name="MAppsAdminaddGroupAppReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.addGroupApp")
class MAppsAdminaddGroupAppReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsAdminaddGroupAppReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsAdminaddGroupAppReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):MAppsAdminaddGroupAppReq ={ 	this.groupId = p; 	this }

	/**
	 * Optional. Additional roles required by the app to assign to the group
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional roles required by the app to assign to the group""", required = true)
	@BeanProperty
	var userCaps: MAppAddCapability =_
	def withuserCaps(p:MAppAddCapability):MAppsAdminaddGroupAppReq ={ 	this.userCaps = p; 	this }

}
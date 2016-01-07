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
 * Request message for service JAppsAdmin.addUserApp
 */
@XmlRootElement(name="MAppsAdminaddUserAppReq")
@XmlType(name="MAppsAdminaddUserAppReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.addUserApp")
class MAppsAdminaddUserAppReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsAdminaddUserAppReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsAdminaddUserAppReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MAppsAdminaddUserAppReq ={ 	this.username = p; 	this }

	/**
	 * Optional. Additional roles required by the app
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional roles required by the app""", required = true)
	@BeanProperty
	var userCaps: MAppAddCapability =_
	def withuserCaps(p:MAppAddCapability):MAppsAdminaddUserAppReq ={ 	this.userCaps = p; 	this }

}
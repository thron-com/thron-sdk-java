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
@XmlRootElement(name="MAppsaddGroupAppReq") 
 @XmlType(name="MAppsaddGroupAppReq")
class MAppsaddGroupAppReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsaddGroupAppReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsaddGroupAppReq ={ 	this.appId = p; 	this }

	@BeanProperty 
	var groupId: String =_
	def withgroupId(p:String):MAppsaddGroupAppReq ={ 	this.groupId = p; 	this }

	/**
	 * Optional. Additional roles required by the app to assign to the group
	 */
	@BeanProperty 
	var userCaps: MAppAddCapability =_
	def withuserCaps(p:MAppAddCapability):MAppsaddGroupAppReq ={ 	this.userCaps = p; 	this }

}
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
@XmlRootElement(name="MAppsaddUserAppReq") 
 @XmlType(name="MAppsaddUserAppReq")
class MAppsaddUserAppReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsaddUserAppReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsaddUserAppReq ={ 	this.appId = p; 	this }

	@BeanProperty 
	var username: String =_
	def withusername(p:String):MAppsaddUserAppReq ={ 	this.username = p; 	this }

	/**
	 * Optional. Additional roles required by the app
	 */
	@BeanProperty 
	var userCaps: MAppAddCapability =_
	def withuserCaps(p:MAppAddCapability):MAppsaddUserAppReq ={ 	this.userCaps = p; 	this }

}
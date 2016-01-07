package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppSubscriptionData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppsAdminupdateSubscriptionDataReq") 
 @XmlType(name="MAppsAdminupdateSubscriptionDataReq")
class MAppsAdminupdateSubscriptionDataReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsAdminupdateSubscriptionDataReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsAdminupdateSubscriptionDataReq ={ 	this.appId = p; 	this }

	@BeanProperty 
	var update: MAppSubscriptionData =_
	def withupdate(p:MAppSubscriptionData):MAppsAdminupdateSubscriptionDataReq ={ 	this.update = p; 	this }

}
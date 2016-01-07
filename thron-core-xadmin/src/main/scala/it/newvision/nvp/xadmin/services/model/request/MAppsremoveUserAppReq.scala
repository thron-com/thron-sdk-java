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
@XmlRootElement(name="MAppsremoveUserAppReq") 
 @XmlType(name="MAppsremoveUserAppReq")
class MAppsremoveUserAppReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsremoveUserAppReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsremoveUserAppReq ={ 	this.appId = p; 	this }

	@BeanProperty 
	var username: String =_
	def withusername(p:String):MAppsremoveUserAppReq ={ 	this.username = p; 	this }

}
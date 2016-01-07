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
@XmlRootElement(name="MAppsAdminupdateReq") 
 @XmlType(name="MAppsAdminupdateReq")
class MAppsAdminupdateReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsAdminupdateReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsAdminupdateReq ={ 	this.appId = p; 	this }

	@BeanProperty 
	var update: MApp =_
	def withupdate(p:MApp):MAppsAdminupdateReq ={ 	this.update = p; 	this }

}
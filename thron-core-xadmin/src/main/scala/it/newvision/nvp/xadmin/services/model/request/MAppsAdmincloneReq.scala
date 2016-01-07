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
@XmlRootElement(name="MAppsAdmincloneReq") 
 @XmlType(name="MAppsAdmincloneReq")
class MAppsAdmincloneReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MAppsAdmincloneReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var appId: String =_
	def withappId(p:String):MAppsAdmincloneReq ={ 	this.appId = p; 	this }

}
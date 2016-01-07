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
@XmlRootElement(name="MMediaContentlockMediaContentReq") 
 @XmlType(name="MMediaContentlockMediaContentReq")
class MMediaContentlockMediaContentReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentlockMediaContentReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var mediacontentId: String =_
	def withmediacontentId(p:String):MMediaContentlockMediaContentReq ={ 	this.mediacontentId = p; 	this }

	@BeanProperty 
	var username: String =_
	def withusername(p:String):MMediaContentlockMediaContentReq ={ 	this.username = p; 	this }

}
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
@XmlRootElement(name="MMediaContentunlockMediaContentReq") 
 @XmlType(name="MMediaContentunlockMediaContentReq")
class MMediaContentunlockMediaContentReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentunlockMediaContentReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var mediacontentId: String =_
	def withmediacontentId(p:String):MMediaContentunlockMediaContentReq ={ 	this.mediacontentId = p; 	this }

	@BeanProperty 
	var username: String =_
	def withusername(p:String):MMediaContentunlockMediaContentReq ={ 	this.username = p; 	this }

}
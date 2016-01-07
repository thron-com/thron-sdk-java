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
@XmlRootElement(name="MMediaContentAdminremoveMediaContentReq") 
 @XmlType(name="MMediaContentAdminremoveMediaContentReq")
class MMediaContentAdminremoveMediaContentReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentAdminremoveMediaContentReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var id: String =_
	def withid(p:String):MMediaContentAdminremoveMediaContentReq ={ 	this.id = p; 	this }

}
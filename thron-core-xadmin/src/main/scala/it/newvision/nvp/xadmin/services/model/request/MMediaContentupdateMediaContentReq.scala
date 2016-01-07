package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MMediaContentUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMediaContentupdateMediaContentReq") 
 @XmlType(name="MMediaContentupdateMediaContentReq")
class MMediaContentupdateMediaContentReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentupdateMediaContentReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):MMediaContentupdateMediaContentReq ={ 	this.mediaContentId = p; 	this }

	@BeanProperty 
	var update: MMediaContentUpdate =_
	def withupdate(p:MMediaContentUpdate):MMediaContentupdateMediaContentReq ={ 	this.update = p; 	this }

}
package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MAvailableInSolutionUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMediaContentupdateAvailableInSolutionsReq") 
 @XmlType(name="MMediaContentupdateAvailableInSolutionsReq")
class MMediaContentupdateAvailableInSolutionsReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MMediaContentupdateAvailableInSolutionsReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):MMediaContentupdateAvailableInSolutionsReq ={ 	this.mediaContentId = p; 	this }

	@BeanProperty 
	var update: MAvailableInSolutionUpdate =_
	def withupdate(p:MAvailableInSolutionUpdate):MMediaContentupdateAvailableInSolutionsReq ={ 	this.update = p; 	this }

}
package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRepositorygenerateMetainfoReq") 
 @XmlType(name="MRepositorygenerateMetainfoReq")
class MRepositorygenerateMetainfoReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MRepositorygenerateMetainfoReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):MRepositorygenerateMetainfoReq ={ 	this.file = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClientAdminupdateClientReq") 
 @XmlType(name="MClientAdminupdateClientReq")
class MClientAdminupdateClientReq extends Serializable {

	@BeanProperty 
	var client: MClient =_
	def withclient(p:MClient):this.type ={ 	this.client = p; 	this }

}
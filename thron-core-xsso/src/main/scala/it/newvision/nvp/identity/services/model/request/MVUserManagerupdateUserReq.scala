package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MVUserUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.updateUser
 */
@XmlRootElement(name="MVUserManagerupdateUserReq")
@XmlType(name="MVUserManagerupdateUserReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.updateUser")
class MVUserManagerupdateUserReq extends Serializable {

	/**
	 * Optional. User detail
	 */
	//#SWG#@ApiModelProperty(value = """Optional. User detail""", required = true)
	@BeanProperty
	var update: MVUserUpdate =_
	def withupdate(p:MVUserUpdate):MVUserManagerupdateUserReq ={ 	this.update = p; 	this }

}
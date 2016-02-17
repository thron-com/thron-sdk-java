package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.verifyUsername
 */
@XmlRootElement(name="MVUserManagerverifyUsernameReq")
@XmlType(name="MVUserManagerverifyUsernameReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.verifyUsername")
class MVUserManagerverifyUsernameReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}
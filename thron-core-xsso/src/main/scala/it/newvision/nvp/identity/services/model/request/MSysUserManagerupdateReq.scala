package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUserDetail

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSysUserManager.update
 */
@XmlRootElement(name="MSysUserManagerupdateReq")
@XmlType(name="MSysUserManagerupdateReq")
//#SWG#@ApiModel(description = "Request message for service JSysUserManager.update")
class MSysUserManagerupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MSysUserManagerupdateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MSysUserManagerupdateReq ={ 	this.username = p; 	this }

	/**
	 * user information
	 */
	//#SWG#@ApiModelProperty(value = """user information""", required = true)
	@BeanProperty
	var detail: MUserDetail =_
	def withdetail(p:MUserDetail):MSysUserManagerupdateReq ={ 	this.detail = p; 	this }

}
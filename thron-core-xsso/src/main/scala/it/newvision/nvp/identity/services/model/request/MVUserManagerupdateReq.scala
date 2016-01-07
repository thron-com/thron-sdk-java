package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MVUserParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.update
 */
@XmlRootElement(name="MVUserManagerupdateReq")
@XmlType(name="MVUserManagerupdateReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.update")
class MVUserManagerupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerupdateReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MVUserManagerupdateReq ={ 	this.username = p; 	this }

	/**
	 * Optional. User detail
	 */
	//#SWG#@ApiModelProperty(value = """Optional. User detail""", required = true)
	@BeanProperty
	var detail: MVUserDetail =_
	def withdetail(p:MVUserDetail):MVUserManagerupdateReq ={ 	this.detail = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var userParams: MVUserParams =_
	def withuserParams(p:MVUserParams):MVUserManagerupdateReq ={ 	this.userParams = p; 	this }

}
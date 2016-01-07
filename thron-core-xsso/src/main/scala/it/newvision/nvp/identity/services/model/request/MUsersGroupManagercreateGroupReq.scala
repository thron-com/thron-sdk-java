package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MGroupInitData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JUsersGroupManager.createGroup
 */
@XmlRootElement(name="MUsersGroupManagercreateGroupReq")
@XmlType(name="MUsersGroupManagercreateGroupReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.createGroup")
class MUsersGroupManagercreateGroupReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUsersGroupManagercreateGroupReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var usersGroup: MGroupInitData =_
	def withusersGroup(p:MGroupInitData):MUsersGroupManagercreateGroupReq ={ 	this.usersGroup = p; 	this }

}
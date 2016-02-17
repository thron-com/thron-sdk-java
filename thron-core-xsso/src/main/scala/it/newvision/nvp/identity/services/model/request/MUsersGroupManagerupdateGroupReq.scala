package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MGroupUpdateData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JUsersGroupManager.updateGroup
 */
@XmlRootElement(name="MUsersGroupManagerupdateGroupReq")
@XmlType(name="MUsersGroupManagerupdateGroupReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.updateGroup")
class MUsersGroupManagerupdateGroupReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):this.type ={ 	this.groupId = p; 	this }

	/**
	 * used to update the name and description attributes
	 */
	//#SWG#@ApiModelProperty(value = """used to update the name and description attributes""", required = true)
	@BeanProperty
	var usersGroup: MGroupUpdateData =_
	def withusersGroup(p:MGroupUpdateData):this.type ={ 	this.usersGroup = p; 	this }

}
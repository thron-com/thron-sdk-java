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
 * Request message for service JUsersGroupManager.removeGroup
 */
@XmlRootElement(name="MUsersGroupManagerremoveGroupReq")
@XmlType(name="MUsersGroupManagerremoveGroupReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.removeGroup")
class MUsersGroupManagerremoveGroupReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUsersGroupManagerremoveGroupReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):MUsersGroupManagerremoveGroupReq ={ 	this.groupId = p; 	this }

	/**
	 * if force equals true, the service remove the group without checking if the
	 * userGroup is linked to other users
	 */
	//#SWG#@ApiModelProperty(value = """if force equals true, the service remove the group without checking if the userGroup is linked to other users""", required = true)
	@BeanProperty
	var force: Boolean =_
	def withforce(p:Boolean):MUsersGroupManagerremoveGroupReq ={ 	this.force = p; 	this }

}
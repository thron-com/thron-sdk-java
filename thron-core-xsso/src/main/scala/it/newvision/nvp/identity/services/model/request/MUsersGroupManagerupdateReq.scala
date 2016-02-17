package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MUserGroupUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JUsersGroupManager.update
 */
@XmlRootElement(name="MUsersGroupManagerupdateReq")
@XmlType(name="MUsersGroupManagerupdateReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.update")
class MUsersGroupManagerupdateReq extends Serializable {

	/**
	 * used to update the name and description attributes
	 */
	//#SWG#@ApiModelProperty(value = """used to update the name and description attributes""", required = true)
	@BeanProperty
	var update: MUserGroupUpdate =_
	def withupdate(p:MUserGroupUpdate):this.type ={ 	this.update = p; 	this }

}
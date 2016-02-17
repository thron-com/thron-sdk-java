package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MGroupList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.unlinkGroups
 */
@XmlRootElement(name="MVUserManagerunlinkGroupsReq")
@XmlType(name="MVUserManagerunlinkGroupsReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.unlinkGroups")
class MVUserManagerunlinkGroupsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groups: MGroupList =_
	def withgroups(p:MGroupList):this.type ={ 	this.groups = p; 	this }

}
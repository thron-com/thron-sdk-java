package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUsersGroup

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUsersGroupExt") 
@XmlType(name="MUsersGroupExt")
//#SWG#@ApiModel(description = """""")
class MUsersGroupExt extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupDetail: MUsersGroup =_
	def withgroupDetail(p:MUsersGroup):MUsersGroupExt ={ 	this.groupDetail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalLinkedUsers: Integer  = 0
	def withtotalLinkedUsers(p:Integer):MUsersGroupExt ={ 	this.totalLinkedUsers = p; 	this }

}
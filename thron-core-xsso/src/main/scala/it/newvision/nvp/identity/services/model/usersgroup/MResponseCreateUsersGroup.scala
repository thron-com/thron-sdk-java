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
@XmlRootElement(name="MResponseCreateUsersGroup") 
@XmlType(name="MResponseCreateUsersGroup")
//#SWG#@ApiModel(description = """""")
class MResponseCreateUsersGroup extends MResponseUsersGroup with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var group: MUsersGroup =_
	def withgroup(p:MUsersGroup):MResponseCreateUsersGroup ={ 	this.group = p; 	this }

}
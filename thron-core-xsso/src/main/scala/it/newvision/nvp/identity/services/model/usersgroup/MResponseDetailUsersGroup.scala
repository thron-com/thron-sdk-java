package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUsersGroup
import it.newvision.nvp.identity.model.MVUser

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDetailUsersGroup") 
@XmlType(name="MResponseDetailUsersGroup")
//#SWG#@ApiModel(description = """""")
class MResponseDetailUsersGroup extends MResponseUsersGroup with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var group: MUsersGroup =_
	def withgroup(p:MUsersGroup):MResponseDetailUsersGroup ={ 	this.group = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedUsers: List[MVUser] = new ArrayList[MVUser]
	def withlinkedUsers(p:List[MVUser]):MResponseDetailUsersGroup ={ 	this.linkedUsers = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseDetailUsersGroup ={ 	this.totalResults = p; 	this }

}
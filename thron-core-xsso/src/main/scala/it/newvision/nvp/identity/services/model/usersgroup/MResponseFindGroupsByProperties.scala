package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindGroupsByProperties") 
@XmlType(name="MResponseFindGroupsByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseFindGroupsByProperties extends MResponseUsersGroup with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var groups: List[MUsersGroupExt] = new ArrayList[MUsersGroupExt]
	def withgroups(p:List[MUsersGroupExt]):MResponseFindGroupsByProperties ={ 	this.groups = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseFindGroupsByProperties ={ 	this.totalResults = p; 	this }

}
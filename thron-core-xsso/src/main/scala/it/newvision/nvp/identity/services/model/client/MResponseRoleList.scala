package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseRoleList") 
@XmlType(name="MResponseRoleList")
//#SWG#@ApiModel(description = """""")
class MResponseRoleList extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var roles: List[String] = new ArrayList[String]
	def withroles(p:List[String]):this.type ={ 	this.roles = p; 	this }

}
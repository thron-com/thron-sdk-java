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
@XmlRootElement(name="MResponseRoleHierarchy") 
@XmlType(name="MResponseRoleHierarchy")
//#SWG#@ApiModel(description = """""")
class MResponseRoleHierarchy extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var roles: List[MRoleDetail] = new ArrayList[MRoleDetail]
	def withroles(p:List[MRoleDetail]):this.type ={ 	this.roles = p; 	this }

}
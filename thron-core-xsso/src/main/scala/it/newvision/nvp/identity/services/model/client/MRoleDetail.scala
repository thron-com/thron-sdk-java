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
@XmlRootElement(name="MRoleDetail") 
@XmlType(name="MRoleDetail")
//#SWG#@ApiModel(description = """""")
class MRoleDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var roleName: String =_
	def withroleName(p:String):this.type ={ 	this.roleName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var roles: List[String] = new ArrayList[String]
	def withroles(p:List[String]):this.type ={ 	this.roles = p; 	this }

}
package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUser

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseCreateVUser") 
@XmlType(name="MResponseCreateVUser")
//#SWG#@ApiModel(description = """""")
class MResponseCreateVUser extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var user: List[MVUser] = new ArrayList[MVUser]
	def withuser(p:List[MVUser]):MResponseCreateVUser ={ 	this.user = p; 	this }

}
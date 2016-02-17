package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEUserType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseAccessLogin") 
@XmlType(name="MResponseAccessLogin")
//#SWG#@ApiModel(description = """""")
class MResponseAccessLogin extends MResponseIdentity with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var tokenId: String =_
	def withtokenId(p:String):this.type ={ 	this.tokenId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userFullName: String =_
	def withuserFullName(p:String):this.type ={ 	this.userFullName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userType: MEUserType =_
	def withuserType(p:MEUserType):this.type ={ 	this.userType = p; 	this }

}
package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.msg.MEClientResponse
import it.newvision.nvp.identity.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUsersGroup") 
@XmlType(name="MResponseUsersGroup")
//#SWG#@ApiModel(description = """""")
class MResponseUsersGroup extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEClientResponse =_
	def withresultCode(p:MEClientResponse):MResponseUsersGroup ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):MResponseUsersGroup ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):MResponseUsersGroup ={ 	this.errorDescription = p; 	this }

}
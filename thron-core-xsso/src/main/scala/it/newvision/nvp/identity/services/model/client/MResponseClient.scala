package it.newvision.nvp.identity.services.model.client
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
@XmlRootElement(name="MResponseClient") 
@XmlType(name="MResponseClient")
//#SWG#@ApiModel(description = """""")
class MResponseClient extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEClientResponse =_
	def withresultCode(p:MEClientResponse):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
package it.newvision.nvp.test.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.test.services.model.msg.METestResponse
import it.newvision.nvp.test.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseTest") 
@XmlType(name="MResponseTest")
//#SWG#@ApiModel(description = """""")
class MResponseTest extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: METestResponse =_
	def withresultCode(p:METestResponse):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultDescription: String =_
	def withresultDescription(p:String):this.type ={ 	this.resultDescription = p; 	this }

}
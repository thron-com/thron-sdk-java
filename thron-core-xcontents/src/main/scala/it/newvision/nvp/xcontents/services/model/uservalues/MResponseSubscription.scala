package it.newvision.nvp.xcontents.services.model.uservalues
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MESubscription
import it.newvision.nvp.xcontents.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSubscription") 
@XmlType(name="MResponseSubscription")
//#SWG#@ApiModel(description = """""")
class MResponseSubscription extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MESubscription =_
	def withresultCode(p:MESubscription):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.msg.MEExternalIMResponse

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseExternalIM") 
@XmlType(name="MResponseExternalIM")
//#SWG#@ApiModel(description = """""")
class MResponseExternalIM extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEExternalIMResponse =_
	def withstatus(p:MEExternalIMResponse):MResponseExternalIM ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var message: String =_
	def withmessage(p:String):MResponseExternalIM ={ 	this.message = p; 	this }

}
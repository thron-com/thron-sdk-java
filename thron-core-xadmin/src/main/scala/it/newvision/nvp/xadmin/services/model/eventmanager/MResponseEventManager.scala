package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEEventManager
import it.newvision.nvp.xadmin.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseEventManager") 
@XmlType(name="MResponseEventManager")
//#SWG#@ApiModel(description = """""")
class MResponseEventManager extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEEventManager  = MEEventManager.OK
	def withresultCode(p:MEEventManager):MResponseEventManager ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO  = MESSO.OK
	def withssoCode(p:MESSO):MResponseEventManager ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):MResponseEventManager ={ 	this.errorDescription = p; 	this }

}
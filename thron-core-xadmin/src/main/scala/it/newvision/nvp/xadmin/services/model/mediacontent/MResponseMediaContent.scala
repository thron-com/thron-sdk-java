package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEMediaContent
import it.newvision.nvp.xadmin.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseMediaContent") 
@XmlType(name="MResponseMediaContent")
//#SWG#@ApiModel(description = """""")
class MResponseMediaContent extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEMediaContent  = MEMediaContent.OK
	def withresultCode(p:MEMediaContent):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO  = MESSO.OK
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
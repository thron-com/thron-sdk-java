package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.msg.MEPackager
import it.newvision.nvp.xpackager.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseRepository") 
@XmlType(name="MResponseRepository")
//#SWG#@ApiModel(description = """""")
class MResponseRepository extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEPackager =_
	def withresultCode(p:MEPackager):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}
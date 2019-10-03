package it.newvision.nvp.webtv.services.model.archive
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.msg.MEArchive
import it.newvision.nvp.xcontents.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseArchive") 
@XmlType(name="MResponseArchive")
//#SWG#@ApiModel(description = """""")
class MResponseArchive extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEArchive  = MEArchive.OK
	def withresultCode(p:MEArchive):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ssoCode: MESSO  = MESSO.OK
	def withssoCode(p:MESSO):this.type ={ 	this.ssoCode = p; 	this }

}
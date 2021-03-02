package it.newvision.nvp.xcontents.services.model.publishingProfile
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublishingProfile") 
@XmlType(name="MResponsePublishingProfile")
//#SWG#@ApiModel(description = """""")
class MResponsePublishingProfile extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEPublishingProfile =_
	def withresultCode(p:MEPublishingProfile):this.type ={ 	this.resultCode = p; 	this }

}
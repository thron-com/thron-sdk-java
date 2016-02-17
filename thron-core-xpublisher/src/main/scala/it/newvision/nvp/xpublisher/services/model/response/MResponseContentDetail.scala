package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentDetail") 
@XmlType(name="MResponseContentDetail")
//#SWG#@ApiModel(description = """""")
class MResponseContentDetail extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

}
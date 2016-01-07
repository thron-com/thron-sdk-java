package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMediaContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseCreateMediaContent") 
@XmlType(name="MResponseCreateMediaContent")
//#SWG#@ApiModel(description = """""")
class MResponseCreateMediaContent extends MResponseMediaContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var mediaContent: MMediaContent =_
	def withmediaContent(p:MMediaContent):MResponseCreateMediaContent ={ 	this.mediaContent = p; 	this }

}
package it.newvision.nvp.xpackager.services.model.packager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MPackagedContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseRestartPackagingTask") 
@XmlType(name="MResponseRestartPackagingTask")
//#SWG#@ApiModel(description = """""")
class MResponseRestartPackagingTask extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MPackagedContent =_
	def withcontent(p:MPackagedContent):MResponseRestartPackagingTask ={ 	this.content = p; 	this }

}
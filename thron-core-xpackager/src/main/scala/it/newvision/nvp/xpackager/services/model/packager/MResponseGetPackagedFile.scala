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
@XmlRootElement(name="MResponseGetPackagedFile") 
@XmlType(name="MResponseGetPackagedFile")
//#SWG#@ApiModel(description = """""")
class MResponseGetPackagedFile extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var content: MPackagedContent =_
	def withcontent(p:MPackagedContent):this.type ={ 	this.content = p; 	this }

}
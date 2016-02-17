package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFilesToCleanUp") 
@XmlType(name="MResponseFilesToCleanUp")
//#SWG#@ApiModel(description = """""")
class MResponseFilesToCleanUp extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesToCleanUp: List[MFileToCleanUp] = new ArrayList[MFileToCleanUp]
	def withfilesToCleanUp(p:List[MFileToCleanUp]):this.type ={ 	this.filesToCleanUp = p; 	this }

}
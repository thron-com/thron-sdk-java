package it.newvision.nvp.xpackager.services.model.packager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetPackagedFilesForPreview") 
@XmlType(name="MResponseGetPackagedFilesForPreview")
//#SWG#@ApiModel(description = """""")
class MResponseGetPackagedFilesForPreview extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var files: List[MFile] = new ArrayList[MFile]
	def withfiles(p:List[MFile]):this.type ={ 	this.files = p; 	this }

}
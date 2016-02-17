package it.newvision.nvp.xpackager.services.model.repository
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
@XmlRootElement(name="MResponseAddFilesToPlatform") 
@XmlType(name="MResponseAddFilesToPlatform")
//#SWG#@ApiModel(description = """""")
class MResponseAddFilesToPlatform extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesImported: List[MFile] = new ArrayList[MFile]
	def withfilesImported(p:List[MFile]):this.type ={ 	this.filesImported = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesNotImported: List[MFile] = new ArrayList[MFile]
	def withfilesNotImported(p:List[MFile]):this.type ={ 	this.filesNotImported = p; 	this }

}
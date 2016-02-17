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
@XmlRootElement(name="MResponseFilesToBackup") 
@XmlType(name="MResponseFilesToBackup")
//#SWG#@ApiModel(description = """""")
class MResponseFilesToBackup extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesToBackup: List[MFileToBackup] = new ArrayList[MFileToBackup]
	def withfilesToBackup(p:List[MFileToBackup]):this.type ={ 	this.filesToBackup = p; 	this }

}
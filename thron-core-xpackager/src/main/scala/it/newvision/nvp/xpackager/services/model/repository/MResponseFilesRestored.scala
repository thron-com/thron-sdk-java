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
@XmlRootElement(name="MResponseFilesRestored") 
@XmlType(name="MResponseFilesRestored")
//#SWG#@ApiModel(description = """""")
class MResponseFilesRestored extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesRestored: List[MFileExtended] = new ArrayList[MFileExtended]
	def withfilesRestored(p:List[MFileExtended]):this.type ={ 	this.filesRestored = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var filesNotRestored: List[MFileExtended] = new ArrayList[MFileExtended]
	def withfilesNotRestored(p:List[MFileExtended]):this.type ={ 	this.filesNotRestored = p; 	this }

}
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
@XmlRootElement(name="MResponseGetUploadedFiles") 
@XmlType(name="MResponseGetUploadedFiles")
//#SWG#@ApiModel(description = """""")
class MResponseGetUploadedFiles extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var uploadedFiles: List[MFile] = new ArrayList[MFile]
	def withuploadedFiles(p:List[MFile]):MResponseGetUploadedFiles ={ 	this.uploadedFiles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseGetUploadedFiles ={ 	this.totalResults = p; 	this }

}
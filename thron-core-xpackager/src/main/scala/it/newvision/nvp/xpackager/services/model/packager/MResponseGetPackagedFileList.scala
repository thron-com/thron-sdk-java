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
@XmlRootElement(name="MResponseGetPackagedFileList") 
@XmlType(name="MResponseGetPackagedFileList")
//#SWG#@ApiModel(description = """""")
class MResponseGetPackagedFileList extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MPackagedContent] = new ArrayList[MPackagedContent]
	def withcontents(p:List[MPackagedContent]):MResponseGetPackagedFileList ={ 	this.contents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseGetPackagedFileList ={ 	this.totalResults = p; 	this }

}
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
@XmlRootElement(name="MRepositoryFileList") 
@XmlType(name="MRepositoryFileList")
//#SWG#@ApiModel(description = """""")
class MRepositoryFileList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var files: List[MRepositoryFile] = new ArrayList[MRepositoryFile]
	def withfiles(p:List[MRepositoryFile]):this.type ={ 	this.files = p; 	this }

}
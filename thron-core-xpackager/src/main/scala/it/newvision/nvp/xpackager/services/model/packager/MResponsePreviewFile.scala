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
/**
 * Return the File source stored in the repository or packaging folder.
 */
@XmlRootElement(name="MResponsePreviewFile") 
@XmlType(name="MResponsePreviewFile")
//#SWG#@ApiModel(description = """Return the File source stored in the repository or packaging folder.""")
class MResponsePreviewFile extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):MResponsePreviewFile ={ 	this.file = p; 	this }

}
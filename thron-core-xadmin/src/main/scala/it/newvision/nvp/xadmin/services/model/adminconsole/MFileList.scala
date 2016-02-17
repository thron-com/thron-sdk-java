package it.newvision.nvp.xadmin.services.model.adminconsole
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * A subset of the files in the working area, that the user want to check if are
 * linked to some mediaContent.
 */
@XmlRootElement(name="MFileList") 
@XmlType(name="MFileList")
//#SWG#@ApiModel(description = """A subset of the files in the working area, that the user want to check if are linked to some mediaContent.""")
class MFileList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var files: List[MFile] = new ArrayList[MFile]
	def withfiles(p:List[MFile]):this.type ={ 	this.files = p; 	this }

}
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
 * mediaContentId is empty if the given file is not used in a mediaContent.
 */
@XmlRootElement(name="MFileInformation") 
@XmlType(name="MFileInformation")
//#SWG#@ApiModel(description = """mediaContentId is empty if the given file is not used in a mediaContent.""")
class MFileInformation extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var files: MFile =_
	def withfiles(p:MFile):MFileInformation ={ 	this.files = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var mediaContentId: String =_
	def withmediaContentId(p:String):MFileInformation ={ 	this.mediaContentId = p; 	this }

}
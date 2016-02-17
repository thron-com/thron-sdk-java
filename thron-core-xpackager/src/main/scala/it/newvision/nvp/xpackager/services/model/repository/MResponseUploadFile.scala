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
@XmlRootElement(name="MResponseUploadFile") 
@XmlType(name="MResponseUploadFile")
//#SWG#@ApiModel(description = """""")
class MResponseUploadFile extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):this.type ={ 	this.file = p; 	this }

}
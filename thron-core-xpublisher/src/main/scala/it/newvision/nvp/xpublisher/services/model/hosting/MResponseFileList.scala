package it.newvision.nvp.xpublisher.services.model.hosting
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFileList") 
@XmlType(name="MResponseFileList")
//#SWG#@ApiModel(description = """""")
class MResponseFileList extends MResponseHosting with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var files: List[MResourceFile] = new ArrayList[MResourceFile]
	def withfiles(p:List[MResourceFile]):this.type ={ 	this.files = p; 	this }

}
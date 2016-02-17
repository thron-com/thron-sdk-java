package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MFileNameList") 
@XmlType(name="MFileNameList")
//#SWG#@ApiModel(description = """""")
class MFileNameList extends Serializable {

	/**
	 * list of file names.
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """list of file names.
	//#SWGNL#filename with extension (example myimage.jpg)""")
	@BeanProperty 
	var fileNames: List[String] = new ArrayList[String]
	def withfileNames(p:List[String]):this.type ={ 	this.fileNames = p; 	this }

}
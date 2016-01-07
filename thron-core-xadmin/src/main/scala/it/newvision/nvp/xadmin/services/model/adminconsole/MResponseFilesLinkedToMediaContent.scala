package it.newvision.nvp.xadmin.services.model.adminconsole
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFilesLinkedToMediaContent") 
@XmlType(name="MResponseFilesLinkedToMediaContent")
//#SWG#@ApiModel(description = """""")
class MResponseFilesLinkedToMediaContent extends MResponsePreview with Serializable  {

	/**
	 * list of mediacontentsId where the file is used.
	 */
	//#SWG#@ApiModelProperty(value = """list of mediacontentsId where the file is used.""")
	@BeanProperty 
	var mediaContentId: List[String] = new ArrayList[String]
	def withmediaContentId(p:List[String]):MResponseFilesLinkedToMediaContent ={ 	this.mediaContentId = p; 	this }

}
package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * administration service
 */
@XmlRootElement(name="MResponseGetPublishedContents") 
@XmlType(name="MResponseGetPublishedContents")
//#SWG#@ApiModel(description = """administration service""")
class MResponseGetPublishedContents extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContent] = new ArrayList[MContent]
	def withcontents(p:List[MContent]):MResponseGetPublishedContents ={ 	this.contents = p; 	this }

}
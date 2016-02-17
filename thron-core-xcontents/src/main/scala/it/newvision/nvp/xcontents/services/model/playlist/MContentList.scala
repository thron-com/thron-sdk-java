package it.newvision.nvp.xcontents.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * ContentList is used to update the contents associated with the
 * playlist/slideshow. contentIds may contain duplicate content. 
 */
@XmlRootElement(name="MContentList") 
@XmlType(name="MContentList")
//#SWG#@ApiModel(description = """ContentList is used to update the contents associated with the playlist/slideshow. contentIds may contain duplicate content. """)
class MContentList extends Serializable {

	/**
	 * list of xcontent ids
	 */
	//#SWG#@ApiModelProperty(value = """list of xcontent ids""")
	@BeanProperty 
	var xcontentIds: List[String] = new ArrayList[String]
	def withxcontentIds(p:List[String]):this.type ={ 	this.xcontentIds = p; 	this }

}
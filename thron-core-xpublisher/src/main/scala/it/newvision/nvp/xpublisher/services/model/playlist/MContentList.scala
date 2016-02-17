package it.newvision.nvp.xpublisher.services.model.playlist
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
 * playlist/slideshow. These lists may contain duplicate entries. 
 */
@XmlRootElement(name="MContentList") 
@XmlType(name="MContentList")
//#SWG#@ApiModel(description = """ContentList is used to update the contents associated with the playlist/slideshow. These lists may contain duplicate entries. """)
class MContentList extends Serializable {

	/**
	 * list of contentsId published in Weebo
	 */
	//#SWG#@ApiModelProperty(value = """list of contentsId published in Weebo""")
	@BeanProperty 
	var pContentIds: List[String] = new ArrayList[String]
	def withpContentIds(p:List[String]):this.type ={ 	this.pContentIds = p; 	this }

}
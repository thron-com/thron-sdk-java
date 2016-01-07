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
@XmlRootElement(name="MPlaylistItems") 
@XmlType(name="MPlaylistItems")
//#SWG#@ApiModel(description = """""")
class MPlaylistItems extends Serializable {

	/**
	 * the list of items to add to the playlist
	 */
	//#SWG#@ApiModelProperty(value = """the list of items to add to the playlist""")
	@BeanProperty 
	var contents: List[MPlaylistItem] = new ArrayList[MPlaylistItem]
	def withcontents(p:List[MPlaylistItem]):MPlaylistItems ={ 	this.contents = p; 	this }

}
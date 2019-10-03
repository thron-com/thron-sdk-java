package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.playlist.MPlaylistItems

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlaylist.addContents
 */
@XmlRootElement(name="MPlaylistaddContentsReq")
@XmlType(name="MPlaylistaddContentsReq")
//#SWG#@ApiModel(description = "Request message for service JPlaylist.addContents")
class MPlaylistaddContentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * the playlist elements to add
	 */
	//#SWG#@ApiModelProperty(value = """the playlist elements to add""", required = true)
	@BeanProperty
	var contentList: MPlaylistItems =_
	def withcontentList(p:MPlaylistItems):this.type ={ 	this.contentList = p; 	this }

	/**
	 * xcontentId of Playlist content
	 */
	//#SWG#@ApiModelProperty(value = """xcontentId of Playlist content""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}
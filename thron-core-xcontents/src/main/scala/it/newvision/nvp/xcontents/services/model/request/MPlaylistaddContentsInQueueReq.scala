package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.playlist.MContentList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPlaylist.addContentsInQueue
 */
@XmlRootElement(name="MPlaylistaddContentsInQueueReq")
@XmlType(name="MPlaylistaddContentsInQueueReq")
//#SWG#@ApiModel(description = "Request message for service JPlaylist.addContentsInQueue")
class MPlaylistaddContentsInQueueReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPlaylistaddContentsInQueueReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):MPlaylistaddContentsInQueueReq ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentList: MContentList =_
	def withxcontentList(p:MContentList):MPlaylistaddContentsInQueueReq ={ 	this.xcontentList = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MPlaylistaddContentsInQueueReq ={ 	this.categoryIdForAcl = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JPlaylist.moveContentInList
 */
@XmlRootElement(name="MPlaylistmoveContentInListReq")
@XmlType(name="MPlaylistmoveContentInListReq")
//#SWG#@ApiModel(description = "Request message for service JPlaylist.moveContentInList")
class MPlaylistmoveContentInListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * the playlist xcontentId
	 */
	//#SWG#@ApiModelProperty(value = """the playlist xcontentId""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * the content position in the playlist
	 */
	//#SWG#@ApiModelProperty(value = """the content position in the playlist""", required = true)
	@BeanProperty
	var oldContentPosition: Integer =_
	def witholdContentPosition(p:Integer):this.type ={ 	this.oldContentPosition = p; 	this }

	/**
	 * the new position in the playlist
	 */
	//#SWG#@ApiModelProperty(value = """the new position in the playlist""", required = true)
	@BeanProperty
	var newContentPosition: Integer =_
	def withnewContentPosition(p:Integer):this.type ={ 	this.newContentPosition = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):this.type ={ 	this.categoryIdForAcl = p; 	this }

}
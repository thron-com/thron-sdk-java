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
 * Request message for service JPlaylist.removeContentFromList
 */
@XmlRootElement(name="MPlaylistremoveContentFromListReq")
@XmlType(name="MPlaylistremoveContentFromListReq")
//#SWG#@ApiModel(description = "Request message for service JPlaylist.removeContentFromList")
class MPlaylistremoveContentFromListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPlaylistremoveContentFromListReq ={ 	this.clientId = p; 	this }

	/**
	 * xcontentId of playlist
	 */
	//#SWG#@ApiModelProperty(value = """ xcontentId of playlist""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):MPlaylistremoveContentFromListReq ={ 	this.xcontentId = p; 	this }

	/**
	 * remove the element in the given position
	 */
	//#SWG#@ApiModelProperty(value = """remove the element in the given position""", required = true)
	@BeanProperty
	var contentPosition: Integer =_
	def withcontentPosition(p:Integer):MPlaylistremoveContentFromListReq ={ 	this.contentPosition = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MPlaylistremoveContentFromListReq ={ 	this.categoryIdForAcl = p; 	this }

}
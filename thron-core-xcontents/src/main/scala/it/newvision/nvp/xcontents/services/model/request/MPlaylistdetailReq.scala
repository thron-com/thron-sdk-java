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
 * Request message for service JPlaylist.detail
 */
@XmlRootElement(name="MPlaylistdetailReq")
@XmlType(name="MPlaylistdetailReq")
//#SWG#@ApiModel(description = "Request message for service JPlaylist.detail")
class MPlaylistdetailReq extends Serializable {

	/**
	 * Optional, For ACL validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional, For ACL validation""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPlaylistdetailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):MPlaylistdetailReq ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MPlaylistdetailReq ={ 	this.locale = p; 	this }

	/**
	 * Optional. For Acl validation
	 */
	//#SWG#@ApiModelProperty(value = """Optional. For Acl validation""", required = true)
	@BeanProperty
	var categoryIdForAcl: String =_
	def withcategoryIdForAcl(p:String):MPlaylistdetailReq ={ 	this.categoryIdForAcl = p; 	this }

}
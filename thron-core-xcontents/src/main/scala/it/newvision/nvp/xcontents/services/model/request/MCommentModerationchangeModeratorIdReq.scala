package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.comment.MCommentsList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCommentModeration.changeModeratorId
 */
@XmlRootElement(name="MCommentModerationchangeModeratorIdReq")
@XmlType(name="MCommentModerationchangeModeratorIdReq")
//#SWG#@ApiModel(description = "Request message for service JCommentModeration.changeModeratorId")
class MCommentModerationchangeModeratorIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * total number of new comments to assign to the given moderatorId
	 */
	//#SWG#@ApiModelProperty(value = """total number of new comments to assign to the given moderatorId""", required = true)
	@BeanProperty
	var comments: MCommentsList =_
	def withcomments(p:MCommentsList):this.type ={ 	this.comments = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var moderatorId: String =_
	def withmoderatorId(p:String):this.type ={ 	this.moderatorId = p; 	this }

}
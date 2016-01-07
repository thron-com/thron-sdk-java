package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.comment.MCommentPub

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCommentModeration.updateComment
 */
@XmlRootElement(name="MCommentModerationupdateCommentReq")
@XmlType(name="MCommentModerationupdateCommentReq")
//#SWG#@ApiModel(description = "Request message for service JCommentModeration.updateComment")
class MCommentModerationupdateCommentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MCommentModerationupdateCommentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var commentId: String =_
	def withcommentId(p:String):MCommentModerationupdateCommentReq ={ 	this.commentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var comment: MCommentPub =_
	def withcomment(p:MCommentPub):MCommentModerationupdateCommentReq ={ 	this.comment = p; 	this }

}
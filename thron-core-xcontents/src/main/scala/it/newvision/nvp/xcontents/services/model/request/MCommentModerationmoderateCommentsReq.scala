package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.comment.MCommentsModerated

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCommentModeration.moderateComments
 */
@XmlRootElement(name="MCommentModerationmoderateCommentsReq")
@XmlType(name="MCommentModerationmoderateCommentsReq")
//#SWG#@ApiModel(description = "Request message for service JCommentModeration.moderateComments")
class MCommentModerationmoderateCommentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var comments: MCommentsModerated =_
	def withcomments(p:MCommentsModerated):this.type ={ 	this.comments = p; 	this }

}
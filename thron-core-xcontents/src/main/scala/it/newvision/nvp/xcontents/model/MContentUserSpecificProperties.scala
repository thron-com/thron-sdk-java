package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MEContentReadValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * user information of the content, like if the content has been read or if the
 * user subscribed for notifications.
 */
@XmlRootElement(name="MContentUserSpecificProperties") 
@XmlType(name="MContentUserSpecificProperties")
//#SWG#@ApiModel(description = """user information of the content, like if the content has been read or if the user subscribed for notifications.""")
class MContentUserSpecificProperties extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentReadValue: MEContentReadValue  = MEContentReadValue.UNREAD
	def withcontentReadValue(p:MEContentReadValue):MContentUserSpecificProperties ={ 	this.contentReadValue = p; 	this }

	/**
	 * used to indicate whether the user is registered or not to content notifications.
	 */
	//#SWG#@ApiModelProperty(value = """used to indicate whether the user is registered or not to content notifications.""" ,required = true)
	@BeanProperty 
	var userSubscribedForNotification: Boolean  = false
	def withuserSubscribedForNotification(p:Boolean):MContentUserSpecificProperties ={ 	this.userSubscribedForNotification = p; 	this }

	/**
	 * used to mark if the content is starred or not for the user
	 */
	//#SWG#@ApiModelProperty(value = """used to mark if the content is starred or not for the user""" ,required = true)
	@BeanProperty 
	var contentStarred: Boolean  = false
	def withcontentStarred(p:Boolean):MContentUserSpecificProperties ={ 	this.contentStarred = p; 	this }

	/**
	 * the date when the content has been marked as READ by the user.
	 */
	//#SWG#@ApiModelProperty(value = """the date when the content has been marked as READ by the user.""")
	@BeanProperty 
	var readDate: Date =_
	def withreadDate(p:Date):MContentUserSpecificProperties ={ 	this.readDate = p; 	this }

}
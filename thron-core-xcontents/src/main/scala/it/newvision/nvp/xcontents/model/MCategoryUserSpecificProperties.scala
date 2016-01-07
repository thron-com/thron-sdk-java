package it.newvision.nvp.xcontents.model
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
 * user information of the content, like if the content has been read or if the
 * user subscribed for notifications.
 */
@XmlRootElement(name="MCategoryUserSpecificProperties") 
@XmlType(name="MCategoryUserSpecificProperties")
//#SWG#@ApiModel(description = """user information of the content, like if the content has been read or if the user subscribed for notifications.""")
class MCategoryUserSpecificProperties extends Serializable {

	/**
	 * used to indicate whether the user is registered or not to a category for
	 * notifications.
	 */
	//#SWG#@ApiModelProperty(value = """used to indicate whether the user is registered or not to a category for notifications.""" ,required = true)
	@BeanProperty 
	var userSubscribedForNotification: Boolean  = false
	def withuserSubscribedForNotification(p:Boolean):MCategoryUserSpecificProperties ={ 	this.userSubscribedForNotification = p; 	this }

}
package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppSubscriptionData") 
@XmlType(name="MAppSubscriptionData")
//#SWG#@ApiModel(description = """""")
class MAppSubscriptionData extends Serializable {

	/**
	 * Whether or not the app can subscribe for notifications for actions on the
	 * platform
	 */
	//#SWG#@ApiModelProperty(value = """Whether or not the app can subscribe for notifications for actions on the platform""" ,required = true)
	@BeanProperty 
	var canSubscribeForNotifications: Boolean =_
	def withcanSubscribeForNotifications(p:Boolean):this.type ={ 	this.canSubscribeForNotifications = p; 	this }

	/**
	 * List of notification actions the app is subscribed for.
	 * 
	 * Use "*" as a placeholder for all actions, else refer to it.newvision.nv4me.
	 * notificationcenter.model.MENotificationAction values.
	 * 
	 * Refers to notifications sent via CHAT channel only
	 */
	//#SWG#@ApiModelProperty(value = """List of notification actions the app is subscribed for.
	//#SWGNL#
	//#SWGNL#Use "*" as a placeholder for all actions, else refer to it.newvision.nv4me.notificationcenter.model.MENotificationAction values.
	//#SWGNL#
	//#SWGNL#Refers to notifications sent via CHAT channel only""")
	@BeanProperty 
	var subscribedNotificationActions: List[String] = new ArrayList[String]
	def withsubscribedNotificationActions(p:List[String]):this.type ={ 	this.subscribedNotificationActions = p; 	this }

}
package it.newvision.nvp.identity.model
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
 * Used to collect the user information necessary to send platform notifications
 * throw email or sms
 */
@XmlRootElement(name="MVUserNotificationProperties") 
@XmlType(name="MVUserNotificationProperties")
//#SWG#@ApiModel(description = """Used to collect the user information necessary to send platform notifications throw email or sms""")
class MVUserNotificationProperties extends Serializable {

	/**
	 * The main email address. The field is required for all Platform and generic
	 * users and is used for notification to the user.
	 * Constraints:
	 * -) Value must be a valid e-mail address
	 * -) max length = 1000
	 */
	//#SWG#@ApiModelProperty(value = """The main email address. The field is required for all Platform and generic users and is used for notification to the user.
	//#SWGNL#Constraints:
	//#SWGNL#-) Value must be a valid e-mail address
	//#SWGNL#-) max length = 1000""" ,required = true)
	@BeanProperty 
	var email: String =_
	def withemail(p:String):MVUserNotificationProperties ={ 	this.email = p; 	this }

	/**
	 * the default telephone number used for sms notifications.
	 */
	//#SWG#@ApiModelProperty(value = """the default telephone number used for sms notifications.""")
	@BeanProperty 
	var phoneNumber: String =_
	def withphoneNumber(p:String):MVUserNotificationProperties ={ 	this.phoneNumber = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var notifyBy: List[MENotificationType] = new ArrayList[MENotificationType]
	def withnotifyBy(p:List[MENotificationType]):MVUserNotificationProperties ={ 	this.notifyBy = p; 	this }

	/**
	 * Used to automatically subscribe the user for notification when linked to
	 * categories
	 */
	//#SWG#@ApiModelProperty(value = """Used to automatically subscribe the user for notification when linked to categories""")
	@BeanProperty 
	var autoSubscribeToCategories: Boolean  = true
	def withautoSubscribeToCategories(p:Boolean):MVUserNotificationProperties ={ 	this.autoSubscribeToCategories = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(this.email).forall(_.matches("""(?i)^.+@.+\..+$"""))&&
		org.apache.commons.lang.StringUtils.length(this.email)<=1000
	}

}
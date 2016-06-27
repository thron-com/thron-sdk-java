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
	 * The main email address. The field is mandatory for all Platform users and is
	 * used to send notifications; moreover, this value will be used to identify the
	 * email key of the related contact.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>Value must be a valid e-mail address</li>
	 * </ul>
	 * <ul>
	 * 	<li>max length = 1000</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The main email address. The field is mandatory for all Platform users and is used to send notifications; moreover, this value will be used to identify the email key of the related contact.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Value must be a valid e-mail address</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 1000</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var email: String =_
	def withemail(p:String):this.type ={ 	this.email = p; 	this }

	/**
	 * the default telephone number used for sms notifications.
	 */
	//#SWG#@ApiModelProperty(value = """the default telephone number used for sms notifications.""")
	@BeanProperty 
	var phoneNumber: String =_
	def withphoneNumber(p:String):this.type ={ 	this.phoneNumber = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var notifyBy: List[MENotificationType] = new ArrayList[MENotificationType]
	def withnotifyBy(p:List[MENotificationType]):this.type ={ 	this.notifyBy = p; 	this }

	/**
	 * Used to automatically subscribe the user for notification when linked to
	 * categories
	 */
	//#SWG#@ApiModelProperty(value = """Used to automatically subscribe the user for notification when linked to categories""")
	@BeanProperty 
	var autoSubscribeToCategories: Boolean  = true
	def withautoSubscribeToCategories(p:Boolean):this.type ={ 	this.autoSubscribeToCategories = p; 	this }

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
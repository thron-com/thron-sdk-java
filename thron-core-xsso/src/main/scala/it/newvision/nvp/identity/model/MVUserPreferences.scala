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
 * Used to collect the user preferences like, default locale on administration
 * console, and time zone.
 */
@XmlRootElement(name="MVUserPreferences") 
@XmlType(name="MVUserPreferences")
//#SWG#@ApiModel(description = """Used to collect the user preferences like, default locale on administration console, and time zone.""")
class MVUserPreferences extends Serializable {

	/**
	 * The preferred locale to use in the Console or for notifications.
	 * Like: IT, EN, FR...
	 */
	//#SWG#@ApiModelProperty(value = """The preferred locale to use in the Console or for notifications.
	//#SWGNL#Like: IT, EN, FR...""")
	@BeanProperty 
	var locale: String  = "EN"
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var notificationProperty: MVUserNotificationProperties  = new MVUserNotificationProperties()
	def withnotificationProperty(p:MVUserNotificationProperties):this.type ={ 	this.notificationProperty = p; 	this }

	/**
	 * The preferred timezone for the user.
	 * GMT[+,-][0..13]
	 * Example:
	 * GMT+1
	 * GMT-3
	 * GMT+4
	 */
	//#SWG#@ApiModelProperty(value = """The preferred timezone for the user.
	//#SWGNL#GMT[+,-][0..13]
	//#SWGNL#Example:
	//#SWGNL#GMT+1
	//#SWGNL#GMT-3
	//#SWGNL#GMT+4""")
	@BeanProperty 
	var timeZoneId: String  = "GMT+0"
	def withtimeZoneId(p:String):this.type ={ 	this.timeZoneId = p; 	this }

}
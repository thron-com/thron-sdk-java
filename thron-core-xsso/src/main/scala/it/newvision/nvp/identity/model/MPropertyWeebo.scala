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
@XmlRootElement(name="MPropertyWeebo") 
@XmlType(name="MPropertyWeebo")
//#SWG#@ApiModel(description = """""")
class MPropertyWeebo extends Serializable {

	/**
	 * Paid services and Solutions (Apps): VIEW,PLAY,VIEW_PLAYER,COREWS,SITEACCEL,EVENT
	 */
	//#SWG#@ApiModelProperty(value = """Paid services and Solutions (Apps): VIEW,PLAY,VIEW_PLAYER,COREWS,SITEACCEL,EVENT""")
	@BeanProperty 
	@Deprecated
	var paidServices: List[String] = new ArrayList[String]
	@Deprecated
	def withpaidServices(p:List[String]):this.type ={ 	this.paidServices = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var removeUploadedFilesAfterPublish: Boolean  = false
	@Deprecated
	def withremoveUploadedFilesAfterPublish(p:Boolean):this.type ={ 	this.removeUploadedFilesAfterPublish = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var keepIngestedFilesAfterPublish: Boolean  = false
	@Deprecated
	def withkeepIngestedFilesAfterPublish(p:Boolean):this.type ={ 	this.keepIngestedFilesAfterPublish = p; 	this }

	/**
	 * available channels for the Client. He can publish in web and stream channel.
	 * Available channels:
	 * WEB
	 * STREAM
	 * IPHONE
	 */
	//#SWG#@ApiModelProperty(value = """available channels for the Client. He can publish in web and stream channel.
	//#SWGNL#Available channels:
	//#SWGNL#WEB
	//#SWGNL#STREAM
	//#SWGNL#IPHONE""")
	@BeanProperty 
	@Deprecated
	var channels: List[String] = new ArrayList[String]
	@Deprecated
	def withchannels(p:List[String]):this.type ={ 	this.channels = p; 	this }

	/**
	 * units (bytes) 
	 */
	//#SWG#@ApiModelProperty(value = """units (bytes) """ ,required = true)
	@BeanProperty 
	@Deprecated
	var quotaRepositoryLimit: Long  = 214748364800l
	@Deprecated
	def withquotaRepositoryLimit(p:Long):this.type ={ 	this.quotaRepositoryLimit = p; 	this }

	/**
	 * units (bytes)
	 */
	//#SWG#@ApiModelProperty(value = """units (bytes)""" ,required = true)
	@BeanProperty 
	@Deprecated
	var quotaCdnLimit: Long  = 429496729600l
	@Deprecated
	def withquotaCdnLimit(p:Long):this.type ={ 	this.quotaCdnLimit = p; 	this }

	/**
	 * define the priorityLevel of the client for the ingestion tasks. This is to use
	 * to define some client with higher priority than others.
	 */
	//#SWG#@ApiModelProperty(value = """define the priorityLevel of the client for the ingestion tasks. This is to use to define some client with higher priority than others.""" ,required = true)
	@BeanProperty 
	@Deprecated
	var ingestionPriorityLevel: Integer  = 5
	@Deprecated
	def withingestionPriorityLevel(p:Integer):this.type ={ 	this.ingestionPriorityLevel = p; 	this }

	/**
	 * monthly traffic in MegaBytes.
	 * -1 = unlimited
	 */
	//#SWG#@ApiModelProperty(value = """monthly traffic in MegaBytes.
	//#SWGNL#-1 = unlimited""" ,required = true)
	@BeanProperty 
	@Deprecated
	var monthlyTrafficAmount: Long  = -1
	@Deprecated
	def withmonthlyTrafficAmount(p:Long):this.type ={ 	this.monthlyTrafficAmount = p; 	this }

	/**
	 * monthly traffic in MegaBytes.
	 * -1 = unlimited
	 */
	//#SWG#@ApiModelProperty(value = """monthly traffic in MegaBytes.
	//#SWGNL#-1 = unlimited""" ,required = true)
	@BeanProperty 
	@Deprecated
	var annualTrafficAmount: Long  = -1
	@Deprecated
	def withannualTrafficAmount(p:Long):this.type ={ 	this.annualTrafficAmount = p; 	this }

	/**
	 * Deprecated
	 * The client can have a maximum number of users (platform Users and Apps) in the
	 * admin console.
	 * Available slot: 5, 10, 25, 50, 100, custom
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated
	//#SWGNL#The client can have a maximum number of users (platform Users and Apps) in the admin console. 
	//#SWGNL#Available slot: 5, 10, 25, 50, 100, custom""" ,required = true)
	@BeanProperty 
	@Deprecated
	var maxNumberOfUsers: Integer  = 5
	@Deprecated
	def withmaxNumberOfUsers(p:Integer):this.type ={ 	this.maxNumberOfUsers = p; 	this }

	/**
	 * max number of email the client can send in a month (emails for notification)
	 */
	//#SWG#@ApiModelProperty(value = """max number of email the client can send in a month (emails for notification)""" ,required = true)
	@BeanProperty 
	@Deprecated
	var quotaMonthlyEmails: Long  = 0L
	@Deprecated
	def withquotaMonthlyEmails(p:Long):this.type ={ 	this.quotaMonthlyEmails = p; 	this }

	/**
	 * max number of email the client can send in a month (emails for notification)
	 */
	//#SWG#@ApiModelProperty(value = """max number of email the client can send in a month (emails for notification)""" ,required = true)
	@BeanProperty 
	@Deprecated
	var quotaMonthlySms: Long  = 0L
	@Deprecated
	def withquotaMonthlySms(p:Long):this.type ={ 	this.quotaMonthlySms = p; 	this }

	/**
	 * the list of site acceleration list, used to store the hostname Weebo is
	 * providing site acelleration. This intormation is used in Weebo Reports.
	 * Optional 
	 */
	//#SWG#@ApiModelProperty(value = """the list of site acceleration list, used to store the hostname Weebo is providing site acelleration. This intormation is used in Weebo Reports.
	//#SWGNL#Optional """)
	@BeanProperty 
	var siteAccelerationList: List[String] = new ArrayList[String]
	def withsiteAccelerationList(p:List[String]):this.type ={ 	this.siteAccelerationList = p; 	this }

	/**
	 * Analytics ID. Used by the player for statistics and reports
	 */
	//#SWG#@ApiModelProperty(value = """Analytics ID. Used by the player for statistics and reports""")
	@BeanProperty 
	@Deprecated
	var trackerGA: String =_
	@Deprecated
	def withtrackerGA(p:String):this.type ={ 	this.trackerGA = p; 	this }

	/**
	 * the email linked to the trackerGA.
	 */
	//#SWG#@ApiModelProperty(value = """the email linked to the trackerGA.""")
	@BeanProperty 
	@Deprecated
	var trackerAccount: String =_
	@Deprecated
	def withtrackerAccount(p:String):this.type ={ 	this.trackerAccount = p; 	this }

	/**
	 * maximum file size for UGC contents. Used in the webupload service. Units (bytes)
	 */
	//#SWG#@ApiModelProperty(value = """maximum file size for UGC contents. Used in the webupload service. Units (bytes)""" ,required = true)
	@BeanProperty 
	var maxWebUploadForUGC: Long  = 5242880l
	def withmaxWebUploadForUGC(p:Long):this.type ={ 	this.maxWebUploadForUGC = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playerProperties: MPropertyPlayer  = new MPropertyPlayer
	def withplayerProperties(p:MPropertyPlayer):this.type ={ 	this.playerProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var eventsProperties: MPropertyEvents  = new MPropertyEvents
	def witheventsProperties(p:MPropertyEvents):this.type ={ 	this.eventsProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var cdnProperties: MPropertyCDNAws  = new MPropertyCDNAws()
	def withcdnProperties(p:MPropertyCDNAws):this.type ={ 	this.cdnProperties = p; 	this }

	/**
	 * enable the remove protection of source files in repository. The removed source
	 * files are stored in a safe area for retention time
	 */
	//#SWG#@ApiModelProperty(value = """enable the remove protection of source files in repository. The removed source files are stored in a safe area for retention time""" ,required = true)
	@BeanProperty 
	@Deprecated
	var safeRepository: Boolean  = true
	@Deprecated
	def withsafeRepository(p:Boolean):this.type ={ 	this.safeRepository = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(clientId: String){
		 this.channels = new ArrayList[String](Arrays.asList("WEB"))
		 this.paidServices = new ArrayList[String](Arrays.asList("VIEW","PLAY","MOVE"))
		 this.playerProperties = new MPropertyPlayer(clientId)     
		 this.safeRepository = true // DEFAULT ENABLED AFTER 4.1.1
	
	}

}
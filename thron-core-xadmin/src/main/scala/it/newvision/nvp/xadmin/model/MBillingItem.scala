package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MBillingItem") 
@XmlType(name="MBillingItem")
//#SWG#@ApiModel(description = """""")
class MBillingItem extends Serializable {

	/**
	 * Business Model Code
	 */
	//#SWG#@ApiModelProperty(value = """Business Model Code""" ,required = true)
	@BeanProperty 
	var bmCode: String =_
	def withbmCode(p:String):this.type ={ 	this.bmCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * 3x or 4x or disabled
	 */
	//#SWG#@ApiModelProperty(value = """3x or 4x or disabled""" ,required = true)
	@BeanProperty 
	var clientType: String =_
	def withclientType(p:String):this.type ={ 	this.clientType = p; 	this }

	/**
	 * identified active contacts
	 */
	//#SWG#@ApiModelProperty(value = """identified active contacts""" ,required = true)
	@BeanProperty 
	@Deprecated
	var identifiedActiveContacts: Long  = 0L
	@Deprecated
	def withidentifiedActiveContacts(p:Long):this.type ={ 	this.identifiedActiveContacts = p; 	this }

	/**
	 * identified contacts
	 */
	//#SWG#@ApiModelProperty(value = """identified contacts""" ,required = true)
	@BeanProperty 
	var identifiedContacts: Long  = 0L
	def withidentifiedContacts(p:Long):this.type ={ 	this.identifiedContacts = p; 	this }

	/**
	 * max number of apps in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of apps in the time range.""" ,required = true)
	@BeanProperty 
	@Deprecated
	var maxNumberOfApps: Long  = 0L
	@Deprecated
	def withmaxNumberOfApps(p:Long):this.type ={ 	this.maxNumberOfApps = p; 	this }

	/**
	 * max number of users (guest) in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of users (guest) in the time range.""" ,required = true)
	@BeanProperty 
	var maxNumberOfGuests: Long  = 0L
	def withmaxNumberOfGuests(p:Long):this.type ={ 	this.maxNumberOfGuests = p; 	this }

	/**
	 * max number of users in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of users in the time range.""" ,required = true)
	@BeanProperty 
	var maxNumberOfUsers: Long  = 0L
	def withmaxNumberOfUsers(p:Long):this.type ={ 	this.maxNumberOfUsers = p; 	this }

	/**
	 * in Bytes (repository + CDN)
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes (repository + CDN)""" ,required = true)
	@BeanProperty 
	var maxStorage: Long  = 0L
	def withmaxStorage(p:Long):this.type ={ 	this.maxStorage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthAudioVersions: Long  = 0L
	def withmonthAudioVersions(p:Long):this.type ={ 	this.monthAudioVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthImageVersions: Long  = 0L
	def withmonthImageVersions(p:Long):this.type ={ 	this.monthImageVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthOtherVersions: Long  = 0L
	def withmonthOtherVersions(p:Long):this.type ={ 	this.monthOtherVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthPageletVersions: Long  = 0L
	def withmonthPageletVersions(p:Long):this.type ={ 	this.monthPageletVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthPlaylistVersions: Long  = 0L
	def withmonthPlaylistVersions(p:Long):this.type ={ 	this.monthPlaylistVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthTotalVersions: Long  = 0L
	def withmonthTotalVersions(p:Long):this.type ={ 	this.monthTotalVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthUrlVersions: Long  = 0L
	def withmonthUrlVersions(p:Long):this.type ={ 	this.monthUrlVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var monthVideoVersions: Long  = 0L
	def withmonthVideoVersions(p:Long):this.type ={ 	this.monthVideoVersions = p; 	this }

	/**
	 * contents created in the month (based on creation date)
	 */
	//#SWG#@ApiModelProperty(value = """contents created in the month (based on creation date)""" ,required = true)
	@BeanProperty 
	@Deprecated
	var newContents: Long  = 0L
	@Deprecated
	def withnewContents(p:Long):this.type ={ 	this.newContents = p; 	this }

	/**
	 * additional info.
	 */
	//#SWG#@ApiModelProperty(value = """additional info.""" ,required = true)
	@BeanProperty 
	var otherInfo: String =_
	def withotherInfo(p:String):this.type ={ 	this.otherInfo = p; 	this }

	/**
	 * total number of Apps
	 */
	//#SWG#@ApiModelProperty(value = """total number of Apps""" ,required = true)
	@BeanProperty 
	var totalApps: Long  = 0L
	def withtotalApps(p:Long):this.type ={ 	this.totalApps = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalAudioVersions: Long  = 0L
	def withtotalAudioVersions(p:Long):this.type ={ 	this.totalAudioVersions = p; 	this }

	/**
	 * from traffic report
	 */
	//#SWG#@ApiModelProperty(value = """from traffic report""" ,required = true)
	@BeanProperty 
	var totalChinaHits: Long  = 0L
	def withtotalChinaHits(p:Long):this.type ={ 	this.totalChinaHits = p; 	this }

	/**
	 * China traffic in the time range:
	 * in Bytes
	 */
	//#SWG#@ApiModelProperty(value = """China traffic in the time range:
	//#SWGNL#in Bytes""" ,required = true)
	@BeanProperty 
	var totalChinaTraffic: Long  = 0L
	def withtotalChinaTraffic(p:Long):this.type ={ 	this.totalChinaTraffic = p; 	this }

	/**
	 * total contacts
	 */
	//#SWG#@ApiModelProperty(value = """total contacts""" ,required = true)
	@BeanProperty 
	var totalContacts: Long  = 0L
	def withtotalContacts(p:Long):this.type ={ 	this.totalContacts = p; 	this }

	/**
	 * number of contacts active in the time range. Used for BM 2017
	 */
	//#SWG#@ApiModelProperty(value = """number of contacts active in the time range. Used for BM 2017""" ,required = true)
	@BeanProperty 
	var totalContactsActive: Long  = 0L
	def withtotalContactsActive(p:Long):this.type ={ 	this.totalContactsActive = p; 	this }

	/**
	 * total contacts unmerged (number of unique anonymous contacts)
	 */
	//#SWG#@ApiModelProperty(value = """total contacts unmerged (number of unique anonymous contacts)""" ,required = true)
	@BeanProperty 
	var totalContactsUnmerged: Long  = 0L
	def withtotalContactsUnmerged(p:Long):this.type ={ 	this.totalContactsUnmerged = p; 	this }

	/**
	 * number of device active in the time range
	 */
	//#SWG#@ApiModelProperty(value = """number of device active in the time range""" ,required = true)
	@BeanProperty 
	@Deprecated
	var totalContactsUnmergedActive: Long  = 0L
	@Deprecated
	def withtotalContactsUnmergedActive(p:Long):this.type ={ 	this.totalContactsUnmergedActive = p; 	this }

	/**
	 * total number of contents not in trash (creation date based)
	 */
	//#SWG#@ApiModelProperty(value = """total number of contents not in trash (creation date based)""" ,required = true)
	@BeanProperty 
	@Deprecated
	var totalContents: Long  = 0L
	@Deprecated
	def withtotalContents(p:Long):this.type ={ 	this.totalContents = p; 	this }

	/**
	 * total number of users (Guest type)
	 */
	//#SWG#@ApiModelProperty(value = """total number of users (Guest type)""" ,required = true)
	@BeanProperty 
	var totalGuest: Long  = 0L
	def withtotalGuest(p:Long):this.type ={ 	this.totalGuest = p; 	this }

	/**
	 * from traffic report
	 */
	//#SWG#@ApiModelProperty(value = """from traffic report""" ,required = true)
	@BeanProperty 
	var totalHits: Long  = 0L
	def withtotalHits(p:Long):this.type ={ 	this.totalHits = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalImageVersions: Long  = 0L
	def withtotalImageVersions(p:Long):this.type ={ 	this.totalImageVersions = p; 	this }

	/**
	 * Not defined
	 */
	//#SWG#@ApiModelProperty(value = """Not defined""" ,required = true)
	@BeanProperty 
	var totalLiveTime: Long  = 0L
	def withtotalLiveTime(p:Long):this.type ={ 	this.totalLiveTime = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalOtherVersions: Long  = 0L
	def withtotalOtherVersions(p:Long):this.type ={ 	this.totalOtherVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalPageletVersions: Long  = 0L
	def withtotalPageletVersions(p:Long):this.type ={ 	this.totalPageletVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalPlaylistVersions: Long  = 0L
	def withtotalPlaylistVersions(p:Long):this.type ={ 	this.totalPlaylistVersions = p; 	this }

	/**
	 * in Bytes (repository + cdn )
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes (repository + cdn )""" ,required = true)
	@BeanProperty 
	var totalStorage: Long  = 0L
	def withtotalStorage(p:Long):this.type ={ 	this.totalStorage = p; 	this }

	/**
	 * world wide traffic in the time range:
	 * in Bytes
	 */
	//#SWG#@ApiModelProperty(value = """world wide traffic in the time range:
	//#SWGNL#in Bytes""" ,required = true)
	@BeanProperty 
	var totalTraffic: Long  = 0L
	def withtotalTraffic(p:Long):this.type ={ 	this.totalTraffic = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalUrlVersions: Long  = 0L
	def withtotalUrlVersions(p:Long):this.type ={ 	this.totalUrlVersions = p; 	this }

	/**
	 * total users
	 */
	//#SWG#@ApiModelProperty(value = """total users""" ,required = true)
	@BeanProperty 
	var totalUsers: Long  = 0L
	def withtotalUsers(p:Long):this.type ={ 	this.totalUsers = p; 	this }

	/**
	 * total number of versions (creation date based). Used with BM2018
	 */
	//#SWG#@ApiModelProperty(value = """total number of versions (creation date based). Used with BM2018""" ,required = true)
	@BeanProperty 
	var totalVersions: Long  = 0L
	def withtotalVersions(p:Long):this.type ={ 	this.totalVersions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalVideoVersions: Long  = 0L
	def withtotalVideoVersions(p:Long):this.type ={ 	this.totalVideoVersions = p; 	this }

	/**
	 * Total number of visits in the time range. BM2018 Intelligence module
	 */
	//#SWG#@ApiModelProperty(value = """Total number of visits in the time range. BM2018 Intelligence module""" ,required = true)
	@BeanProperty 
	var totalVisits: Long  = 0L
	def withtotalVisits(p:Long):this.type ={ 	this.totalVisits = p; 	this }

}
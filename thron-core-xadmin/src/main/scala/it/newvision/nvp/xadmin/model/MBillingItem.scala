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

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MBillingItem ={ 	this.clientId = p; 	this }

	/**
	 * 3x or 4x or disabled
	 */
	//#SWG#@ApiModelProperty(value = """3x or 4x or disabled""" ,required = true)
	@BeanProperty 
	var clientType: String =_
	def withclientType(p:String):MBillingItem ={ 	this.clientType = p; 	this }

	/**
	 * in Bytes
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes""" ,required = true)
	@BeanProperty 
	var totalTraffic: Long =_
	def withtotalTraffic(p:Long):MBillingItem ={ 	this.totalTraffic = p; 	this }

	/**
	 * from traffic report
	 */
	//#SWG#@ApiModelProperty(value = """from traffic report""" ,required = true)
	@BeanProperty 
	var totalHits: Long =_
	def withtotalHits(p:Long):MBillingItem ={ 	this.totalHits = p; 	this }

	/**
	 * in Bytes (repository + CDN)
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes (repository + CDN)""" ,required = true)
	@BeanProperty 
	var maxStorage: Long =_
	def withmaxStorage(p:Long):MBillingItem ={ 	this.maxStorage = p; 	this }

	/**
	 * in Bytes (repository + cdn )
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes (repository + cdn )""" ,required = true)
	@BeanProperty 
	var totalStorage: Long =_
	def withtotalStorage(p:Long):MBillingItem ={ 	this.totalStorage = p; 	this }

	/**
	 * Not defined
	 */
	//#SWG#@ApiModelProperty(value = """Not defined""" ,required = true)
	@BeanProperty 
	var totalLiveTime: Long =_
	def withtotalLiveTime(p:Long):MBillingItem ={ 	this.totalLiveTime = p; 	this }

	/**
	 * total users
	 */
	//#SWG#@ApiModelProperty(value = """total users""" ,required = true)
	@BeanProperty 
	var totalUsers: Long =_
	def withtotalUsers(p:Long):MBillingItem ={ 	this.totalUsers = p; 	this }

	/**
	 * total number of Apps
	 */
	//#SWG#@ApiModelProperty(value = """total number of Apps""" ,required = true)
	@BeanProperty 
	var totalApps: Long =_
	def withtotalApps(p:Long):MBillingItem ={ 	this.totalApps = p; 	this }

	/**
	 * total number of users (Guest type)
	 */
	//#SWG#@ApiModelProperty(value = """total number of users (Guest type)""" ,required = true)
	@BeanProperty 
	var totalGuest: Long =_
	def withtotalGuest(p:Long):MBillingItem ={ 	this.totalGuest = p; 	this }

	/**
	 * max number of users in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of users in the time range.""" ,required = true)
	@BeanProperty 
	var maxNumberOfUsers: Long =_
	def withmaxNumberOfUsers(p:Long):MBillingItem ={ 	this.maxNumberOfUsers = p; 	this }

	/**
	 * max number of users (guest) in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of users (guest) in the time range.""" ,required = true)
	@BeanProperty 
	var maxNumberOfGuests: Long =_
	def withmaxNumberOfGuests(p:Long):MBillingItem ={ 	this.maxNumberOfGuests = p; 	this }

	/**
	 * max number of apps in the time range.
	 */
	//#SWG#@ApiModelProperty(value = """max number of apps in the time range.""" ,required = true)
	@BeanProperty 
	var maxNumberOfApps: Long =_
	def withmaxNumberOfApps(p:Long):MBillingItem ={ 	this.maxNumberOfApps = p; 	this }

	/**
	 * total contacts
	 */
	//#SWG#@ApiModelProperty(value = """total contacts""" ,required = true)
	@BeanProperty 
	var totalContacts: Long =_
	def withtotalContacts(p:Long):MBillingItem ={ 	this.totalContacts = p; 	this }

	/**
	 * total contacts unmerged (number of unique anonymous contacts)
	 */
	//#SWG#@ApiModelProperty(value = """total contacts unmerged (number of unique anonymous contacts)""" ,required = true)
	@BeanProperty 
	var totalContactsUnmerged: Long =_
	def withtotalContactsUnmerged(p:Long):MBillingItem ={ 	this.totalContactsUnmerged = p; 	this }

	/**
	 * number of contacts active in the time range
	 */
	//#SWG#@ApiModelProperty(value = """number of contacts active in the time range""" ,required = true)
	@BeanProperty 
	var totalContactsActive: Long =_
	def withtotalContactsActive(p:Long):MBillingItem ={ 	this.totalContactsActive = p; 	this }

	/**
	 * number of unmerged contacts in the time range
	 */
	//#SWG#@ApiModelProperty(value = """number of unmerged contacts in the time range""" ,required = true)
	@BeanProperty 
	var totalContactsUnmergedActive: Long =_
	def withtotalContactsUnmergedActive(p:Long):MBillingItem ={ 	this.totalContactsUnmergedActive = p; 	this }

	/**
	 * additional info.
	 */
	//#SWG#@ApiModelProperty(value = """additional info.""" ,required = true)
	@BeanProperty 
	var otherInfo: String =_
	def withotherInfo(p:String):MBillingItem ={ 	this.otherInfo = p; 	this }

	/**
	 * total number of contents not in trash (creation date based)
	 */
	//#SWG#@ApiModelProperty(value = """total number of contents not in trash (creation date based)""" ,required = true)
	@BeanProperty 
	var totalContents: Long =_
	def withtotalContents(p:Long):MBillingItem ={ 	this.totalContents = p; 	this }

	/**
	 * contents created in the month (based on creation date)
	 */
	//#SWG#@ApiModelProperty(value = """contents created in the month (based on creation date)""" ,required = true)
	@BeanProperty 
	var newContents: Long =_
	def withnewContents(p:Long):MBillingItem ={ 	this.newContents = p; 	this }

}
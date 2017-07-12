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
 * The new User class. Used in the frontend public apps.
 * The vusers are not used for the acess in the platform but are used inside some
 * apps as final user to send information about a new incoming event, or to view
 * some premium contents of a particular WEBTV. Each single APP can use the
 * platform as SSO for the frontend user of the client.
 * 
 * Different type of Vusers:
 * <ul>
 * 	<li>paltformUsers: normal users having roles and permissions to acess the
 * administration consoles</li>
 * 	<li>generic visitor users: generic users withouth roles and permissions to the
 * 4me administration console, but can have some permission to use, share or
 * collaborate with some specific contents</li>
 * 	<li>contacts: generic contacts used for notifications. Contacts can be
 * transformed to a visitor or to a platform User.</li>
 * </ul>
 */
@XmlRootElement(name="MVUser") 
@XmlType(name="MVUser")
//#SWG#@ApiModel(description = """The new User class. Used in the frontend public apps.
//#SWGNL#The vusers are not used for the acess in the platform but are used inside some apps as final user to send information about a new incoming event, or to view some premium contents of a particular WEBTV. Each single APP can use the platform as SSO for the frontend user of the client.
//#SWGNL#
//#SWGNL#Different type of Vusers:
//#SWGNL#<ul>
//#SWGNL#	<li>paltformUsers: normal users having roles and permissions to acess the administration consoles</li>
//#SWGNL#	<li>generic visitor users: generic users withouth roles and permissions to the 4me administration console, but can have some permission to use, share or collaborate with some specific contents</li>
//#SWGNL#	<li>contacts: generic contacts used for notifications. Contacts can be transformed to a visitor or to a platform User.</li>
//#SWGNL#</ul>""")
class MVUser extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userType: MEUserType  = MEUserType.PLATFORM_USER
	def withuserType(p:MEUserType):this.type ={ 	this.userType = p; 	this }

	/**
	 * Deprecated by credential.passwordUpdate
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by credential.passwordUpdate""")
	@BeanProperty 
	@Deprecated
	var passwordUpdate: Date =_
	@Deprecated
	def withpasswordUpdate(p:Date):this.type ={ 	this.passwordUpdate = p; 	this }

	/**
	 * User creation date
	 */
	//#SWG#@ApiModelProperty(value = """User creation date""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * list the user roles and permission in platform.
	 */
	//#SWG#@ApiModelProperty(value = """list the user roles and permission in platform.""" ,required = true)
	@BeanProperty 
	var userCapabilities: MUserCapability  = new MUserCapability()
	def withuserCapabilities(p:MUserCapability):this.type ={ 	this.userCapabilities = p; 	this }

	/**
	 * Specify if the user is enable or not to use the platform
	 */
	//#SWG#@ApiModelProperty(value = """Specify if the user is enable or not to use the platform""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * After the expiry date the user can not access in the platform.
	 */
	//#SWG#@ApiModelProperty(value = """After the expiry date the user can not access in the platform.""")
	@BeanProperty 
	var expiryDate: Date =_
	def withexpiryDate(p:Date):this.type ={ 	this.expiryDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userPreferences: MVUserPreferences  = new MVUserPreferences()
	def withuserPreferences(p:MVUserPreferences):this.type ={ 	this.userPreferences = p; 	this }

	/**
	 * the username of the user who created the user
	 */
	//#SWG#@ApiModelProperty(value = """the username of the user who created the user""")
	@BeanProperty 
	var createdBy: String =_
	def withcreatedBy(p:String):this.type ={ 	this.createdBy = p; 	this }

	/**
	 * the profile picture used by the user in 4me platform
	 */
	//#SWG#@ApiModelProperty(value = """the profile picture used by the user in 4me platform""")
	@BeanProperty 
	var profilePicture: MImage =_
	def withprofilePicture(p:MImage):this.type ={ 	this.profilePicture = p; 	this }

	/**
	 * the acl rules  specific of the user
	 */
	//#SWG#@ApiModelProperty(value = """the acl rules  specific of the user""")
	@BeanProperty 
	var ownAclRules: List[MAclRule] = new ArrayList[MAclRule]
	def withownAclRules(p:List[MAclRule]):this.type ={ 	this.ownAclRules = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var userQuota: Long =_
	@Deprecated
	def withuserQuota(p:Long):this.type ={ 	this.userQuota = p; 	this }

	/**
	 * Define the lock template id applied to the user.
	 * Locking templates are used to restrict the user to change some specific fields
	 * of the VUserDetail, like password, email address, user fullname or other
	 * details.
	 * 
	 * 
	 * The only allowed value is "DEFAULT".
	 */
	//#SWG#@ApiModelProperty(value = """Define the lock template id applied to the user.
	//#SWGNL#Locking templates are used to restrict the user to change some specific fields of the VUserDetail, like password, email address, user fullname or other details.
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#The only allowed value is "DEFAULT".""")
	@BeanProperty 
	var userLockTemplate: String =_
	def withuserLockTemplate(p:String):this.type ={ 	this.userLockTemplate = p; 	this }

	/**
	 * list of imetadata (for intelligence)
	 */
	//#SWG#@ApiModelProperty(value = """list of imetadata (for intelligence)""")
	@BeanProperty 
	var imetadata: List[MIMetadata] = new ArrayList[MIMetadata]
	def withimetadata(p:List[MIMetadata]):this.type ={ 	this.imetadata = p; 	this }

	/**
	 * list of itags (for intelligence)
	 */
	//#SWG#@ApiModelProperty(value = """list of itags (for intelligence)""")
	@BeanProperty 
	var itags: List[MITag] = new ArrayList[MITag]
	def withitags(p:List[MITag]):this.type ={ 	this.itags = p; 	this }

	/**
	 * external ids of the user
	 */
	//#SWG#@ApiModelProperty(value = """external ids of the user""")
	@BeanProperty 
	var externalId: MIdExternal =_
	def withexternalId(p:MIdExternal):this.type ={ 	this.externalId = p; 	this }

	/**
	 * external reference of contactId
	 */
	//#SWG#@ApiModelProperty(value = """external reference of contactId""")
	@BeanProperty 
	var contactId: String =_
	def withcontactId(p:String):this.type ={ 	this.contactId = p; 	this }

	/**
	 * the user detail class, where are saved all informations about the user.
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """the user detail class, where are saved all informations about the user.""")
	var detail: MVUserDetail =_
	  def withdetail(p:MVUserDetail):this.type ={ 	this.detail = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var credential: MCredentialFull =_
	  def withcredential(p:MCredentialFull):this.type ={ 	this.credential = p; 	this }

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def displayName():String ={
		var result:String = ""
		Option(this.detail) foreach{n=> result = n.displayName()}
		result
	}

}
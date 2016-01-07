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
 * The user session object information.
 * The session object is shared in the cluster platform
 */
@XmlRootElement(name="MSession") 
@XmlType(name="MSession")
//#SWG#@ApiModel(description = """The user session object information.
//#SWGNL#The session object is shared in the cluster platform""")
class MSession extends Serializable {

	/**
	 * the token Id
	 */
	//#SWG#@ApiModelProperty(value = """the token Id""")
	@BeanProperty 
	var token: String  = ""
	def withtoken(p:String):MSession ={ 	this.token = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String  = ""
	def withclientId(p:String):MSession ={ 	this.clientId = p; 	this }

	/**
	 * could be:
	 * <ul>
	 * 	<li>the username for a logged user</li>
	 * 	<li>the pkey for an external share</li>
	 * 	<li>the username for the user's app</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """could be:
	//#SWGNL#<ul>
	//#SWGNL#	<li>the username for a logged user</li>
	//#SWGNL#	<li>the pkey for an external share</li>
	//#SWGNL#	<li>the username for the user's app</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var subjectId: String =_
	def withsubjectId(p:String):MSession ={ 	this.subjectId = p; 	this }

	/**
	 * the aclSubjectClass:
	 * <ul>
	 * 	<li>USER</li>
	 * 	<li>APP</li>
	 * 	<li>CUSTOM (shared by pkey)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """the aclSubjectClass:
	//#SWGNL#<ul>
	//#SWGNL#	<li>USER</li>
	//#SWGNL#	<li>APP</li>
	//#SWGNL#	<li>CUSTOM (shared by pkey)</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var subjectClass: MEObjClass =_
	def withsubjectClass(p:MEObjClass):MSession ={ 	this.subjectClass = p; 	this }

	/**
	 * used to indicate that the user do not use the automatic acl validation in the
	 * services (3.x mode)
	 */
	//#SWG#@ApiModelProperty(value = """used to indicate that the user do not use the automatic acl validation in the services (3.x mode)""" ,required = true)
	@BeanProperty 
	var aclDisabled: Boolean  = true
	def withaclDisabled(p:Boolean):MSession ={ 	this.aclDisabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var username: String  = ""
	def withusername(p:String):MSession ={ 	this.username = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userEmail: String  = ""
	def withuserEmail(p:String):MSession ={ 	this.userEmail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userFullName: String  = ""
	def withuserFullName(p:String):MSession ={ 	this.userFullName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userCompanyName: String  = ""
	def withuserCompanyName(p:String):MSession ={ 	this.userCompanyName = p; 	this }

	/**
	 * bind MEUserType enumeration
	 */
	//#SWG#@ApiModelProperty(value = """bind MEUserType enumeration""")
	@BeanProperty 
	var userType: String  = ""
	def withuserType(p:String):MSession ={ 	this.userType = p; 	this }

	/**
	 * used to create session based on different context (the user is logged for a
	 * specific group). If empty the user is using the default session.
	 */
	//#SWG#@ApiModelProperty(value = """used to create session based on different context (the user is logged for a specific group). If empty the user is using the default session.""")
	@BeanProperty 
	var groupId: String =_
	def withgroupId(p:String):MSession ={ 	this.groupId = p; 	this }

	/**
	 * the list of linked groups of user, used by acl services to verify and filter
	 * search results
	 */
	//#SWG#@ApiModelProperty(value = """the list of linked groups of user, used by acl services to verify and filter search results""")
	@BeanProperty 
	var linkedGroupIds: List[String] = new ArrayList[String]
	def withlinkedGroupIds(p:List[String]):MSession ={ 	this.linkedGroupIds = p; 	this }

	/**
	 * the acl rules specific of the user
	 */
	//#SWG#@ApiModelProperty(value = """the acl rules specific of the user""")
	@BeanProperty 
	var ownAclRules: List[MAclRule] = new ArrayList[MAclRule]
	def withownAclRules(p:List[MAclRule]):MSession ={ 	this.ownAclRules = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var expirationDate: Date =_
	def withexpirationDate(p:Date):MSession ={ 	this.expirationDate = p; 	this }

	/**
	 * the list of available capabilities and roles of the user and the capabilities
	 * inherit by the groups.
	 */
	//#SWG#@ApiModelProperty(value = """the list of available capabilities and roles of the user and the capabilities inherit by the groups.""")
	@BeanProperty 
	var userCapabilities: List[MUserCapabilitiesByContext] = new ArrayList[MUserCapabilitiesByContext]
	def withuserCapabilities(p:List[MUserCapabilitiesByContext]):MSession ={ 	this.userCapabilities = p; 	this }

	/**
	 * show thee running mode of the clientId:
	 * <ul>
	 * 	<li>OLD (3x mode)</li>
	 * 	<li>LAST</li>
	 * </ul>
	 * 
	 * Used to enable or disable the Audit
	 */
	//#SWG#@ApiModelProperty(value = """show thee running mode of the clientId:
	//#SWGNL#<ul>
	//#SWGNL#	<li>OLD (3x mode)</li>
	//#SWGNL#	<li>LAST</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Used to enable or disable the Audit""")
	@BeanProperty 
	var clientRunningMode: MEMode  = MEMode.OLD
	def withclientRunningMode(p:MEMode):MSession ={ 	this.clientRunningMode = p; 	this }

	/**
	 * Optional. client IP address used for Audit.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. client IP address used for Audit.""")
	@BeanProperty 
	var clientIp: String =_
	def withclientIp(p:String):MSession ={ 	this.clientIp = p; 	this }

	/**
	 * Optional. Used for Audit
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used for Audit""")
	@BeanProperty 
	var userAgent: String =_
	def withuserAgent(p:String):MSession ={ 	this.userAgent = p; 	this }

	/**
	 * Optional. Used for Audit to store the full user agent string coming from
	 * clients 
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used for Audit to store the full user agent string coming from clients """)
	@BeanProperty 
	var fullUserAgent: String =_
	def withfullUserAgent(p:String):MSession ={ 	this.fullUserAgent = p; 	this }

	/**
	 * username of the user that impersonate the session.
	 */
	//#SWG#@ApiModelProperty(value = """username of the user that impersonate the session.""" ,required = true)
	@BeanProperty 
	var disguiseUsername: String  = ""
	def withdisguiseUsername(p:String):MSession ={ 	this.disguiseUsername = p; 	this }

	/**
	 * fullName of the user that impersonates the session
	 */
	//#SWG#@ApiModelProperty(value = """fullName of the user that impersonates the session""" ,required = true)
	@BeanProperty 
	var disguiseUserFullName: String  = ""
	def withdisguiseUserFullName(p:String):MSession ={ 	this.disguiseUserFullName = p; 	this }

	/**
	 * userType of the user that impersonates the session
	 */
	//#SWG#@ApiModelProperty(value = """userType of the user that impersonates the session""")
	@BeanProperty 
	var disguiseUserType: String  = ""
	def withdisguiseUserType(p:String):MSession ={ 	this.disguiseUserType = p; 	this }

	/**
	 * subjectClass of the user that impersonates the session
	 */
	//#SWG#@ApiModelProperty(value = """subjectClass of the user that impersonates the session""" ,required = true)
	@BeanProperty 
	var disguiseUserSubjectClass: MEObjClass =_
	def withdisguiseUserSubjectClass(p:MEObjClass):MSession ={ 	this.disguiseUserSubjectClass = p; 	this }

	/**
	 * the list of classifications seen by the user or by one of its groups.
	 */
	//#SWG#@ApiModelProperty(value = """the list of classifications seen by the user or by one of its groups.""")
	@BeanProperty 
	var userClassifications: List[MClassificationMinimal] = new ArrayList[MClassificationMinimal]
	def withuserClassifications(p:List[MClassificationMinimal]):MSession ={ 	this.userClassifications = p; 	this }

	/**
	 * create a new session from an other
	 * @param s : MSession
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(s: MSession){
		this()
		this.setAclDisabled(s.getAclDisabled)
		this.setClientId(s.getClientId)
		this.setClientRunningMode(s.getClientRunningMode)
		this.setExpirationDate(s.getExpirationDate)
		this.setGroupId(s.getGroupId)
		this.setLinkedGroupIds(s.getLinkedGroupIds)
		this.setOwnAclRules(s.getOwnAclRules)
		this.setSubjectClass(s.getSubjectClass)
		this.setSubjectId(s.getSubjectId)
		this.setToken(s.getToken)
		this.setUserCapabilities(s.getUserCapabilities)
		this.setUserCompanyName(s.getUserCompanyName)
		this.setUserEmail(s.getUserEmail)
		this.setUserFullName(s.getUserFullName)
		this.setUsername(s.getUsername)
		this.setUserType(s.getUserType)
		this.setUserAgent(s.getUserAgent)
		this.setFullUserAgent(s.getFullUserAgent)
		this.setClientIp(s.getClientIp)
		this.setDisguiseUsername(s.getDisguiseUsername)
		this.setDisguiseUserFullName(s.getDisguiseUserFullName)
		this.setDisguiseUserType(s.getDisguiseUserType)
		this.setDisguiseUserSubjectClass(s.getDisguiseUserSubjectClass)
		this.setUserClassifications(s.getUserClassifications)
	}

	/**
	 * true if the session has disabledAcl or a special role
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def doesIgnoreAcl():Boolean ={
		 this.aclDisabled ||
		 this.fullUserCapabilities().userRoles.contains("CORE_ADMINISTRATOR")
	}

	/**
	 * return the full list of available capabilities (direct and inherited by groups)
	 * @return MUserCapability
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def fullUserCapabilities():MUserCapability ={
		import scala.collection.JavaConversions._
		val fullcapabilities = new MUserCapability
		this.userCapabilities.foreach{uc=>
			fullcapabilities.userRoles.addAll(uc.capability.userRoles)
			fullcapabilities.capabilities.addAll(uc.capability.capabilities)
			fullcapabilities.enabledSolutions.addAll(uc.capability.enabledSolutions)
		}
		fullcapabilities.userRoles = fullcapabilities.userRoles.toSet[String].toSeq
		fullcapabilities.capabilities = fullcapabilities.capabilities.toSet[String].toSeq
		fullcapabilities.enabledSolutions = fullcapabilities.enabledSolutions.toSet[String].toSeq
	
		fullcapabilities
	}

	/**
	 * Filters userClassifications using classificationIds in all userCapabilities
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterUserClassifications(){
		import scala.collection.JavaConversions._
		val classificationIds = userCapabilities.flatMap(_.classificationIds)
		this.setUserClassifications(userClassifications.filter(c => classificationIds.contains(c.id)))
	}

	/**
	 * @param uc : MUserCapabilitiesByContext
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def upsertUserCapability(uc: MUserCapabilitiesByContext){
		import scala.collection.JavaConversions._
		this.userCapabilities = this.userCapabilities.filter(c=> c.context!=uc.context) :+ uc
	}

}
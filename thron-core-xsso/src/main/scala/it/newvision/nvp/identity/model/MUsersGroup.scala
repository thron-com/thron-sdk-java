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
 * The UserGroup class is used to organize a set of user in differents groups
 * inside the organisation. The UserGroups are also used to record some common
 * information for a set of users, like Roles within the platform, or  a list of
 * contacts (external users) to use for notification or for collaboration in the
 * platform.
 */
@XmlRootElement(name="MUsersGroup") 
@XmlType(name="MUsersGroup")
//#SWG#@ApiModel(description = """The UserGroup class is used to organize a set of user in differents groups inside the organisation. The UserGroups are also used to record some common information for a set of users, like Roles within the platform, or  a list of contacts (external users) to use for notification or for collaboration in the platform.""")
class MUsersGroup extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupType: MEGroupType  = MEGroupType.PLATFORM
	def withgroupType(p:MEGroupType):this.type ={ 	this.groupType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * the name of the group
	 * Constraints:
	 * -) max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """the name of the group
	//#SWGNL#Constraints: 
	//#SWGNL#-) max length = 50""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Constraints:
	 * -) max length = 200
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: 
	//#SWGNL#-) max length = 200""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * user creation date
	 */
	//#SWG#@ApiModelProperty(value = """user creation date""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * Toggle group active state. When a group is not active it will not impact on ACL
	 * and Permissions.
	 */
	//#SWG#@ApiModelProperty(value = """Toggle group active state. When a group is not active it will not impact on ACL and Permissions.""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * Used as roles template. It is possible to define the UserGroup roles that are
	 * applied to each user inside the group. The userRoles are derived from the list
	 * of groupRoles where the user are linked
	 */
	//#SWG#@ApiModelProperty(value = """Used as roles template. It is possible to define the UserGroup roles that are applied to each user inside the group. The userRoles are derived from the list of groupRoles where the user are linked""" ,required = true)
	@BeanProperty 
	var groupCapabilities: MUserCapability  = new MUserCapability()
	def withgroupCapabilities(p:MUserCapability):this.type ={ 	this.groupCapabilities = p; 	this }

	/**
	 * the username of the group owner.
	 * Only for PLATFORM_BLIND, SHARED_CONTACTS_PRIVATE groups type (not for PLATFORM
	 * groups type)
	 */
	//#SWG#@ApiModelProperty(value = """the username of the group owner. 
	//#SWGNL#Only for PLATFORM_BLIND, SHARED_CONTACTS_PRIVATE groups type (not for PLATFORM groups type)""")
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):this.type ={ 	this.ownerUsername = p; 	this }

	/**
	 * the acl rules  specific of the group
	 */
	//#SWG#@ApiModelProperty(value = """the acl rules  specific of the group""")
	@BeanProperty 
	var ownAclRules: List[MAclRule] = new ArrayList[MAclRule]
	def withownAclRules(p:List[MAclRule]):this.type ={ 	this.ownAclRules = p; 	this }

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
	 * external ids of the User Group.
	 */
	//#SWG#@ApiModelProperty(value = """external ids of the User Group.""")
	@BeanProperty 
	var externalId: MIdExternal =_
	def withexternalId(p:MIdExternal):this.type ={ 	this.externalId = p; 	this }

	/**
	 * list of metadata
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """list of metadata""")
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).exists(s => s.length<=50 && s.length>0 )&&
		Option(description).forall(_.length<=200)
	}

	/**
	 * @param id : String
	 * @param name : String
	 * @param description : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(id: String, 
			name: String, 
			description: String){
		this()
		this.id = id
		this.name = name
		this.description = description
	}

}
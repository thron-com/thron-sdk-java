package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.acl.MAclUsersGroupCriteria
import it.newvision.nvp.identity.model.MEGroupType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUsersGroupCriteria") 
@XmlType(name="MUsersGroupCriteria")
//#SWG#@ApiModel(description = """""")
class MUsersGroupCriteria extends Serializable {

	/**
	 * group ids
	 */
	//#SWG#@ApiModelProperty(value = """group ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * Text search in name and description fields
	 * Example: "red apple" text search match labels like "Red Apple ...", "red Apple .
	 * .."
	 */
	//#SWG#@ApiModelProperty(value = """Text search in name and description fields
	//#SWGNL#Example: "red apple" text search match labels like "Red Apple ...", "red Apple ..."""")
	@BeanProperty 
	var textSearch: String =_
	def withtextSearch(p:String):this.type ={ 	this.textSearch = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedUsername: String =_
	def withlinkedUsername(p:String):this.type ={ 	this.linkedUsername = p; 	this }

	/**
	 * used to filter the groups with a specific UserRole defined (in
	 * groupCapabilities.userRoles)
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the groups with a specific UserRole defined (in groupCapabilities.userRoles)""")
	@BeanProperty 
	var groupRoles: List[String] = new ArrayList[String]
	def withgroupRoles(p:List[String]):this.type ={ 	this.groupRoles = p; 	this }

	/**
	 * filter the groups having the usersEnabledSolutions in groupCapabilities.
	 * enabledSolutions.
	 */
	//#SWG#@ApiModelProperty(value = """filter the groups having the usersEnabledSolutions in groupCapabilities.enabledSolutions.""")
	@BeanProperty 
	var usersEnabledSolutions: List[String] = new ArrayList[String]
	def withusersEnabledSolutions(p:List[String]):this.type ={ 	this.usersEnabledSolutions = p; 	this }

	/**
	 * used to find only the groups shared with specific rules
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the groups shared with specific rules""")
	@BeanProperty 
	var acl: MAclUsersGroupCriteria =_
	def withacl(p:MAclUsersGroupCriteria):this.type ={ 	this.acl = p; 	this }

	/**
	 * search by group type
	 */
	//#SWG#@ApiModelProperty(value = """search by group type""")
	@BeanProperty 
	var groupType: List[MEGroupType] = new ArrayList[MEGroupType]
	def withgroupType(p:List[MEGroupType]):this.type ={ 	this.groupType = p; 	this }

	/**
	 * search by usernames
	 */
	//#SWG#@ApiModelProperty(value = """search by usernames""")
	@BeanProperty 
	var ownerUsername: List[String] = new ArrayList[String]
	def withownerUsername(p:List[String]):this.type ={ 	this.ownerUsername = p; 	this }

	/**
	 * external ids of the user
	 */
	//#SWG#@ApiModelProperty(value = """external ids of the user""")
	@BeanProperty 
	var externalId: String =_
	def withexternalId(p:String):this.type ={ 	this.externalId = p; 	this }

}
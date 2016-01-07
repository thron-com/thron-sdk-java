package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEUserType
import it.newvision.nvp.identity.services.model.acl.MAclUsersGroupCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the user search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MVUserCriteria") 
@XmlType(name="MVUserCriteria")
//#SWG#@ApiModel(description = """main class used to define the user search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MVUserCriteria extends Serializable {

	/**
	 * used to filter the users with one of the given usernames. Commonly used to have
	 * the list of users with a username or WITHOUT a username.
	 * The list of usernames is partitioned in two set:
	 * <ul>
	 * 	<li>uns = the list of username</li>
	 * 	<li>nuns = the list of !_<username></li>
	 * </ul>
	 * The users are filtered matching the condition:
	 * <ul>
	 * 	<li>(users WITH uns) AND (users WITHOUT nuns)</li>
	 * </ul>
	 * 
	 * Examples using json format:
	 * 
	 * <ul>
	 * 	<li>filter users with one of the usernames a,b</li>
	 * </ul>
	 * 	"usernames": ["a","b"]
	 * <ul>
	 * 	<li>filter users WITHOUT any of the usernames a,b</li>
	 * </ul>
	 * 	"usernames": ["!_a","!_b"]
	 * <ul>
	 * 	<li>filter users with one of the usernames a,b AND WITHOUT any of the
	 * usernames c,d</li>
	 * </ul>
	 * 	"usernames": ["a","b","!_c","!_d"]
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the users with one of the given usernames. Commonly used to have the list of users with a username or WITHOUT a username.
	//#SWGNL#The list of usernames is partitioned in two set:
	//#SWGNL#<ul>
	//#SWGNL#	<li>uns = the list of username</li>
	//#SWGNL#	<li>nuns = the list of !_<username></li>
	//#SWGNL#</ul>
	//#SWGNL#The users are filtered matching the condition:
	//#SWGNL#<ul>
	//#SWGNL#	<li>(users WITH uns) AND (users WITHOUT nuns)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Examples using json format:
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users with one of the usernames a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"usernames": ["a","b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users WITHOUT any of the usernames a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"usernames": ["!_a","!_b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users with one of the usernames a,b AND WITHOUT any of the usernames c,d</li>
	//#SWGNL#</ul>
	//#SWGNL#	"usernames": ["a","b","!_c","!_d"]""")
	@BeanProperty 
	var usernames: List[String] = new ArrayList[String]
	def withusernames(p:List[String]):MVUserCriteria ={ 	this.usernames = p; 	this }

	/**
	 * search by userType
	 */
	//#SWG#@ApiModelProperty(value = """search by userType""")
	@BeanProperty 
	var userTypes: List[MEUserType] = new ArrayList[MEUserType]
	def withuserTypes(p:List[MEUserType]):MVUserCriteria ={ 	this.userTypes = p; 	this }

	/**
	 * used to filter the users linked to the given groups. Commonly used to have the
	 * list of users linked to a group or NOT linked to a group.
	 * The list of linkedGroupIds is partitioned in two set:
	 * <ul>
	 * 	<li>gids = the list of groupId</li>
	 * 	<li>ngids = the list of !_<groupId></li>
	 * </ul>
	 * The users are filtered matching the condition:
	 * <ul>
	 * 	<li>(users IN gids) AND (users NOT IN ngids )</li>
	 * </ul>
	 * 
	 * Examples using json format:
	 * 
	 * <ul>
	 * 	<li>filter users which are linked to one of the groups a,b</li>
	 * </ul>
	 * 	"linkedGroupsIds": ["a","b"]
	 * <ul>
	 * 	<li>filter users which are NOT linked to any of the groups a,b</li>
	 * </ul>
	 * 	"linkedGroupsIds": ["!_a","!_b"]
	 * <ul>
	 * 	<li>filter users which are linked to one of the groups a,b AND NOT linked to
	 * any of the groups c,d</li>
	 * </ul>
	 * 	"linkedGroupsIds": ["a","b","!_c","!_d"]
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the users linked to the given groups. Commonly used to have the list of users linked to a group or NOT linked to a group.
	//#SWGNL#The list of linkedGroupIds is partitioned in two set:
	//#SWGNL#<ul>
	//#SWGNL#	<li>gids = the list of groupId</li>
	//#SWGNL#	<li>ngids = the list of !_<groupId></li>
	//#SWGNL#</ul>
	//#SWGNL#The users are filtered matching the condition:
	//#SWGNL#<ul>
	//#SWGNL#	<li>(users IN gids) AND (users NOT IN ngids )</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Examples using json format:
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users which are linked to one of the groups a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedGroupsIds": ["a","b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users which are NOT linked to any of the groups a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedGroupsIds": ["!_a","!_b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter users which are linked to one of the groups a,b AND NOT linked to any of the groups c,d</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedGroupsIds": ["a","b","!_c","!_d"]""")
	@BeanProperty 
	var linkedGroupsIds: List[String] = new ArrayList[String]
	def withlinkedGroupsIds(p:List[String]):MVUserCriteria ={ 	this.linkedGroupsIds = p; 	this }

	/**
	 * search by AppId in MVuser.usercapabilities.enabledSolutions
	 */
	//#SWG#@ApiModelProperty(value = """search by AppId in MVuser.usercapabilities.enabledSolutions""")
	@BeanProperty 
	var solutions: List[String] = new ArrayList[String]
	def withsolutions(p:List[String]):MVUserCriteria ={ 	this.solutions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):MVUserCriteria ={ 	this.active = p; 	this }

	/**
	 * filter the users matching one of the specified roles
	 */
	//#SWG#@ApiModelProperty(value = """filter the users matching one of the specified roles""")
	@BeanProperty 
	var userRoles: List[String] = new ArrayList[String]
	def withuserRoles(p:List[String]):MVUserCriteria ={ 	this.userRoles = p; 	this }

	/**
	 * text search works over username,firstName, lastName username and email
	 * addresses using the following approach.
	 * 
	 * detail.name.firstName + detail.name.lastName: search text in fields
	 * or credential.username: search text in field
	 * or detail.emails.email: search text in field
	 */
	//#SWG#@ApiModelProperty(value = """text search works over username,firstName, lastName username and email addresses using the following approach.
	//#SWGNL#
	//#SWGNL#detail.name.firstName + detail.name.lastName: search text in fields
	//#SWGNL#or credential.username: search text in field
	//#SWGNL#or detail.emails.email: search text in field""")
	@BeanProperty 
	var textSearch: String =_
	def withtextSearch(p:String):MVUserCriteria ={ 	this.textSearch = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastname: String =_
	def withlastname(p:String):MVUserCriteria ={ 	this.lastname = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var firstname: String =_
	def withfirstname(p:String):MVUserCriteria ={ 	this.firstname = p; 	this }

	/**
	 * used to find only the users shared with specific rules
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the users shared with specific rules""")
	@BeanProperty 
	var acl: MAclUsersGroupCriteria =_
	def withacl(p:MAclUsersGroupCriteria):MVUserCriteria ={ 	this.acl = p; 	this }

	/**
	 * used to search on a specific intelligence tag
	 * 
	 * Constraint:
	 * <ul>
	 * 	<li>max length 10  </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """used to search on a specific intelligence tag
	//#SWGNL#
	//#SWGNL#Constraint:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length 10  </li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var itagOp: MITagCriteriaOption =_
	def withitagOp(p:MITagCriteriaOption):MVUserCriteria ={ 	this.itagOp = p; 	this }

	/**
	 * filter the users matching the phone number.
	 * 
	 * detail.phoneNumbers.phoneNumber: search text as regexp (use \Q<text to
	 * search>\E for simple text search)
	 */
	//#SWG#@ApiModelProperty(value = """filter the users matching the phone number.
	//#SWGNL#
	//#SWGNL#detail.phoneNumbers.phoneNumber: search text as regexp (use \Q<text to search>\E for simple text search)""")
	@BeanProperty 
	var phoneNumber: String =_
	def withphoneNumber(p:String):MVUserCriteria ={ 	this.phoneNumber = p; 	this }

	/**
	 * filter the users matching the email address (as regex)
	 * 
	 * detail.emails.email: search text as regexp (use \Q<text to search>\E for simple
	 * text search)
	 */
	//#SWG#@ApiModelProperty(value = """filter the users matching the email address (as regex)
	//#SWGNL#
	//#SWGNL#detail.emails.email: search text as regexp (use \Q<text to search>\E for simple text search)""")
	@BeanProperty 
	var email: String =_
	def withemail(p:String):MVUserCriteria ={ 	this.email = p; 	this }

	/**
	 * search by usernames of who created the user (the owner)
	 */
	//#SWG#@ApiModelProperty(value = """search by usernames of who created the user (the owner)""")
	@BeanProperty 
	var createdBy: List[String] = new ArrayList[String]
	def withcreatedBy(p:List[String]):MVUserCriteria ={ 	this.createdBy = p; 	this }

	/**
	 * external ids of the user
	 */
	//#SWG#@ApiModelProperty(value = """external ids of the user""")
	@BeanProperty 
	var externalId: String =_
	def withexternalId(p:String):MVUserCriteria ={ 	this.externalId = p; 	this }

}
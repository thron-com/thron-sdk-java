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
 * The UserCapabilities object can be used as capability white list or black list,
 * specifying which capabilities are active for the user, or only the capabilities
 * not active ("allow" attribute equals false)
 * 
 * Naming Convetion Capability: <SOLUTION>_<capabilityName>
 * Naming Convetion Roles: <SOLUTION>_<roleName>
 * Solutions: VIEW,PLAY,CORE
 * Example:
 * roles: VIEW_ADMIN, VIEW_AUTHOR, VIEW_EDITOR,
 * PLAY_ADMIN, PLAY_DEVICEMANAGER
 * 
 * capabilities:  VIEW_createuser, VIEW_createcontent, VIEW_publishcontent,
 * PLAY_adddevice
 * 
 * 
 *  
 */
@XmlRootElement(name="MUserCapability") 
@XmlType(name="MUserCapability")
//#SWG#@ApiModel(description = """The UserCapabilities object can be used as capability white list or black list, specifying which capabilities are active for the user, or only the capabilities not active ("allow" attribute equals false)
//#SWGNL#
//#SWGNL#Naming Convetion Capability: <SOLUTION>_<capabilityName>
//#SWGNL#Naming Convetion Roles: <SOLUTION>_<roleName>
//#SWGNL#Solutions: VIEW,PLAY,CORE
//#SWGNL#Example:
//#SWGNL#roles: VIEW_ADMIN, VIEW_AUTHOR, VIEW_EDITOR,
//#SWGNL#PLAY_ADMIN, PLAY_DEVICEMANAGER
//#SWGNL#
//#SWGNL#capabilities:  VIEW_createuser, VIEW_createcontent, VIEW_publishcontent, PLAY_adddevice
//#SWGNL#
//#SWGNL#
//#SWGNL#  """)
class MUserCapability extends Serializable {

	/**
	 * the list of available/disabled capabilities
	 */
	//#SWG#@ApiModelProperty(value = """the list of available/disabled capabilities""")
	@BeanProperty 
	var capabilities: List[String] = new ArrayList[String]
	def withcapabilities(p:List[String]):MUserCapability ={ 	this.capabilities = p; 	this }

	/**
	 * The userRoles are derived from the list of groupRoles where the user are linked,
	 * only if the userRoles list is empty. The role CORE_NO_ROLES is used to specify
	 * no Roles
	 */
	//#SWG#@ApiModelProperty(value = """The userRoles are derived from the list of groupRoles where the user are linked, only if the userRoles list is empty. The role CORE_NO_ROLES is used to specify no Roles""")
	@BeanProperty 
	var userRoles: List[String] = new ArrayList[String]
	def withuserRoles(p:List[String]):MUserCapability ={ 	this.userRoles = p; 	this }

	/**
	 * this attribute specify that the user can enter in one of the listed 4ME
	 * solutions (App).
	 */
	//#SWG#@ApiModelProperty(value = """this attribute specify that the user can enter in one of the listed 4ME solutions (App).""")
	@BeanProperty 
	var enabledSolutions: List[String] = new ArrayList[String]
	def withenabledSolutions(p:List[String]):MUserCapability ={ 	this.enabledSolutions = p; 	this }

	/**
	 * Check if the give capability is active or not in the current UserCapability object
	 * @param capability : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def capabilityIsActive(capability: String):Boolean ={
		import scala.collection.JavaConversions._
		this.capabilities exists (x=> x==capability)
	}

	/**
	 * Check if the give role is active or not in the current UserCapability object
	 * @param role : String
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def roleIsActive(role: String):Boolean ={
		import scala.collection.JavaConversions._
		this.userRoles exists (x=> x==role)
	
	}

}
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
 * 
 * 
 *  
 */
@XmlRootElement(name="MUserCapability") 
@XmlType(name="MUserCapability")
//#SWG#@ApiModel(description = """
//#SWGNL#
//#SWGNL#  """)
class MUserCapability extends Serializable {

	/**
	 * the list of available/disabled capabilities
	 */
	//#SWG#@ApiModelProperty(value = """the list of available/disabled capabilities""")
	@BeanProperty 
	var capabilities: List[String] = new ArrayList[String]
	def withcapabilities(p:List[String]):this.type ={ 	this.capabilities = p; 	this }

	/**
	 * The userRoles are derived from the list of groupRoles where the user are linked,
	 * only if the userRoles list is empty. The role CORE_NO_ROLES is used to specify
	 * no Roles
	 */
	//#SWG#@ApiModelProperty(value = """The userRoles are derived from the list of groupRoles where the user are linked, only if the userRoles list is empty. The role CORE_NO_ROLES is used to specify no Roles""")
	@BeanProperty 
	var userRoles: List[String] = new ArrayList[String]
	def withuserRoles(p:List[String]):this.type ={ 	this.userRoles = p; 	this }

	/**
	 * List of enabled Apps
	 */
	//#SWG#@ApiModelProperty(value = """List of enabled Apps""")
	@BeanProperty 
	@Deprecated
	var enabledSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withenabledSolutions(p:List[String]):this.type ={ 	this.enabledSolutions = p; 	this }

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
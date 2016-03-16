package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MMetadata
import it.newvision.nvp.identity.model.MUserCapability
import it.newvision.nvp.identity.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MUserGroupUpdate") 
@XmlType(name="MUserGroupUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MUserGroupUpdate extends MUpdater with Serializable  {

	/**
	 * Deprecated.
	 * Optional. List of generic custom metadata for the group.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Optional. List of generic custom metadata for the group.""")
	@BeanProperty 
	@Deprecated
	var metadata: List[MMetadata] =_
	@Deprecated
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * the name of the group
	 */
	//#SWG#@ApiModelProperty(value = """the name of the group""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * Specify if the group is enable or not to use the platform.
	 * Users inherit roles and acl only from active linked groups.
	 */
	//#SWG#@ApiModelProperty(value = """Specify if the group is enable or not to use the platform.
	//#SWGNL#Users inherit roles and acl only from active linked groups.""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * Used as roles template. It is possible to define the UserGroup roles that are
	 * be applied to each user inside the group. The userRoles are derived from the
	 * list of groupRoles where the user are linked.
	 * 
	 * Constraints:
	 * 
	 * groupCapabilities can be applied only to PLATFORM groups (not to blind groups)
	 */
	//#SWG#@ApiModelProperty(value = """Used as roles template. It is possible to define the UserGroup roles that are be applied to each user inside the group. The userRoles are derived from the list of groupRoles where the user are linked.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#
	//#SWGNL#groupCapabilities can be applied only to PLATFORM groups (not to blind groups)""")
	@BeanProperty 
	var groupCapabilities: MUserCapability =_
	def withgroupCapabilities(p:MUserCapability):this.type ={ 	this.groupCapabilities = p; 	this }

}
package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUserCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MGroupUpdateData") 
@XmlType(name="MGroupUpdateData")
//#SWG#@ApiModel(description = """""")
class MGroupUpdateData extends Serializable {

	/**
	 * Toggle group active state. When a group is not active it will not impact on ACL
	 * and Permissions.
	 */
	//#SWG#@ApiModelProperty(value = """Toggle group active state. When a group is not active it will not impact on ACL and Permissions.""")
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * short description
	 */
	//#SWG#@ApiModelProperty(value = """short description""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * Used as roles template. It is possible to define the UserGroup roles that HAVE
	 * TO be applied to each user inside the group. The userRoles are derived from the
	 * list of groupRoles where the user are linked.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>groupCapabilities can be applied only to PLATFORM groups (no for blind
	 * groups)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used as roles template. It is possible to define the UserGroup roles that HAVE TO be applied to each user inside the group. The userRoles are derived from the list of groupRoles where the user are linked.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>groupCapabilities can be applied only to PLATFORM groups (no for blind groups)</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var groupCapabilities: MUserCapability  = new MUserCapability()
	def withgroupCapabilities(p:MUserCapability):this.type ={ 	this.groupCapabilities = p; 	this }

	/**
	 * the name of the group
	 */
	//#SWG#@ApiModelProperty(value = """the name of the group""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).exists(s => s.length<=50 && s.length>0 )&&
		Option(description).forall(_.length<=200)
	}

}
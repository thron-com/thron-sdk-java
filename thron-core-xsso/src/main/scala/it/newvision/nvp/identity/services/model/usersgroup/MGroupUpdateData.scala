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
	 * the name of the group
	 */
	//#SWG#@ApiModelProperty(value = """the name of the group""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * Specify if the user is enable or not to use the platform
	 */
	//#SWG#@ApiModelProperty(value = """Specify if the user is enable or not to use the platform""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * Used as roles template. It is possible to define the UserGroup roles that are
	 * be applied to each user inside the group. The userRoles are derived from the
	 * list of groupRoles where the user are linked.
	 * 
	 * Constraints:
	 * 
	 * groupCapabilities can be applied only to PLATFORM groups (no to private or
	 * blind groups)
	 */
	//#SWG#@ApiModelProperty(value = """Used as roles template. It is possible to define the UserGroup roles that are be applied to each user inside the group. The userRoles are derived from the list of groupRoles where the user are linked.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#
	//#SWGNL#groupCapabilities can be applied only to PLATFORM groups (no to private or blind groups)""" ,required = true)
	@BeanProperty 
	var groupCapabilities: MUserCapability  = new MUserCapability()
	def withgroupCapabilities(p:MUserCapability):this.type ={ 	this.groupCapabilities = p; 	this }

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
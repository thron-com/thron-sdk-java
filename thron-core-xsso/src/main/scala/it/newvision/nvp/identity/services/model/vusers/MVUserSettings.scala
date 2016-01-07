package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVUserSettings") 
@XmlType(name="MVUserSettings")
//#SWG#@ApiModel(description = """""")
class MVUserSettings extends Serializable {

	/**
	 * Deprecated.
	 * Optional. the total amount of quota reserved to the user (in MB). If zero the
	 * user have no quota restrictions
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Optional. the total amount of quota reserved to the user (in MB). If zero the user have no quota restrictions""")
	@BeanProperty 
	@Deprecated
	var userQuota: Long =_
	@Deprecated
	def withuserQuota(p:Long):MVUserSettings ={ 	this.userQuota = p; 	this }

	/**
	 * Define the lock template id applied to the user.
	 * Locking templates ares used to restrict the user to change some specific fields
	 * of the VUserDetail, like password, email address, user fullname or other
	 * details.
	 * 
	 * The only allowed value is "DEFAULT".
	 */
	//#SWG#@ApiModelProperty(value = """Define the lock template id applied to the user.
	//#SWGNL#Locking templates ares used to restrict the user to change some specific fields of the VUserDetail, like password, email address, user fullname or other details.
	//#SWGNL#
	//#SWGNL#The only allowed value is "DEFAULT".""")
	@BeanProperty 
	var userLockTemplate: String =_
	def withuserLockTemplate(p:String):MVUserSettings ={ 	this.userLockTemplate = p; 	this }

}
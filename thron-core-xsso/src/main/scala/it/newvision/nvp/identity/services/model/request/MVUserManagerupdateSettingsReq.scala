package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MVUserSettings

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.updateSettings
 */
@XmlRootElement(name="MVUserManagerupdateSettingsReq")
@XmlType(name="MVUserManagerupdateSettingsReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.updateSettings")
class MVUserManagerupdateSettingsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

	/**
	 * restricted params of the user
	 */
	//#SWG#@ApiModelProperty(value = """restricted params of the user""", required = true)
	@BeanProperty
	var settings: MVUserSettings =_
	def withsettings(p:MVUserSettings):this.type ={ 	this.settings = p; 	this }

}
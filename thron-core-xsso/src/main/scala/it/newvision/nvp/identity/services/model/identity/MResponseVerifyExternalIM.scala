package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.msg.MEExternalIMResponse

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVerifyExternalIM") 
@XmlType(name="MResponseVerifyExternalIM")
//#SWG#@ApiModel(description = """""")
class MResponseVerifyExternalIM extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var accountActive: Boolean =_
	def withaccountActive(p:Boolean):this.type ={ 	this.accountActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var accountExpired: Boolean =_
	def withaccountExpired(p:Boolean):this.type ={ 	this.accountExpired = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var accountLocked: Boolean =_
	def withaccountLocked(p:Boolean):this.type ={ 	this.accountLocked = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var passwordExpired: Boolean =_
	def withpasswordExpired(p:Boolean):this.type ={ 	this.passwordExpired = p; 	this }

	/**
	 * if 0 the password is expired
	 */
	//#SWG#@ApiModelProperty(value = """if 0 the password is expired""")
	@BeanProperty 
	var passwordLastUpdate: Long =_
	def withpasswordLastUpdate(p:Long):this.type ={ 	this.passwordLastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEExternalIMResponse =_
	def withstatus(p:MEExternalIMResponse):this.type ={ 	this.status = p; 	this }

}
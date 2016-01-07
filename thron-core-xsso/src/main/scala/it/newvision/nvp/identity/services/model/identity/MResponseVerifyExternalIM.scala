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

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEExternalIMResponse =_
	def withstatus(p:MEExternalIMResponse):MResponseVerifyExternalIM ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var passwordLastUpdate: Date =_
	def withpasswordLastUpdate(p:Date):MResponseVerifyExternalIM ={ 	this.passwordLastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var passwordExpired: Boolean =_
	def withpasswordExpired(p:Boolean):MResponseVerifyExternalIM ={ 	this.passwordExpired = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var accountActive: Boolean =_
	def withaccountActive(p:Boolean):MResponseVerifyExternalIM ={ 	this.accountActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var accountExpired: Boolean =_
	def withaccountExpired(p:Boolean):MResponseVerifyExternalIM ={ 	this.accountExpired = p; 	this }

}
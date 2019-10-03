package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JAppsAdmin.changeOwner
 */
@XmlRootElement(name="MAppsAdminchangeOwnerReq")
@XmlType(name="MAppsAdminchangeOwnerReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.changeOwner")
class MAppsAdminchangeOwnerReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var newOwnerUsername: String =_
	def withnewOwnerUsername(p:String):this.type ={ 	this.newOwnerUsername = p; 	this }

}
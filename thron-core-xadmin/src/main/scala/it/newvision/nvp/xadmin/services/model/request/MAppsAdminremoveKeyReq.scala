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
 * Request message for service JAppsAdmin.removeKey
 */
@XmlRootElement(name="MAppsAdminremoveKeyReq")
@XmlType(name="MAppsAdminremoveKeyReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.removeKey")
class MAppsAdminremoveKeyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	/**
	 * Optional. Additional capabilities to add to the snippet.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional capabilities to add to the snippet.""", required = true)
	@BeanProperty
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

}
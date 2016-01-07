package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppKeyUpdateData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.updateKey
 */
@XmlRootElement(name="MAppsAdminupdateKeyReq")
@XmlType(name="MAppsAdminupdateKeyReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.updateKey")
class MAppsAdminupdateKeyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsAdminupdateKeyReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var key: String =_
	def withkey(p:String):MAppsAdminupdateKeyReq ={ 	this.key = p; 	this }

	/**
	 * Optional. Additional capabilities to add to the snippet.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional capabilities to add to the snippet.""", required = true)
	@BeanProperty
	var value: MAppKeyUpdateData =_
	def withvalue(p:MAppKeyUpdateData):MAppsAdminupdateKeyReq ={ 	this.value = p; 	this }

}
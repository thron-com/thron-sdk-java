package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppKeyInitData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.generateKey
 */
@XmlRootElement(name="MAppsAdmingenerateKeyReq")
@XmlType(name="MAppsAdmingenerateKeyReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.generateKey")
class MAppsAdmingenerateKeyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	/**
	 * Optional. Additional capabilities to add to the snippet.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional capabilities to add to the snippet.""", required = true)
	@BeanProperty
	var value: MAppKeyInitData =_
	def withvalue(p:MAppKeyInitData):this.type ={ 	this.value = p; 	this }

}
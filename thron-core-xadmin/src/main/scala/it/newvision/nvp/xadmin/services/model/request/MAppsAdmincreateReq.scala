package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppInitData
import it.newvision.nvp.xadmin.services.model.apps.MAppOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.create
 */
@XmlRootElement(name="MAppsAdmincreateReq")
@XmlType(name="MAppsAdmincreateReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.create")
class MAppsAdmincreateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var app: MAppInitData =_
	def withapp(p:MAppInitData):this.type ={ 	this.app = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var options: MAppOptions =_
	def withoptions(p:MAppOptions):this.type ={ 	this.options = p; 	this }

}
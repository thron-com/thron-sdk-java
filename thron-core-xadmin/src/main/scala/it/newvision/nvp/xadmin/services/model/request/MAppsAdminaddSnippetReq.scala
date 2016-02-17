package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MSnippetInitData
import it.newvision.nvp.xadmin.services.model.apps.MAppAddCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.addSnippet
 */
@XmlRootElement(name="MAppsAdminaddSnippetReq")
@XmlType(name="MAppsAdminaddSnippetReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.addSnippet")
class MAppsAdminaddSnippetReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):this.type ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var snippet: MSnippetInitData =_
	def withsnippet(p:MSnippetInitData):this.type ={ 	this.snippet = p; 	this }

	/**
	 * Optional. Additional capabilities required by the snippet
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional capabilities required by the snippet""", required = true)
	@BeanProperty
	var caps: MAppAddCapability =_
	def withcaps(p:MAppAddCapability):this.type ={ 	this.caps = p; 	this }

}
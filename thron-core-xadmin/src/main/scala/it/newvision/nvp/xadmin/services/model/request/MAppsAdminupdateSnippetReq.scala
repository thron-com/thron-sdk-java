package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MSnippetUpdateData
import it.newvision.nvp.xadmin.services.model.apps.MAppAddCapability

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAppsAdmin.updateSnippet
 */
@XmlRootElement(name="MAppsAdminupdateSnippetReq")
@XmlType(name="MAppsAdminupdateSnippetReq")
//#SWG#@ApiModel(description = "Request message for service JAppsAdmin.updateSnippet")
class MAppsAdminupdateSnippetReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppsAdminupdateSnippetReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppsAdminupdateSnippetReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var snippetId: String =_
	def withsnippetId(p:String):MAppsAdminupdateSnippetReq ={ 	this.snippetId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var snippet: MSnippetUpdateData =_
	def withsnippet(p:MSnippetUpdateData):MAppsAdminupdateSnippetReq ={ 	this.snippet = p; 	this }

	/**
	 * Optional. Additional capabilities to add to the snippet.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Additional capabilities to add to the snippet.""", required = true)
	@BeanProperty
	var caps: MAppAddCapability =_
	def withcaps(p:MAppAddCapability):MAppsAdminupdateSnippetReq ={ 	this.caps = p; 	this }

}
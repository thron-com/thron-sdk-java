package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppSnippetCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JApps.findByProperties
 */
@XmlRootElement(name="MAppsfindByPropertiesReq")
@XmlType(name="MAppsfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JApps.findByProperties")
class MAppsfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Optional. used as serach criteria for the Snippets.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. used as serach criteria for the Snippets.""", required = true)
	@BeanProperty
	var criteria: MAppSnippetCriteria =_
	def withcriteria(p:MAppSnippetCriteria):this.type ={ 	this.criteria = p; 	this }

}
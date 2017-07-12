package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JPlayerEmbedTemplate.listVersions
 */
@XmlRootElement(name="MPlayerEmbedTemplatelistVersionsReq")
@XmlType(name="MPlayerEmbedTemplatelistVersionsReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.listVersions")
class MPlayerEmbedTemplatelistVersionsReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

}
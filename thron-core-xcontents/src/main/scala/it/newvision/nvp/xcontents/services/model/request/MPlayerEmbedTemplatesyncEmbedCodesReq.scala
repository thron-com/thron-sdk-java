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
 * Request message for service JPlayerEmbedTemplate.syncEmbedCodes
 */
@XmlRootElement(name="MPlayerEmbedTemplatesyncEmbedCodesReq")
@XmlType(name="MPlayerEmbedTemplatesyncEmbedCodesReq")
//#SWG#@ApiModel(description = "Request message for service JPlayerEmbedTemplate.syncEmbedCodes")
class MPlayerEmbedTemplatesyncEmbedCodesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

}
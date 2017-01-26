package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MExternalId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.addExternalId
 */
@XmlRootElement(name="MContentaddExternalIdReq")
@XmlType(name="MContentaddExternalIdReq")
//#SWG#@ApiModel(description = "Request message for service JContent.addExternalId")
class MContentaddExternalIdReq extends Serializable {

	/**
	 * New external Id
	 */
	//#SWG#@ApiModelProperty(value = """New external Id""", required = true)
	@BeanProperty
	var externalId: MExternalId =_
	def withexternalId(p:MExternalId):this.type ={ 	this.externalId = p; 	this }

}
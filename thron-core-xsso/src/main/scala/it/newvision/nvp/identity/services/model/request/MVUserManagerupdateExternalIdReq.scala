package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MIdExternal

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.updateExternalId
 */
@XmlRootElement(name="MVUserManagerupdateExternalIdReq")
@XmlType(name="MVUserManagerupdateExternalIdReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.updateExternalId")
class MVUserManagerupdateExternalIdReq extends Serializable {

	/**
	 * Optional. User detail
	 */
	//#SWG#@ApiModelProperty(value = """Optional. User detail""", required = true)
	@BeanProperty
	var externalId: MIdExternal =_
	def withexternalId(p:MIdExternal):this.type ={ 	this.externalId = p; 	this }

}
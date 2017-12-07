package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.category.MCategoryAclInverseRules

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategoryAdmin.remove
 */
@XmlRootElement(name="MCategoryAdminremoveReq")
@XmlType(name="MCategoryAdminremoveReq")
//#SWG#@ApiModel(description = "Request message for service JCategoryAdmin.remove")
class MCategoryAdminremoveReq extends Serializable {

	/**
	 * Serialized user session, for audit and notification purposes.
	 */
	//#SWG#@ApiModelProperty(value = """Serialized user session, for audit and notification purposes.""", required = true)
	@BeanProperty
	var userSession: String =_
	def withuserSession(p:String):this.type ={ 	this.userSession = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var aclInverseRules: MCategoryAclInverseRules =_
	def withaclInverseRules(p:MCategoryAclInverseRules):this.type ={ 	this.aclInverseRules = p; 	this }

}
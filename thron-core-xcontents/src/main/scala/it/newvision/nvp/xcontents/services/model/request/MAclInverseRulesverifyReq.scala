package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MAclInverseRulesItems

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAclInverseRules.verify
 */
@XmlRootElement(name="MAclInverseRulesverifyReq")
@XmlType(name="MAclInverseRulesverifyReq")
//#SWG#@ApiModel(description = "Request message for service JAclInverseRules.verify")
class MAclInverseRulesverifyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rule: MAclInverseRulesItems =_
	def withrule(p:MAclInverseRulesItems):this.type ={ 	this.rule = p; 	this }

}
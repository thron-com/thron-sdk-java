package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAclInverseRules.list
 */
@XmlRootElement(name="MAclInverseRuleslistReq")
@XmlType(name="MAclInverseRuleslistReq")
//#SWG#@ApiModel(description = "Request message for service JAclInverseRules.list")
class MAclInverseRuleslistReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):this.type ={ 	this.targetObjClass = p; 	this }

}
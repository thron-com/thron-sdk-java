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
 * Request message for service JAclInverseRules.insert
 */
@XmlRootElement(name="MAclInverseRulesinsertReq")
@XmlType(name="MAclInverseRulesinsertReq")
//#SWG#@ApiModel(description = "Request message for service JAclInverseRules.insert")
class MAclInverseRulesinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var rules: MAclInverseRulesItems =_
	def withrules(p:MAclInverseRulesItems):this.type ={ 	this.rules = p; 	this }

	/**
	 * Optional. Do not send any notification to the users
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Do not send any notification to the users""", required = true)
	@BeanProperty
	var silentMode: Boolean =_
	def withsilentMode(p:Boolean):this.type ={ 	this.silentMode = p; 	this }

}
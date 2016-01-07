package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MAclRuleInverse

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclRuleInfoInverse") 
@XmlType(name="MAclRuleInfoInverse")
//#SWG#@ApiModel(description = """""")
class MAclRuleInfoInverse extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetAcl: MAclRuleInverse =_
	def withtargetAcl(p:MAclRuleInverse):MAclRuleInfoInverse ={ 	this.targetAcl = p; 	this }

	/**
	 * used in presentation, Can be the user full name or group Name
	 */
	//#SWG#@ApiModelProperty(value = """used in presentation, Can be the user full name or group Name""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):MAclRuleInfoInverse ={ 	this.displayName = p; 	this }

}
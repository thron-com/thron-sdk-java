package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MAclInverseRulesGeneric

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Source Roule Object
 */
@XmlRootElement(name="MAclInverseRules") 
@XmlType(name="MAclInverseRules")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclInverseRules extends MAclInverseRulesGeneric with Serializable  {

	/**
	 * used in presentation, Can be the user full name or group Name
	 */
	//#SWG#@ApiModelProperty(value = """used in presentation, Can be the user full name or group Name""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

}
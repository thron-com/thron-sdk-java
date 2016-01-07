package it.newvision.nvp.xcontents.model
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
 * The Source Roule Object
 */
@XmlRootElement(name="MAclRule") 
@XmlType(name="MAclRule")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclRule extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):MAclRule ={ 	this.targetObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):MAclRule ={ 	this.targetObjClass = p; 	this }

	/**
	 * The different type of rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of rules.""")
	@BeanProperty 
	var rules: List[MEAclRule] = new ArrayList[MEAclRule]
	def withrules(p:List[MEAclRule]):MAclRule ={ 	this.rules = p; 	this }

	/**
	 * The list of disabled Rules. Disabled rules are not used for validation
	 */
	//#SWG#@ApiModelProperty(value = """The list of disabled Rules. Disabled rules are not used for validation""")
	@BeanProperty 
	var disabledRules: List[MEAclRule] = new ArrayList[MEAclRule]
	def withdisabledRules(p:List[MEAclRule]):MAclRule ={ 	this.disabledRules = p; 	this }

}
package it.newvision.nvp.identity.model
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
@XmlRootElement(name="MAclRuleInverse") 
@XmlType(name="MAclRuleInverse")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclRuleInverse extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""")
	@BeanProperty 
	var rulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withrulesInverse(p:List[MEAclRuleInverse]):this.type ={ 	this.rulesInverse = p; 	this }

	/**
	 * The different type of disabled rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of disabled rules.""")
	@BeanProperty 
	var disabledRulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withdisabledRulesInverse(p:List[MEAclRuleInverse]):this.type ={ 	this.disabledRulesInverse = p; 	this }

}
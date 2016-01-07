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
@XmlRootElement(name="MAclRuleInverse") 
@XmlType(name="MAclRuleInverse")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclRuleInverse extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):MAclRuleInverse ={ 	this.sourceObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):MAclRuleInverse ={ 	this.sourceObjClass = p; 	this }

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""")
	@BeanProperty 
	var rulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withrulesInverse(p:List[MEAclRuleInverse]):MAclRuleInverse ={ 	this.rulesInverse = p; 	this }

	/**
	 * The list of disabled Rules
	 */
	//#SWG#@ApiModelProperty(value = """The list of disabled Rules""")
	@BeanProperty 
	var disabledRulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withdisabledRulesInverse(p:List[MEAclRuleInverse]):MAclRuleInverse ={ 	this.disabledRulesInverse = p; 	this }

	/**
	 * like: FACEBOOK, EMAIL, TWITTER, SMS,
	 */
	//#SWG#@ApiModelProperty(value = """like: FACEBOOK, EMAIL, TWITTER, SMS,""")
	@BeanProperty 
	var customMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomMetadata(p:List[MMetadata]):MAclRuleInverse ={ 	this.customMetadata = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(sourceObjId).isDefined && Option(sourceObjClass).isDefined && !(rulesInverse.isEmpty && disabledRulesInverse.isEmpty)
	}

}
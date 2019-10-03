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
@Deprecated
class MAclRuleInverse extends Serializable {

	/**
	 * like: FACEBOOK, EMAIL, TWITTER, SMS,
	 */
	//#SWG#@ApiModelProperty(value = """like: FACEBOOK, EMAIL, TWITTER, SMS,""")
	@BeanProperty 
	var customMetadata: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomMetadata(p:List[MMetadata]):this.type ={ 	this.customMetadata = p; 	this }

	/**
	 * The list of disabled Rules
	 */
	//#SWG#@ApiModelProperty(value = """The list of disabled Rules""")
	@BeanProperty 
	var disabledRulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withdisabledRulesInverse(p:List[MEAclRuleInverse]):this.type ={ 	this.disabledRulesInverse = p; 	this }

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""")
	@BeanProperty 
	var rulesInverse: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withrulesInverse(p:List[MEAclRuleInverse]):this.type ={ 	this.rulesInverse = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(sourceObjId).isDefined && Option(sourceObjClass).isDefined && !(rulesInverse.isEmpty && disabledRulesInverse.isEmpty)
	}

}
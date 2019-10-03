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
 * The Source Roule Object.
 * 
 * Sintax: SourceObj <EAclRule> TargetObject
 * 
 * Example:
 * user1 READ group1
 * user1 READ user2
 * user1 INHERIT group1
 */
@XmlRootElement(name="MAclRule") 
@XmlType(name="MAclRule")
//#SWG#@ApiModel(description = """The Source Roule Object.
//#SWGNL#
//#SWGNL#Sintax: SourceObj <EAclRule> TargetObject
//#SWGNL#
//#SWGNL#Example: 
//#SWGNL#user1 READ group1
//#SWGNL#user1 READ user2
//#SWGNL#user1 INHERIT group1""")
class MAclRule extends Serializable {

	/**
	 * The list of not active rules
	 */
	//#SWG#@ApiModelProperty(value = """The list of not active rules""")
	@BeanProperty 
	var disabledRules: List[MEAclRule] = new ArrayList[MEAclRule]
	def withdisabledRules(p:List[MEAclRule]):this.type ={ 	this.disabledRules = p; 	this }

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""")
	@BeanProperty 
	var rules: List[MEAclRule] = new ArrayList[MEAclRule]
	def withrules(p:List[MEAclRule]):this.type ={ 	this.rules = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):this.type ={ 	this.targetObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):this.type ={ 	this.targetObjId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(targetObjId).isDefined && Option(targetObjClass).isDefined && !(rules.isEmpty) && disabledRules.isEmpty
	}

}
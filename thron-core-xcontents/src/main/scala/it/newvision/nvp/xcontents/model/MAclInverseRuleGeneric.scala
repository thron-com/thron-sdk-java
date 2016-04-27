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
@XmlRootElement(name="MAclInverseRuleGeneric") 
@XmlType(name="MAclInverseRuleGeneric")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclInverseRuleGeneric extends Serializable {

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""" ,required = true)
	@BeanProperty 
	var rule: MEAclRuleInverse =_
	def withrule(p:MEAclRuleInverse):this.type ={ 	this.rule = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var enabled: Boolean  = true
	def withenabled(p:Boolean):this.type ={ 	this.enabled = p; 	this }

	/**
	 * Only for Categories.
	 * Categories SPREAD_TO Contents (when a content is linked to a category)
	 */
	//#SWG#@ApiModelProperty(value = """Only for Categories.
	//#SWGNL#Categories SPREAD_TO Contents (when a content is linked to a category)""" ,required = true)
	@BeanProperty 
	var applyToSpreadTargets: Boolean =_
	def withapplyToSpreadTargets(p:Boolean):this.type ={ 	this.applyToSpreadTargets = p; 	this }

	/**
	 * like: FACEBOOK, EMAIL, TWITTER, SMS,
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>Only for SEEN_BY rule</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """like: FACEBOOK, EMAIL, TWITTER, SMS,
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>Only for SEEN_BY rule</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(rule).isDefined && 
		Option(enabled).isDefined && 
		Option(applyToSpreadTargets).isDefined &&
		// metadata are allowed only on SEEN_BY rules without applyToSpreadTargets
		(Option(metadata).forall(_.isEmpty) || (rule == MEAclRuleInverse.SEEN_BY && !applyToSpreadTargets)) &&
		// BELONGS_TO and SPREAD_TO cannot be spread to targets
		(!Seq(MEAclRuleInverse.BELONGS_TO, MEAclRuleInverse.SPREAD_TO).contains(rule) || !applyToSpreadTargets)
	}

}
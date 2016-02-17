package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MEAclContextCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The list of rules is partitioned in two set:
 * <ul>
 * 	<li>rs = the list of rules</li>
 * 	<li>nrs = the list of !_<rules></li>
 * </ul>
 * The elements are filtered matching the condition:
 * <ul>
 * 	<li>(element WITH one of rs) AND (contents WITHOUT ANY of nrs)</li>
 * </ul>
 * 
 * Examples using json format:
 * 
 * <ul>
 * 	<li>filter elements with one of the rules a,b</li>
 * </ul>
 * 	"rules": ["a","b"]
 * <ul>
 * 	<li>filter elements with one of the rules a,b directly defined</li>
 * </ul>
 * 	"rules": ["a","b"], "onContext": "DIRECT"
 * <ul>
 * 	<li>filter elements with one of the rules a,b defined in Categories linked to
 * the element</li>
 * </ul>
 * 	"rules": ["a","b"], "onContext": "DERIVED"
 * <ul>
 * 	<li>filter elements with one of the rules a,b defined for me only (no
 * inheritance)</li>
 * </ul>
 * 	"rules": ["a","b"], "onContext": "EXCLUSIVE"
 * <ul>
 * 	<li>filter elements without any of the rules a,b in neither "DIRECT" nor
 * "DERIVED" context</li>
 * </ul>
 * 	"rules": ["!_a","!_b"]
 * <ul>
 * 	<li>filter elements with one of the rules a,b AND without any of the rules c,d
 * in neither "DIRECT" nor "DERIVED" context</li>
 * </ul>
 * 	"rules": ["a","b","!_c","!_d"]
 */
@XmlRootElement(name="MAclCriteria") 
@XmlType(name="MAclCriteria")
//#SWG#@ApiModel(description = """The list of rules is partitioned in two set:
//#SWGNL#<ul>
//#SWGNL#	<li>rs = the list of rules</li>
//#SWGNL#	<li>nrs = the list of !_<rules></li>
//#SWGNL#</ul>
//#SWGNL#The elements are filtered matching the condition:
//#SWGNL#<ul>
//#SWGNL#	<li>(element WITH one of rs) AND (contents WITHOUT ANY of nrs)</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#Examples using json format:
//#SWGNL#
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements with one of the rules a,b</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["a","b"]
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements with one of the rules a,b directly defined</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["a","b"], "onContext": "DIRECT"
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements with one of the rules a,b defined in Categories linked to the element</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["a","b"], "onContext": "DERIVED"
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements with one of the rules a,b defined for me only (no inheritance)</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["a","b"], "onContext": "EXCLUSIVE"
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements without any of the rules a,b in neither "DIRECT" nor "DERIVED" context</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["!_a","!_b"]
//#SWGNL#<ul>
//#SWGNL#	<li>filter elements with one of the rules a,b AND without any of the rules c,d in neither "DIRECT" nor "DERIVED" context</li>
//#SWGNL#</ul>
//#SWGNL#	"rules": ["a","b","!_c","!_d"]""")
class MAclCriteria extends Serializable {

	/**
	 * enable the search only on a specific context.
	 * 
	 * DIRECT: find all elements where the user is directly defined in ACL with SEE
	 * Rule
	 * 
	 * DERIVED: find all elements where the user is in some ACL of the
	 * linkedCategories .
	 * 
	 * EXCLUSIVE: find all elements where the user is the only one directly defined in
	 * ACL with SEE Rule
	 * 
	 * By default the service looks in contexts DIRECT and DERIVED.
	 */
	//#SWG#@ApiModelProperty(value = """enable the search only on a specific context.
	//#SWGNL#
	//#SWGNL#DIRECT: find all elements where the user is directly defined in ACL with SEE Rule
	//#SWGNL#
	//#SWGNL#DERIVED: find all elements where the user is in some ACL of the linkedCategories .
	//#SWGNL#
	//#SWGNL#EXCLUSIVE: find all elements where the user is the only one directly defined in ACL with SEE Rule
	//#SWGNL#
	//#SWGNL#By default the service looks in contexts DIRECT and DERIVED.""")
	@BeanProperty 
	var onContext: MEAclContextCriteria =_
	def withonContext(p:MEAclContextCriteria):this.type ={ 	this.onContext = p; 	this }

	/**
	 * filter all elements having all of the specified rules applied to the user or to
	 * the usergroup. If not specified, "SEEN_BY" is the rule applied.
	 * Available rules are: MODIFIED_BY,SHARED_BY,BELONGS_TO
	 * 
	 * The list of rules is partitioned in two sets:
	 * <ul>
	 * 	<li>rs = the list of rules</li>
	 * 	<li>nrs = the list of !_<rules></li>
	 * </ul>
	 * The elements are filtered matching the condition:
	 * <ul>
	 * 	<li>(elements WITH one of rs) AND (elements WITHOUT any of nrs)</li>
	 * </ul>
	 * 
	 * Examples using json format:
	 * 
	 * <ul>
	 * 	<li>filter elements with one of rules a,b</li>
	 * </ul>
	 * 	"rules": ["MODIFIED_BY","SHARED_BY"]
	 * <ul>
	 * 	<li>filter elements without any of rules MODIFIED_BY,BELONGS_TO</li>
	 * </ul>
	 * 	"rules": ["!_MODIFIED_BY","!_BELONGS_TO"]
	 * <ul>
	 * 	<li>filter elements with one of rules MODIFIED_BY,SHARED_BY AND WITHOUT any of
	 * rules </li>
	 * </ul>
	 * 	"rules": ["MODIFIED_BY","SHARED_BY","!_BELONGS_TO"]
	 */
	//#SWG#@ApiModelProperty(value = """filter all elements having all of the specified rules applied to the user or to the usergroup. If not specified, "SEEN_BY" is the rule applied.
	//#SWGNL#Available rules are: MODIFIED_BY,SHARED_BY,BELONGS_TO
	//#SWGNL#
	//#SWGNL#The list of rules is partitioned in two sets:
	//#SWGNL#<ul>
	//#SWGNL#	<li>rs = the list of rules</li>
	//#SWGNL#	<li>nrs = the list of !_<rules></li>
	//#SWGNL#</ul>
	//#SWGNL#The elements are filtered matching the condition:
	//#SWGNL#<ul>
	//#SWGNL#	<li>(elements WITH one of rs) AND (elements WITHOUT any of nrs)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Examples using json format:
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter elements with one of rules a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"rules": ["MODIFIED_BY","SHARED_BY"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter elements without any of rules MODIFIED_BY,BELONGS_TO</li>
	//#SWGNL#</ul>
	//#SWGNL#	"rules": ["!_MODIFIED_BY","!_BELONGS_TO"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter elements with one of rules MODIFIED_BY,SHARED_BY AND WITHOUT any of rules </li>
	//#SWGNL#</ul>
	//#SWGNL#	"rules": ["MODIFIED_BY","SHARED_BY","!_BELONGS_TO"]""")
	@BeanProperty 
	var rules: List[String] = new ArrayList[String]
	def withrules(p:List[String]):this.type ={ 	this.rules = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import it.newvision.nvp.xcontents.model.MEAclRuleInverse
		import collection.JavaConversions._
	
		val negatedRulePrefix = "!_"
	
		rules.forall{ r =>
		  try {
			Option(MEAclRuleInverse.valueOf({
			  if (r.startsWith(negatedRulePrefix))
				r.substring(negatedRulePrefix.size)
			  else
				r
			})).isDefined
		  } catch {
			case e: IllegalArgumentException => false
		  }
		}
	}

}
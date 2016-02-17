package it.newvision.nvp.identity.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEAclContext
import it.newvision.nvp.identity.model.MEAclRuleInverse

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclUsersGroupCriteria") 
@XmlType(name="MAclUsersGroupCriteria")
//#SWG#@ApiModel(description = """""")
class MAclUsersGroupCriteria extends Serializable {

	/**
	 * enable the search only on a specific context.
	 * 
	 * DIRECT: find all users or groups  where the user is directly defined in ACL
	 * with SEE Rule
	 * 
	 * DERIVED: find all users or groups where the user is defined in some ACL defined
	 * in the groups of the Content with SEE Rule.
	 * 
	 * By default the service looks in all contexts.
	 */
	//#SWG#@ApiModelProperty(value = """enable the search only on a specific context.
	//#SWGNL#
	//#SWGNL#DIRECT: find all users or groups  where the user is directly defined in ACL with SEE Rule
	//#SWGNL#
	//#SWGNL#DERIVED: find all users or groups where the user is defined in some ACL defined in the groups of the Content with SEE Rule.
	//#SWGNL#
	//#SWGNL#By default the service looks in all contexts.""")
	@BeanProperty 
	var onContext: MEAclContext =_
	def withonContext(p:MEAclContext):this.type ={ 	this.onContext = p; 	this }

	/**
	 * Filter all users or groups having all of the specified rules applied to the
	 * user or to the usergroup.
	 * Available rules are: SEEN_BY,MODIFIED_BY
	 * If not specified, "SEEN_BY" is the rule applied.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all users or groups having all of the specified rules applied to the user or to the usergroup. 
	//#SWGNL#Available rules are: SEEN_BY,MODIFIED_BY
	//#SWGNL#If not specified, "SEEN_BY" is the rule applied.""")
	@BeanProperty 
	var rules: List[MEAclRuleInverse] = new ArrayList[MEAclRuleInverse]
	def withrules(p:List[MEAclRuleInverse]):this.type ={ 	this.rules = p; 	this }

}
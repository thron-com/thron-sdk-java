package it.newvision.nvp.xadmin.services.model.utils
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
 * Used to define the list of Acl rules to add/remove/enable/disable in the
 * category specified by the service JDashboard.propagateAclToSubCategories
 */
@XmlRootElement(name="MAclInverseList") 
@XmlType(name="MAclInverseList")
//#SWG#@ApiModel(description = """Used to define the list of Acl rules to add/remove/enable/disable in the category specified by the service JDashboard.propagateAclToSubCategories""")
class MAclInverseList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var rules: List[MAclInverse] = new ArrayList[MAclInverse]
	def withrules(p:List[MAclInverse]):this.type ={ 	this.rules = p; 	this }

}
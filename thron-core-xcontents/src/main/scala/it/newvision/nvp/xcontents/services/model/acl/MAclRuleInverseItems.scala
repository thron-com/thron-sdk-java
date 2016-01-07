package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclRuleInverseItems") 
@XmlType(name="MAclRuleInverseItems")
//#SWG#@ApiModel(description = """""")
class MAclRuleInverseItems extends Serializable {

	/**
	 * a list of rule items
	 */
	//#SWG#@ApiModelProperty(value = """a list of rule items""")
	@BeanProperty 
	var rules: List[MAclRuleInverseItem] = new ArrayList[MAclRuleInverseItem]
	def withrules(p:List[MAclRuleInverseItem]):MAclRuleInverseItems ={ 	this.rules = p; 	this }

}
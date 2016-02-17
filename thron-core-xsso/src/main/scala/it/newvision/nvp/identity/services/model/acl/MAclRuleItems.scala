package it.newvision.nvp.identity.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclRuleItems") 
@XmlType(name="MAclRuleItems")
//#SWG#@ApiModel(description = """""")
class MAclRuleItems extends Serializable {

	/**
	 * a list of rule items
	 */
	//#SWG#@ApiModelProperty(value = """a list of rule items""")
	@BeanProperty 
	var rules: List[MAclRuleItem] = new ArrayList[MAclRuleItem]
	def withrules(p:List[MAclRuleItem]):this.type ={ 	this.rules = p; 	this }

}
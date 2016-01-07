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
@XmlRootElement(name="MResponseAclUpdate") 
@XmlType(name="MResponseAclUpdate")
//#SWG#@ApiModel(description = """""")
class MResponseAclUpdate extends MResponseAcl with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var rulesInIssue: List[MAclRuleInverseItem] = new ArrayList[MAclRuleInverseItem]
	def withrulesInIssue(p:List[MAclRuleInverseItem]):MResponseAclUpdate ={ 	this.rulesInIssue = p; 	this }

}
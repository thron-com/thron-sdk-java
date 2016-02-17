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
@XmlRootElement(name="MResponseAclDetailInverse") 
@XmlType(name="MResponseAclDetailInverse")
//#SWG#@ApiModel(description = """""")
@Deprecated
class MResponseAclDetailInverse extends MResponseAcl with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var aclDetails: List[MAclRuleInfoInverse] = new ArrayList[MAclRuleInfoInverse]
	def withaclDetails(p:List[MAclRuleInfoInverse]):this.type ={ 	this.aclDetails = p; 	this }

}
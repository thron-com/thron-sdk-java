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
@XmlRootElement(name="MResponseAclDetail") 
@XmlType(name="MResponseAclDetail")
//#SWG#@ApiModel(description = """""")
class MResponseAclDetail extends MResponseAcl with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var aclDetails: List[MAclRuleInfo] = new ArrayList[MAclRuleInfo]
	def withaclDetails(p:List[MAclRuleInfo]):MResponseAclDetail ={ 	this.aclDetails = p; 	this }

}
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
@XmlRootElement(name="MResponseAclInverseUpdate") 
@XmlType(name="MResponseAclInverseUpdate")
//#SWG#@ApiModel(description = """""")
class MResponseAclInverseUpdate extends MResponseAcl with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itemsInIssue: List[MAclInverseRulesItem] = new ArrayList[MAclInverseRulesItem]
	def withitemsInIssue(p:List[MAclInverseRulesItem]):this.type ={ 	this.itemsInIssue = p; 	this }

}
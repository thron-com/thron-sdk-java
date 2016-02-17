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
@XmlRootElement(name="MResponseAclInverseList") 
@XmlType(name="MResponseAclInverseList")
//#SWG#@ApiModel(description = """""")
class MResponseAclInverseList extends MResponseAcl with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MAclInverseRulesDetail] = new ArrayList[MAclInverseRulesDetail]
	def withitems(p:List[MAclInverseRulesDetail]):this.type ={ 	this.items = p; 	this }

}
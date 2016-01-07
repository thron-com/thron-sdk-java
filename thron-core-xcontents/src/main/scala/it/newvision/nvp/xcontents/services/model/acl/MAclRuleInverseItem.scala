package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass
import it.newvision.nvp.xcontents.model.MAclRuleInverse

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclRuleInverseItem") 
@XmlType(name="MAclRuleInverseItem")
//#SWG#@ApiModel(description = """""")
class MAclRuleInverseItem extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):MAclRuleInverseItem ={ 	this.targetObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):MAclRuleInverseItem ={ 	this.targetObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceAcl: MAclRuleInverse =_
	def withsourceAcl(p:MAclRuleInverse):MAclRuleInverseItem ={ 	this.sourceAcl = p; 	this }

}
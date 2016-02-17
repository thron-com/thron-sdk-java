package it.newvision.nvp.identity.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEObjClass
import it.newvision.nvp.identity.model.MAclRule

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclRuleItem") 
@XmlType(name="MAclRuleItem")
//#SWG#@ApiModel(description = """""")
class MAclRuleItem extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetAcl: MAclRule =_
	def withtargetAcl(p:MAclRule):this.type ={ 	this.targetAcl = p; 	this }

}
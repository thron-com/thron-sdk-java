package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverseRulesItem2") 
@XmlType(name="MAclInverseRulesItem2")
//#SWG#@ApiModel(description = """""")
class MAclInverseRulesItem2 extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjId: String =_
	def withtargetObjId(p:String):this.type ={ 	this.targetObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):this.type ={ 	this.targetObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var acl: MAclInverseRulesValue =_
	def withacl(p:MAclInverseRulesValue):this.type ={ 	this.acl = p; 	this }

}
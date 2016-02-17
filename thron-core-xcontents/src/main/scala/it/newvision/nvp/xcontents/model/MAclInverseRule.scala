package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Source Roule Object
 */
@XmlRootElement(name="MAclInverseRule") 
@XmlType(name="MAclInverseRule")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclInverseRule extends MAclInverseRuleGeneric with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEAclInverseRuleStatus =_
	def withstatus(p:MEAclInverseRuleStatus):this.type ={ 	this.status = p; 	this }

}
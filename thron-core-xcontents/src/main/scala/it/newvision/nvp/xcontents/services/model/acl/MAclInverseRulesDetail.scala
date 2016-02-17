package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MAclInverseRules

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverseRulesDetail") 
@XmlType(name="MAclInverseRulesDetail")
//#SWG#@ApiModel(description = """""")
class MAclInverseRulesDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var acl: MAclInverseRules =_
	def withacl(p:MAclInverseRules):this.type ={ 	this.acl = p; 	this }

}
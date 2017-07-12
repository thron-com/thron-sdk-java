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

	/**
	 * Whether or not rule needs to be propagated
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def needsToBePropagated():Boolean ={
		this.applyToSpreadTargets &&
		this.status != MEAclInverseRuleStatus.INFERRED &&
		Seq(MEAclRuleInverse.SEEN_BY, MEAclRuleInverse.MODIFIED_BY, MEAclRuleInverse.SHARED_BY).contains(this.rule)
	}

}
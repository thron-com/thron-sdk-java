package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MAclInverseRuleGeneric
import it.newvision.nvp.xcontents.model.MEObjClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Source Roule Object
 */
@XmlRootElement(name="MAclInverseRulesValue") 
@XmlType(name="MAclInverseRulesValue")
//#SWG#@ApiModel(description = """The Source Roule Object""")
class MAclInverseRulesValue extends Serializable {

	/**
	 * The different type of active rules.
	 */
	//#SWG#@ApiModelProperty(value = """The different type of active rules.""")
	@BeanProperty 
	var rules: List[MAclInverseRuleGeneric] = new ArrayList[MAclInverseRuleGeneric]
	def withrules(p:List[MAclInverseRuleGeneric]):this.type ={ 	this.rules = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		StringUtils.isNotEmpty(sourceObjId) &&
		Option(sourceObjClass).isDefined &&
		rules.nonEmpty
	}

}
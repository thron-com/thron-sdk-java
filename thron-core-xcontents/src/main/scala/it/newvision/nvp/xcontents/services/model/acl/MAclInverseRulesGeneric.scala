package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass
import it.newvision.nvp.xcontents.model.MAclInverseRule

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverseRulesGeneric") 
@XmlType(name="MAclInverseRulesGeneric")
//#SWG#@ApiModel(description = """""")
class MAclInverseRulesGeneric extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjId: String =_
	def withsourceObjId(p:String):this.type ={ 	this.sourceObjId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceObjClass: MEObjClass =_
	def withsourceObjClass(p:MEObjClass):this.type ={ 	this.sourceObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var rules: List[MAclInverseRule] = new ArrayList[MAclInverseRule]
	def withrules(p:List[MAclInverseRule]):this.type ={ 	this.rules = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		Option(sourceObjId).isDefined && 
		Option(sourceObjClass).isDefined && 
		rules.nonEmpty
	}

}
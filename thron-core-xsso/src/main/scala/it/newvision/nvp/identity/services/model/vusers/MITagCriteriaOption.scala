package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.msg.MEITagOperation

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagCriteriaOption") 
@XmlType(name="MITagCriteriaOption")
//#SWG#@ApiModel(description = """""")
class MITagCriteriaOption extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itags: List[MITagCriteria] = new ArrayList[MITagCriteria]
	def withitags(p:List[MITagCriteria]):this.type ={ 	this.itags = p; 	this }

	/**
	 * applied to itags list
	 */
	//#SWG#@ApiModelProperty(value = """applied to itags list""" ,required = true)
	@BeanProperty 
	var operation: MEITagOperation  = MEITagOperation.OR
	def withoperation(p:MEITagOperation):this.type ={ 	this.operation = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		Option(operation).isDefined &&
			itags.forall(i=>StringUtils.isNotEmpty(i.classificationId) && 
			StringUtils.isNotEmpty(i.id)) && itags.size()<=5
	}

}
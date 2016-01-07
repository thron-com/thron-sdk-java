package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.msg.MEOperation

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagCriteriaOption") 
@XmlType(name="MITagCriteriaOption")
//#SWG#@ApiModel(description = """""")
class MITagCriteriaOption extends Serializable {

	/**
	 * constraints: max size 5
	 */
	//#SWG#@ApiModelProperty(value = """constraints: max size 5""")
	@BeanProperty 
	var itags: List[MITagCriteria] = new ArrayList[MITagCriteria]
	def withitags(p:List[MITagCriteria]):MITagCriteriaOption ={ 	this.itags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var operation: MEOperation  = MEOperation.OR
	def withoperation(p:MEOperation):MITagCriteriaOption ={ 	this.operation = p; 	this }

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
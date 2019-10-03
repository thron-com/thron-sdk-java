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
	 * constraints: max size 50
	 */
	//#SWG#@ApiModelProperty(value = """constraints: max size 50""")
	@BeanProperty 
	var itags: List[MITagCriteria] = new ArrayList[MITagCriteria]
	def withitags(p:List[MITagCriteria]):this.type ={ 	this.itags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var operation: MEOperation  = MEOperation.OR
	def withoperation(p:MEOperation):this.type ={ 	this.operation = p; 	this }

	/**
	 * This attibute is used to filter the tags coming from a specific source
	 * (USER/APPLICATION/ENGINE)
	 */
	//#SWG#@ApiModelProperty(value = """This attibute is used to filter the tags coming from a specific source (USER/APPLICATION/ENGINE)""")
	@BeanProperty 
	var stypes: List[String] = new ArrayList[String]
	def withstypes(p:List[String]):this.type ={ 	this.stypes = p; 	this }

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
			StringUtils.isNotEmpty(i.id)) && itags.size()<=50 && itags.nonEmpty
	}

}
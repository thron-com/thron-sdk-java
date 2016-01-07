package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Map the association between a Target Definition and an Entity
 */
@XmlRootElement(name="MTargetITagsMinimal") 
@XmlType(name="MTargetITagsMinimal")
//#SWG#@ApiModel(description = """""")
class MTargetITagsMinimal extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var target: MTarget =_
	def withtarget(p:MTarget):MTargetITagsMinimal ={ 	this.target = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tagIds: List[String] = new ArrayList[String]
	def withtagIds(p:List[String]):MTargetITagsMinimal ={ 	this.tagIds = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(target).exists(_.isValid) &&
		Option(tagIds).exists(_.nonEmpty)
	}

}
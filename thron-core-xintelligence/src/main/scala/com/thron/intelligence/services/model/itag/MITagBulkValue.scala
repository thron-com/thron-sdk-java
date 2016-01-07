package com.thron.intelligence.services.model.itag
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
@XmlRootElement(name="MITagBulkValue") 
@XmlType(name="MITagBulkValue")
//#SWG#@ApiModel(description = """""")
class MITagBulkValue extends Serializable {

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var tagIds: List[MITagId] = new ArrayList[MITagId]
	def withtagIds(p:List[MITagId]):MITagBulkValue ={ 	this.tagIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var target: MTarget =_
	def withtarget(p:MTarget):MITagBulkValue ={ 	this.target = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(target).exists(_.isValid) &&
		Option(tagIds).exists(x=> x.nonEmpty && x.size<=50 )
	}

}
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
@XmlRootElement(name="MITagBulkValue2") 
@XmlType(name="MITagBulkValue2")
//#SWG#@ApiModel(description = """""")
class MITagBulkValue2 extends Serializable {

	/**
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
	 */
	//#SWG#@ApiModelProperty(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""" ,required = true)
	@BeanProperty 
	var tagId: MITagId =_
	def withtagId(p:MITagId):this.type ={ 	this.tagId = p; 	this }

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * 	<li>same entityType for all items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#	<li>same entityType for all items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var targets: List[MTarget] = new ArrayList[MTarget]
	def withtargets(p:List[MTarget]):this.type ={ 	this.targets = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		Option(tagId).exists(_.isValid) &&
		Option(targets).exists(x=> x.nonEmpty && x.size<=50 && x.forall(_.isValid))
	}

}
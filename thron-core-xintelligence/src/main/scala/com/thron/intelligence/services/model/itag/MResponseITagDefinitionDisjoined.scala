package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagDefinitionDetail
import com.thron.intelligence.services.model.tag.MResponseITag

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagDefinitionDisjoined") 
@XmlType(name="MResponseITagDefinitionDisjoined")
//#SWG#@ApiModel(description = """""")
class MResponseITagDefinitionDisjoined extends MResponseITag with Serializable  {

	/**
	 * target ITagdefinition
	 */
	//#SWG#@ApiModelProperty(value = """target ITagdefinition""")
	@BeanProperty 
	var targetItem: MITagDefinitionDetail =_
	def withtargetItem(p:MITagDefinitionDetail):this.type ={ 	this.targetItem = p; 	this }

	/**
	 * the detail of the divided or extracted ITagDefinition
	 */
	//#SWG#@ApiModelProperty(value = """the detail of the divided or extracted ITagDefinition""")
	@BeanProperty 
	var disjoinedItem: MITagDefinitionDetail =_
	def withdisjoinedItem(p:MITagDefinitionDetail):this.type ={ 	this.disjoinedItem = p; 	this }

}
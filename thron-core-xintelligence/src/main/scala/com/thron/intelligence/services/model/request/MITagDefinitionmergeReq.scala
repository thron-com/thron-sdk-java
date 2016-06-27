package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MITagDefinitionList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.merge
 */
@XmlRootElement(name="MITagDefinitionmergeReq")
@XmlType(name="MITagDefinitionmergeReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.merge")
class MITagDefinitionmergeReq extends Serializable {

	/**
	 * Target ITagdefinition id, prettyId or externalId
	 */
	//#SWG#@ApiModelProperty(value = """Target ITagdefinition id, prettyId or externalId""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

	/**
	 * Optional list of ITagDefinition ids (joinedIds) to merge in the target
	 * tagdefinition. If empty the service merge all combined ITagDefinitions,
	 */
	//#SWG#@ApiModelProperty(value = """Optional list of ITagDefinition ids (joinedIds) to merge in the target tagdefinition. If empty the service merge all combined ITagDefinitions,""", required = true)
	@BeanProperty
	var combinedIdList: MITagDefinitionList =_
	def withcombinedIdList(p:MITagDefinitionList):this.type ={ 	this.combinedIdList = p; 	this }

}
package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.combine
 */
@XmlRootElement(name="MITagDefinitioncombineReq")
@XmlType(name="MITagDefinitioncombineReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.combine")
class MITagDefinitioncombineReq extends Serializable {

	/**
	 * Source ITagdefinition id, prettyId or externalId
	 */
	//#SWG#@ApiModelProperty(value = """Source ITagdefinition id, prettyId or externalId""", required = true)
	@BeanProperty
	var sourceId: String =_
	def withsourceId(p:String):this.type ={ 	this.sourceId = p; 	this }

	/**
	 * Target ITagdefinition id, prettyId or externalId
	 */
	//#SWG#@ApiModelProperty(value = """Target ITagdefinition id, prettyId or externalId""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

}
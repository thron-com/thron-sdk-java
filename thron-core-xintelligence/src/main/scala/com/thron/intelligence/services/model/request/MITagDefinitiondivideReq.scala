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
 * Request message for service JITagDefinition.divide
 */
@XmlRootElement(name="MITagDefinitiondivideReq")
@XmlType(name="MITagDefinitiondivideReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.divide")
class MITagDefinitiondivideReq extends Serializable {

	/**
	 * Target ITagdefinition id, prettyId or externalId
	 */
	//#SWG#@ApiModelProperty(value = """Target ITagdefinition id, prettyId or externalId""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

	/**
	 * ITagdefinition Id to divide
	 */
	//#SWG#@ApiModelProperty(value = """ITagdefinition Id to divide""", required = true)
	@BeanProperty
	var combinedId: String =_
	def withcombinedId(p:String):this.type ={ 	this.combinedId = p; 	this }

}
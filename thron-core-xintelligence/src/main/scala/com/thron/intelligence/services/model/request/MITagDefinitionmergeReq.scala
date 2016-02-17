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
 * Request message for service JITagDefinition.merge
 */
@XmlRootElement(name="MITagDefinitionmergeReq")
@XmlType(name="MITagDefinitionmergeReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.merge")
class MITagDefinitionmergeReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var sourceITagId: String =_
	def withsourceITagId(p:String):this.type ={ 	this.sourceITagId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var targetITagId: String =_
	def withtargetITagId(p:String):this.type ={ 	this.targetITagId = p; 	this }

}
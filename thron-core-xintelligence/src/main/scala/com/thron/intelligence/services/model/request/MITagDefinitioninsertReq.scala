package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagDefinitionValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.insert
 */
@XmlRootElement(name="MITagDefinitioninsertReq")
@XmlType(name="MITagDefinitioninsertReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.insert")
class MITagDefinitioninsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MITagDefinitionValue =_
	def withvalue(p:MITagDefinitionValue):MITagDefinitioninsertReq ={ 	this.value = p; 	this }

}
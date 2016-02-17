package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagDefinitionUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.update
 */
@XmlRootElement(name="MITagDefinitionupdateReq")
@XmlType(name="MITagDefinitionupdateReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.update")
class MITagDefinitionupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MITagDefinitionUpdate =_
	def withupdate(p:MITagDefinitionUpdate):this.type ={ 	this.update = p; 	this }

}
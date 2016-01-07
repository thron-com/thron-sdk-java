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
 * Request message for service JITagDefinition.remove
 */
@XmlRootElement(name="MITagDefinitionremoveReq")
@XmlType(name="MITagDefinitionremoveReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.remove")
class MITagDefinitionremoveReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var cascade: Boolean =_
	def withcascade(p:Boolean):MITagDefinitionremoveReq ={ 	this.cascade = p; 	this }

}
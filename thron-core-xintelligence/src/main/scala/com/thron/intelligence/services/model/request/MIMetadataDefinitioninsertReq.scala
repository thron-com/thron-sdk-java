package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataDefinitionValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadataDefinition.insert
 */
@XmlRootElement(name="MIMetadataDefinitioninsertReq")
@XmlType(name="MIMetadataDefinitioninsertReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadataDefinition.insert")
class MIMetadataDefinitioninsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MIMetadataDefinitionValue =_
	def withvalue(p:MIMetadataDefinitionValue):MIMetadataDefinitioninsertReq ={ 	this.value = p; 	this }

}
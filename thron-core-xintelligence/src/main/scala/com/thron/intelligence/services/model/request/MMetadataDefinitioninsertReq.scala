package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MMetadataDefinitionValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMetadataDefinition.insert
 */
@XmlRootElement(name="MMetadataDefinitioninsertReq")
@XmlType(name="MMetadataDefinitioninsertReq")
//#SWG#@ApiModel(description = "Request message for service JMetadataDefinition.insert")
class MMetadataDefinitioninsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MMetadataDefinitionValue =_
	def withvalue(p:MMetadataDefinitionValue):MMetadataDefinitioninsertReq ={ 	this.value = p; 	this }

}
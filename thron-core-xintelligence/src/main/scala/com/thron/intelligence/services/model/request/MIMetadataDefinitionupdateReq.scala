package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataDefinitionUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadataDefinition.update
 */
@XmlRootElement(name="MIMetadataDefinitionupdateReq")
@XmlType(name="MIMetadataDefinitionupdateReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadataDefinition.update")
class MIMetadataDefinitionupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MIMetadataDefinitionUpdate =_
	def withupdate(p:MIMetadataDefinitionUpdate):this.type ={ 	this.update = p; 	this }

}
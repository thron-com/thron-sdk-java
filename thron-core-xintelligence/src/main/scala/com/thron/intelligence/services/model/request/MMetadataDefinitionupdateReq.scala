package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MMetadataDefinitionUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMetadataDefinition.update
 */
@XmlRootElement(name="MMetadataDefinitionupdateReq")
@XmlType(name="MMetadataDefinitionupdateReq")
//#SWG#@ApiModel(description = "Request message for service JMetadataDefinition.update")
class MMetadataDefinitionupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MMetadataDefinitionUpdate =_
	def withupdate(p:MMetadataDefinitionUpdate):this.type ={ 	this.update = p; 	this }

}
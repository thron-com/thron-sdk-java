package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagMetadataList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.unlinkMetadataDefinition
 */
@XmlRootElement(name="MITagDefinitionunlinkMetadataDefinitionReq")
@XmlType(name="MITagDefinitionunlinkMetadataDefinitionReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.unlinkMetadataDefinition")
class MITagDefinitionunlinkMetadataDefinitionReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var items: MITagMetadataList =_
	def withitems(p:MITagMetadataList):MITagDefinitionunlinkMetadataDefinitionReq ={ 	this.items = p; 	this }

}
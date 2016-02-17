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
 * Request message for service JITagDefinition.updateTagMetadata
 */
@XmlRootElement(name="MITagDefinitionupdateTagMetadataReq")
@XmlType(name="MITagDefinitionupdateTagMetadataReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.updateTagMetadata")
class MITagDefinitionupdateTagMetadataReq extends Serializable {

	/**
	 * The desired position in the list
	 */
	//#SWG#@ApiModelProperty(value = """The desired position in the list""", required = true)
	@BeanProperty
	var items: MITagMetadataList =_
	def withitems(p:MITagMetadataList):this.type ={ 	this.items = p; 	this }

}
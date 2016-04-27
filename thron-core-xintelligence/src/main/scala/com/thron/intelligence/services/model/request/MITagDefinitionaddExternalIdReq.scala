package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MExternalId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.addExternalId
 */
@XmlRootElement(name="MITagDefinitionaddExternalIdReq")
@XmlType(name="MITagDefinitionaddExternalIdReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.addExternalId")
class MITagDefinitionaddExternalIdReq extends Serializable {

	/**
	 * New external Id
	 */
	//#SWG#@ApiModelProperty(value = """New external Id""", required = true)
	@BeanProperty
	var externalId: MExternalId =_
	def withexternalId(p:MExternalId):this.type ={ 	this.externalId = p; 	this }

}
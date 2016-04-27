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
 * Request message for service JITagDefinition.removeExternalId
 */
@XmlRootElement(name="MITagDefinitionremoveExternalIdReq")
@XmlType(name="MITagDefinitionremoveExternalIdReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.removeExternalId")
class MITagDefinitionremoveExternalIdReq extends Serializable {

	/**
	 * external Id to remove
	 */
	//#SWG#@ApiModelProperty(value = """external Id to remove""", required = true)
	@BeanProperty
	var externalId: MExternalId =_
	def withexternalId(p:MExternalId):this.type ={ 	this.externalId = p; 	this }

}
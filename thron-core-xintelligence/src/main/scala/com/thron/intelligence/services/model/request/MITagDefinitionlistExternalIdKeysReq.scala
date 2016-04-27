package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MKeyCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.listExternalIdKeys
 */
@XmlRootElement(name="MITagDefinitionlistExternalIdKeysReq")
@XmlType(name="MITagDefinitionlistExternalIdKeysReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.listExternalIdKeys")
class MITagDefinitionlistExternalIdKeysReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MKeyCriteria =_
	def withcriteria(p:MKeyCriteria):this.type ={ 	this.criteria = p; 	this }

}
package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataBulkValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadata.bulkRemove
 */
@XmlRootElement(name="MIMetadatabulkRemoveReq")
@XmlType(name="MIMetadatabulkRemoveReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.bulkRemove")
class MIMetadatabulkRemoveReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MIMetadataBulkValue =_
	def withvalue(p:MIMetadataBulkValue):MIMetadatabulkRemoveReq ={ 	this.value = p; 	this }

}
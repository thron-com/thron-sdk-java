package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataBulkValue2

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadata.bulkInsertMultiTargets
 */
@XmlRootElement(name="MIMetadatabulkInsertMultiTargetsReq")
@XmlType(name="MIMetadatabulkInsertMultiTargetsReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.bulkInsertMultiTargets")
class MIMetadatabulkInsertMultiTargetsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MIMetadataBulkValue2 =_
	def withvalue(p:MIMetadataBulkValue2):this.type ={ 	this.value = p; 	this }

}
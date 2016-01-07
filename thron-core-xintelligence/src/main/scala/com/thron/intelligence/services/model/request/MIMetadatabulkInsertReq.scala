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
 * Request message for service JIMetadata.bulkInsert
 */
@XmlRootElement(name="MIMetadatabulkInsertReq")
@XmlType(name="MIMetadatabulkInsertReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.bulkInsert")
class MIMetadatabulkInsertReq extends Serializable {

	/**
	 * An existing targetId for a specific classification
	 */
	//#SWG#@ApiModelProperty(value = """An existing targetId for a specific classification""", required = true)
	@BeanProperty
	var value: MIMetadataBulkValue =_
	def withvalue(p:MIMetadataBulkValue):MIMetadatabulkInsertReq ={ 	this.value = p; 	this }

}
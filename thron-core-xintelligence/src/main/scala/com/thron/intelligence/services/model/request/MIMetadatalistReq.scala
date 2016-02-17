package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataSearchCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadata.list
 */
@XmlRootElement(name="MIMetadatalistReq")
@XmlType(name="MIMetadatalistReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.list")
class MIMetadatalistReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MIMetadataSearchCriteria =_
	def withcriteria(p:MIMetadataSearchCriteria):this.type ={ 	this.criteria = p; 	this }

}
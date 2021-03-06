package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadataDefinitionSearchCriteria
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadataDefinition.list
 */
@XmlRootElement(name="MIMetadataDefinitionlistReq")
@XmlType(name="MIMetadataDefinitionlistReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadataDefinition.list")
class MIMetadataDefinitionlistReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MIMetadataDefinitionSearchCriteria =_
	def withcriteria(p:MIMetadataDefinitionSearchCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. Default value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default value is 50""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):this.type ={ 	this.limit = p; 	this }

	/**
	 * Optional.
	 * Default value is 0
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Default value is 0""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var orderBy: MEMetadataDefinitionOrderBy =_
	def withorderBy(p:MEMetadataDefinitionOrderBy):this.type ={ 	this.orderBy = p; 	this }

}
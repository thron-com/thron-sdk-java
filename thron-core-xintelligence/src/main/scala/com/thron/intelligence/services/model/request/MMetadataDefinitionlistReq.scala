package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MMetadataDefinitionSearchCriteria
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMetadataDefinition.list
 */
@XmlRootElement(name="MMetadataDefinitionlistReq")
@XmlType(name="MMetadataDefinitionlistReq")
//#SWG#@ApiModel(description = "Request message for service JMetadataDefinition.list")
class MMetadataDefinitionlistReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MMetadataDefinitionSearchCriteria =_
	def withcriteria(p:MMetadataDefinitionSearchCriteria):MMetadataDefinitionlistReq ={ 	this.criteria = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var orderBy: MEMetadataDefinitionOrderBy =_
	def withorderBy(p:MEMetadataDefinitionOrderBy):MMetadataDefinitionlistReq ={ 	this.orderBy = p; 	this }

	/**
	 * Optional.
	 * Default value is 0
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Default value is 0""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MMetadataDefinitionlistReq ={ 	this.offset = p; 	this }

	/**
	 * Optional. Default value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default value is 50""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):MMetadataDefinitionlistReq ={ 	this.limit = p; 	this }

}
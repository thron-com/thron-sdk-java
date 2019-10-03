package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagDefinitionSearchCriteria
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.list
 */
@XmlRootElement(name="MITagDefinitionlistReq")
@XmlType(name="MITagDefinitionlistReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.list")
class MITagDefinitionlistReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MITagDefinitionSearchCriteria =_
	def withcriteria(p:MITagDefinitionSearchCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. Used in conjunction with orderBy field to sort itagDefinitions by
	 * name (for a specific lang).
	 * The service always return all available langs for each itagDefinition.
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used in conjunction with orderBy field to sort itagDefinitions by name (for a specific lang).
	//#SWGNL#The service always return all available langs for each itagDefinition.
	//#SWGNL#Locale code (ISO639-1)""", required = true)
	@BeanProperty
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * Optional. Default and maximum value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default and maximum value is 50""", required = true)
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
	var orderBy: MEITagDefinitionOrderBy =_
	def withorderBy(p:MEITagDefinitionOrderBy):this.type ={ 	this.orderBy = p; 	this }

	/**
	 * if true, totalResults will be calculated and included in the response; if false,
	 * totalResults will not be calculated and the service performs better.
	 * Default value = true
	 */
	//#SWG#@ApiModelProperty(value = """if true, totalResults will be calculated and included in the response; if false, totalResults will not be calculated and the service performs better.
	//#SWGNL#Default value = true""", required = true)
	@BeanProperty
	var returnTotalResults: Boolean =_
	def withreturnTotalResults(p:Boolean):this.type ={ 	this.returnTotalResults = p; 	this }

	/**
	 * Optional. default is false
	 * Fill the list of linked metadata definition in items.linkedMetadataDefinition
	 */
	//#SWG#@ApiModelProperty(value = """Optional. default is false
	//#SWGNL#Fill the list of linked metadata definition in items.linkedMetadataDefinition""", required = true)
	@BeanProperty
	var showLinkedMetadata: Boolean =_
	def withshowLinkedMetadata(p:Boolean):this.type ={ 	this.showLinkedMetadata = p; 	this }

	/**
	 * Optional. default is false
	 * Fill the list of subnodes ids in the response.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. default is false
	//#SWGNL#Fill the list of subnodes ids in the response.""", required = true)
	@BeanProperty
	var showSubNodeIds: Boolean =_
	def withshowSubNodeIds(p:Boolean):this.type ={ 	this.showSubNodeIds = p; 	this }

}
package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MITagDefinitionJoinedSearchCriteria
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.listJoined
 */
@XmlRootElement(name="MITagDefinitionlistJoinedReq")
@XmlType(name="MITagDefinitionlistJoinedReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.listJoined")
class MITagDefinitionlistJoinedReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MITagDefinitionJoinedSearchCriteria =_
	def withcriteria(p:MITagDefinitionJoinedSearchCriteria):this.type ={ 	this.criteria = p; 	this }

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
	var orderBy: MEITagDefinitionOrderBy =_
	def withorderBy(p:MEITagDefinitionOrderBy):this.type ={ 	this.orderBy = p; 	this }

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
	 * Target ITagDefinition Id
	 */
	//#SWG#@ApiModelProperty(value = """Target ITagDefinition Id""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

}
package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MEMetadataDefinitionDataType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Main class used to define the MetadataDefinition search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause. 
 */
@XmlRootElement(name="MMetadataDefinitionSearchCriteria") 
@XmlType(name="MMetadataDefinitionSearchCriteria")
//#SWG#@ApiModel(description = """Main class used to define the MetadataDefinition search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. """)
class MMetadataDefinitionSearchCriteria extends Serializable {

	/**
	 * search by MetadataDefinition.ids
	 */
	//#SWG#@ApiModelProperty(value = """search by MetadataDefinition.ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):MMetadataDefinitionSearchCriteria ={ 	this.ids = p; 	this }

	/**
	 * search by MetadataDefinition.keys
	 */
	//#SWG#@ApiModelProperty(value = """search by MetadataDefinition.keys""")
	@BeanProperty 
	var keys: List[String] = new ArrayList[String]
	def withkeys(p:List[String]):MMetadataDefinitionSearchCriteria ={ 	this.keys = p; 	this }

	/**
	 * Search text in label, description, key and note fields of MetadataDefinition.
	 * Search all words separated by spaces and in exact order (by token)
	 * 
	 * <b>Example:</b>
	 * search metadataDefinitions with text "red book table" on lang "EN" in fields
	 * label, description, key or note. The service return all metadataDefinitions
	 * matching the keywords "red", "book" and "table" (in the exact order)
	 * 
	 * criteria:{
	 * lang:"EN",
	 * text: "red book table"
	 * }
	 */
	//#SWG#@ApiModelProperty(value = """Search text in label, description, key and note fields of MetadataDefinition.
	//#SWGNL#Search all words separated by spaces and in exact order (by token)
	//#SWGNL#
	//#SWGNL#<b>Example:</b>
	//#SWGNL#search metadataDefinitions with text "red book table" on lang "EN" in fields label, description, key or note. The service return all metadataDefinitions matching the keywords "red", "book" and "table" (in the exact order)
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#lang:"EN",
	//#SWGNL#text: "red book table"
	//#SWGNL#}""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):MMetadataDefinitionSearchCriteria ={ 	this.text = p; 	this }

	/**
	 * Locale code (ISO639-1).
	 * used to search the metadata definition having label like "name" for the defined
	 * languages. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	 * Example: the user would like to find the metadata definition with label "house"
	 * for lang "EN". If the "label" is empty the service return all metadata
	 * definition defined for the specified lang.
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1).
	//#SWGNL#used to search the metadata definition having label like "name" for the defined languages. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	//#SWGNL#Example: the user would like to find the metadata definition with label "house" for lang "EN". If the "label" is empty the service return all metadata definition defined for the specified lang.""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):MMetadataDefinitionSearchCriteria ={ 	this.lang = p; 	this }

	/**
	 * used to search all MetadataDefinition in Trash
	 */
	//#SWG#@ApiModelProperty(value = """used to search all MetadataDefinition in Trash""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):MMetadataDefinitionSearchCriteria ={ 	this.removed = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metadataType: List[MEMetadataDefinitionDataType] = new ArrayList[MEMetadataDefinitionDataType]
	def withmetadataType(p:List[MEMetadataDefinitionDataType]):MMetadataDefinitionSearchCriteria ={ 	this.metadataType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
				StringUtils.isBlank(text) ||
				(text.length <= 200 && StringUtils.isNotBlank(lang))
	}

}
package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MESourceType
import com.thron.intelligence.services.model.itag.MTextSearchOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Main class used to define the itagdefinition search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * For example ITagDefinitionSearchCriteria.ids= ["house"] AND
 * ITagDefinitionSearchCriteria.categorized=true search all itagdefinition with
 * id/prettyId "auto" AND categorized.
 * The criteria fields with [0..*] cardinality use OR clause.
 * For example ITagDefinitionSearchCriteria.ids= ["auto","house"] search the itags
 * with id/prettyId auto OR house.
 */
@XmlRootElement(name="MITagDefinitionSearchCriteria") 
@XmlType(name="MITagDefinitionSearchCriteria")
//#SWG#@ApiModel(description = """Main class used to define the itagdefinition search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#For example ITagDefinitionSearchCriteria.ids= ["house"] AND ITagDefinitionSearchCriteria.categorized=true search all itagdefinition with id/prettyId "auto" AND categorized.
//#SWGNL#The criteria fields with [0..*] cardinality use OR clause.
//#SWGNL#For example ITagDefinitionSearchCriteria.ids= ["auto","house"] search the itags with id/prettyId auto OR house.""")
class MITagDefinitionSearchCriteria extends Serializable {

	/**
	 * list of ITagDefinition.id or ITagDefinition.prettyId
	 */
	//#SWG#@ApiModelProperty(value = """list of ITagDefinition.id or ITagDefinition.prettyId""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * return the tags having as ancestor the given ITagDefinition.id
	 */
	//#SWG#@ApiModelProperty(value = """return the tags having as ancestor the given ITagDefinition.id""")
	@BeanProperty 
	var childOf: String =_
	def withchildOf(p:String):this.type ={ 	this.childOf = p; 	this }

	/**
	 * exclude all tags with level position inside the tag tree higher than ...
	 * The root level is 1.
	 */
	//#SWG#@ApiModelProperty(value = """exclude all tags with level position inside the tag tree higher than ...
	//#SWGNL#The root level is 1.""")
	@BeanProperty 
	var excludeLevelHigherThan: Integer =_
	def withexcludeLevelHigherThan(p:Integer):this.type ={ 	this.excludeLevelHigherThan = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var status: MEITagStatus =_
	def withstatus(p:MEITagStatus):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sourceType: List[MESourceType] = new ArrayList[MESourceType]
	def withsourceType(p:List[MESourceType]):this.type ={ 	this.sourceType = p; 	this }

	/**
	 * Used to split the ITagdefinition in two macro categories (categorized and
	 * uncategorized tags). Usually the semantic engines creates new ITagDefinition
	 * with the categorized attribute set to false.
	 */
	//#SWG#@ApiModelProperty(value = """Used to split the ITagdefinition in two macro categories (categorized and uncategorized tags). Usually the semantic engines creates new ITagDefinition with the categorized attribute set to false.""")
	@BeanProperty 
	var categorized: Boolean =_
	def withcategorized(p:Boolean):this.type ={ 	this.categorized = p; 	this }

	/**
	 * Used as text search on MITagDefinition and works over the specified
	 * ITagDefinition fields label and description (for a given
	 * MITagDefinitionSearchCriteria.lang)
	 * 
	 * <b>Example1:</b>
	 * search the text "red book table" on lang "EN" in itagdefinition fields label,
	 * description. The service return all itagdefinition matching the keywords "red",
	 * "book" and "table" (in the exact order) in LABEL or DESCRIPTION fields.
	 * 
	 * criteria:{
	 * lang:"EN",
	 * text: "red book table"
	 * }
	 * 
	 * or
	 * 
	 * criteria:{
	 * lang:"EN",
	 * text: "red book table",
	 * textSearchOption:{
	 *  searchOnFields:["LABEL","DESCRIPTION"],
	 *  searchKeyOption:"BY_TOKEN"}
	 * }
	 * 
	 * 
	 * <b>Example2:</b>
	 * search the text "the red book" on lang "EN" in field name only, matching all
	 * tokens. The service return all itagdefinition matching the text "the red book"
	 * in LABEL field.
	 * 
	 * criteria:{
	 * lang:"EN"
	 * text: "the red book",
	 * textSearchOption:{
	 *  searchOnFields:["LABEL"],
	 *  searchKeyOption:"EXACT_MATCH "}
	 * }
	 */
	//#SWG#@ApiModelProperty(value = """Used as text search on MITagDefinition and works over the specified ITagDefinition fields label and description (for a given MITagDefinitionSearchCriteria.lang)
	//#SWGNL#
	//#SWGNL#<b>Example1:</b>
	//#SWGNL#search the text "red book table" on lang "EN" in itagdefinition fields label, description. The service return all itagdefinition matching the keywords "red", "book" and "table" (in the exact order) in LABEL or DESCRIPTION fields.
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#lang:"EN",
	//#SWGNL#text: "red book table"
	//#SWGNL#}
	//#SWGNL#
	//#SWGNL#or 
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#lang:"EN",
	//#SWGNL#text: "red book table",
	//#SWGNL#textSearchOption:{ 
	//#SWGNL#  searchOnFields:["LABEL","DESCRIPTION"],
	//#SWGNL#  searchKeyOption:"BY_TOKEN"}
	//#SWGNL#}
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#<b>Example2:</b>
	//#SWGNL#search the text "the red book" on lang "EN" in field name only, matching all tokens. The service return all itagdefinition matching the text "the red book" in LABEL field.
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#lang:"EN"
	//#SWGNL#text: "the red book",
	//#SWGNL#textSearchOption:{ 
	//#SWGNL#  searchOnFields:["LABEL"],
	//#SWGNL#  searchKeyOption:"EXACT_MATCH "}
	//#SWGNL#}""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * Used to define search option for the MITagDefinitionSearchCriteria.text
	 * attribute.
	 */
	//#SWG#@ApiModelProperty(value = """Used to define search option for the MITagDefinitionSearchCriteria.text attribute.""")
	@BeanProperty 
	var textSearchOptions: MTextSearchOptions  = new MTextSearchOptions()
	def withtextSearchOptions(p:MTextSearchOptions):this.type ={ 	this.textSearchOptions = p; 	this }

	/**
	 * Locale code (ISO639-1).
	 * used to search the tags having title like "name" for the defined languages.
	 * Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	 * Example: the user would like to find the tags with label "house" for lang "EN".
	 * If the "label" is empty the service return all tags defined for the specified
	 * lang.
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1).
	//#SWGNL#used to search the tags having title like "name" for the defined languages. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	//#SWGNL#Example: the user would like to find the tags with label "house" for lang "EN". If the "label" is empty the service return all tags defined for the specified lang.""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * Filter all ITagDefinition linked to one of the metadataDefinition specified in
	 * the list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all ITagDefinition linked to one of the metadataDefinition specified in the list.""")
	@BeanProperty 
	var metadataDefinitionIds: List[String] = new ArrayList[String]
	def withmetadataDefinitionIds(p:List[String]):this.type ={ 	this.metadataDefinitionIds = p; 	this }

	/**
	 * Deprecated by metadataDefinitionIds
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by metadataDefinitionIds""")
	@BeanProperty 
	@Deprecated
	var metadataDefinitionId: String =_
	@Deprecated
	def withmetadataDefinitionId(p:String):this.type ={ 	this.metadataDefinitionId = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
		Option(excludeLevelHigherThan).forall(_ >0) &&
			StringUtils.isBlank(text) ||
		    (Option(text).exists(_.length <= 200) && StringUtils.isNotBlank(lang))
	}

}
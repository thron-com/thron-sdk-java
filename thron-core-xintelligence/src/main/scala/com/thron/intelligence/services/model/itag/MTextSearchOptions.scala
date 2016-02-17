package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Optional. Search Option used to drive MITagDefinitionSearchCriteria.text field.
 * 
 * If not defined, default values are:
 * {
 *  searchOnFields:["LABEL","DESCRIPTION"],
 *  searchKeyOption:"BY_TOKEN"
 * }
 */
@XmlRootElement(name="MTextSearchOptions") 
@XmlType(name="MTextSearchOptions")
//#SWG#@ApiModel(description = """Optional. Search Option used to drive MITagDefinitionSearchCriteria.text field.
//#SWGNL#If not defined, default values are:
//#SWGNL#{ 
//#SWGNL#  searchOnFields:["LABEL","DESCRIPTION"],
//#SWGNL#  searchKeyOption:"BY_TOKEN"
//#SWGNL#}""")
class MTextSearchOptions extends Serializable {

	/**
	 * Used to drive the text search (BY_TOKEN is the default value)
	 * <ul>
	 * 	<li>EXACT_MATCH is used to search exactly the "text" in the given fields.
	 * Example: "red apple" text search match labels like "Red Apple", "red Apple and
	 * other fruits"</li>
	 * 	<li>BY_TOKEN is used to search all words (separated by spaces and in exact
	 * order) specified in the "text" field. Example: "red apple" text search match
	 * labels like "red ...", "apple ...", "red and Apple are..."</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used to drive the text search (BY_TOKEN is the default value)
	//#SWGNL#<ul>
	//#SWGNL#	<li>EXACT_MATCH is used to search exactly the "text" in the given fields. Example: "red apple" text search match labels like "Red Apple", "red Apple and other fruits"</li>
	//#SWGNL#	<li>BY_TOKEN is used to search all words (separated by spaces and in exact order) specified in the "text" field. Example: "red apple" text search match labels like "red ...", "apple ...", "red and Apple are..."</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var searchKeyOption: MESearchOption  = MESearchOption.BY_TOKEN
	def withsearchKeyOption(p:MESearchOption):this.type ={ 	this.searchKeyOption = p; 	this }

	/**
	 * Used to search on the given list of fields.
	 * If searchOnFields is empty and "text" is defined, the service search on all
	 * available fields.
	 */
	//#SWG#@ApiModelProperty(value = """Used to search on the given list of fields.
	//#SWGNL#If searchOnFields is empty and "text" is defined, the service search on all available fields.""")
	@BeanProperty 
	var searchOnFields: List[MESearchField] = new ArrayList[MESearchField]
	def withsearchOnFields(p:List[MESearchField]):this.type ={ 	this.searchOnFields = p; 	this }

}
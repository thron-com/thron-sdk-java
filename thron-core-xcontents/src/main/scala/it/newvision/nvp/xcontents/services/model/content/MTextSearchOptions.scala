package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MESearchKeyOption
import it.newvision.nvp.xcontents.services.model.msg.MESearchField

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Search Option used on MContentCriteria
 */
@XmlRootElement(name="MTextSearchOptions") 
@XmlType(name="MTextSearchOptions")
//#SWG#@ApiModel(description = """Search Option used on MContentCriteria""")
class MTextSearchOptions extends Serializable {

	/**
	 * the key used to search on name, description, excerpt or owner of a content in a
	 * specific locale (MContentCriteria.locale). Use the searchOnFields attribute to
	 * specify the fields to use.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>length <=200</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """the key used to search on name, description, excerpt or owner of a content in a specific locale (MContentCriteria.locale). Use the searchOnFields attribute to specify the fields to use.
	//#SWGNL#
	//#SWGNL#Constraints: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>length <=200</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var searchKey: String =_
	def withsearchKey(p:String):this.type ={ 	this.searchKey = p; 	this }

	/**
	 * Used to drive the text search. (EXACT_MATCH is the default value)
	 * <ul>
	 * 	<li>EXACT_MATCH is used to search exactly the "text" in the given fields.
	 * Example: "red apple" text search match labels like "Red Apple", "red Apple and
	 * other fruits"</li>
	 * </ul>
	 * <ul>
	 * 	<li>BY_TOKEN is used to search all words (separated by spaces and in exact
	 * order) specified in the "text" field. Example: "red apple" text search match
	 * labels like "red", "apple", "red and Apple are..."</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used to drive the text search. (EXACT_MATCH is the default value)
	//#SWGNL#<ul>
	//#SWGNL#	<li>EXACT_MATCH is used to search exactly the "text" in the given fields. Example: "red apple" text search match labels like "Red Apple", "red Apple and other fruits"</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>BY_TOKEN is used to search all words (separated by spaces and in exact order) specified in the "text" field. Example: "red apple" text search match labels like "red", "apple", "red and Apple are..."</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var searchKeyOption: MESearchKeyOption  = MESearchKeyOption.EXACT_MATCH
	def withsearchKeyOption(p:MESearchKeyOption):this.type ={ 	this.searchKeyOption = p; 	this }

	/**
	 * Used to search on the given list of fields. If searchOnFields is empty and
	 * searchKey is defined, the service search on all available fields.
	 */
	//#SWG#@ApiModelProperty(value = """Used to search on the given list of fields. If searchOnFields is empty and searchKey is defined, the service search on all available fields.""")
	@BeanProperty 
	var searchOnFields: List[MESearchField] = new ArrayList[MESearchField]
	def withsearchOnFields(p:List[MESearchField]):this.type ={ 	this.searchOnFields = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(searchKey).forall(_.length<=200)
	}

}
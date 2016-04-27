package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MESourceType
import com.thron.intelligence.model.itag.MEStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagDefinitionJoinedSearchCriteria") 
@XmlType(name="MITagDefinitionJoinedSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MITagDefinitionJoinedSearchCriteria extends Serializable {

	/**
	 * list of ITagDefinition.id (old ITagDefinition ids merged in other tags)
	 */
	//#SWG#@ApiModelProperty(value = """list of ITagDefinition.id (old ITagDefinition ids merged in other tags)""")
	@BeanProperty 
	var joinedIds: List[String] = new ArrayList[String]
	def withjoinedIds(p:List[String]):this.type ={ 	this.joinedIds = p; 	this }

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
	 * Used as text search on ITagDefinition and works over the specified
	 * ITagDefinition fields label and description (for a given
	 * MITagDefinitionSearchCriteria.lang)
	 */
	//#SWG#@ApiModelProperty(value = """Used as text search on ITagDefinition and works over the specified ITagDefinition fields label and description (for a given MITagDefinitionSearchCriteria.lang)""")
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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var joinedStatus: List[MEStatus] = new ArrayList[MEStatus]
	def withjoinedStatus(p:List[MEStatus]):this.type ={ 	this.joinedStatus = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
			StringUtils.isBlank(text) ||
		    (Option(text).exists(_.length <= 200) && StringUtils.isNotBlank(lang))
	}

}
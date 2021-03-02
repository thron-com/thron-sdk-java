package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata
import it.newvision.nvp.xcontents.model.MECategoryType
import it.newvision.nvp.xcontents.services.model.acl.MAclCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCategoryCriteria") 
@XmlType(name="MCategoryCriteria")
//#SWG#@ApiModel(description = """""")
class MCategoryCriteria extends Serializable {

	/**
	 * list of category Ids or prettyIds
	 */
	//#SWG#@ApiModelProperty(value = """list of category Ids or prettyIds""")
	@BeanProperty 
	var categoryIds: List[String] = new ArrayList[String]
	def withcategoryIds(p:List[String]):this.type ={ 	this.categoryIds = p; 	this }

	/**
	 * DEPRECATED.
	 * Use the textSearch field.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Use the textSearch field.""")
	@BeanProperty 
	@Deprecated
	var name: String =_
	@Deprecated
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Locale code (ISO639-1).
	 * Used to search the categories having title like "name" for one of the defined
	 * locales. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	 * Example: the user would like to find the categories with name "my house" for
	 * locale "EN". If the "name" is empty the service return all categories defined
	 * for the specified locale.
	 * The fields works in combination with MContentCriteria.name and MContentCriteria.
	 * textSearch.searchKey
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1).
	//#SWGNL#Used to search the categories having title like "name" for one of the defined locales. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	//#SWGNL#Example: the user would like to find the categories with name "my house" for locale "EN". If the "name" is empty the service return all categories defined for the specified locale.
	//#SWGNL#The fields works in combination with MContentCriteria.name and MContentCriteria.textSearch.searchKey""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	@Deprecated
	def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * Search text in name and description fields.
	 * Example: "red apple" text search match labels like "Red Apple", "red Apple and .
	 * .."
	 */
	//#SWG#@ApiModelProperty(value = """Search text in name and description fields.
	//#SWGNL#Example: "red apple" text search match labels like "Red Apple", "red Apple and ..."""")
	@BeanProperty 
	var textSearch: String =_
	def withtextSearch(p:String):this.type ={ 	this.textSearch = p; 	this }

	/**
	 * filter the category by type: private, public or system.
	 */
	//#SWG#@ApiModelProperty(value = """filter the category by type: private, public or system.""")
	@BeanProperty 
	var categoryTypes: List[MECategoryType] = new ArrayList[MECategoryType]
	def withcategoryTypes(p:List[MECategoryType]):this.type ={ 	this.categoryTypes = p; 	this }

	/**
	 * return the categories having as ancestor the given categoryId
	 */
	//#SWG#@ApiModelProperty(value = """return the categories having as ancestor the given categoryId""")
	@BeanProperty 
	var childOf: String =_
	def withchildOf(p:String):this.type ={ 	this.childOf = p; 	this }

	/**
	 * exclude all categories with level position inside the category tree higher than
	 * ...
	 * The root level is 1.
	 */
	//#SWG#@ApiModelProperty(value = """exclude all categories with level position inside the category tree higher than ...
	//#SWGNL#The root level is 1.""")
	@BeanProperty 
	var excludeLevelHigherThan: Integer =_
	def withexcludeLevelHigherThan(p:Integer):this.type ={ 	this.excludeLevelHigherThan = p; 	this }

	/**
	 * filter only categories available in the given "availableInSolutions" list.
	 */
	//#SWG#@ApiModelProperty(value = """filter only categories available in the given "availableInSolutions" list.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	/**
	 * used to find only the categories with specific policies.
	 * acl.context is not required
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the categories with specific policies.
	//#SWGNL#acl.context is not required""")
	@BeanProperty 
	var acl: MAclCriteria =_
	def withacl(p:MAclCriteria):this.type ={ 	this.acl = p; 	this }

	/**
	 * If true, it returns only the categories marked as starred by the user
	 */
	//#SWG#@ApiModelProperty(value = """If true, it returns only the categories marked as starred by the user""")
	@BeanProperty 
	var onlyStarredCategories: Boolean = false
	def withonlyStarredCategories(p:Boolean):this.type ={ 	this.onlyStarredCategories = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		categoryIds = categoryIds filterNot {_.isEmpty}
		categoryTypes = categoryTypes filterNot {_ == null}
		availableInSolutions = availableInSolutions filterNot {_.isEmpty}
		metadatas = metadatas filterNot {_ == null}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}
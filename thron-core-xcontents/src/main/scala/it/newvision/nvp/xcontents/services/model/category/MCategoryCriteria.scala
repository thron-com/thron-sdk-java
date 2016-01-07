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
	 * list of category Ids or category PrettyIds
	 */
	//#SWG#@ApiModelProperty(value = """list of category Ids or category PrettyIds""")
	@BeanProperty 
	var categoryIds: List[String] = new ArrayList[String]
	def withcategoryIds(p:List[String]):MCategoryCriteria ={ 	this.categoryIds = p; 	this }

	/**
	 * used to find only the categories having the specified "name" for a specific
	 * "locale".
	 * The criteria works only if "locale" criteria is defined.
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the categories having the specified "name" for a specific "locale". 
	//#SWGNL#The criteria works only if "locale" criteria is defined.""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):MCategoryCriteria ={ 	this.name = p; 	this }

	/**
	 * used to search the categories having title like "name" for the defined locale.
	 * Example: the user would like to find the categories with name "my house" for
	 * locale "EN". If the "name" is empty the service return all categories defined
	 * for the specified locale.
	 */
	//#SWG#@ApiModelProperty(value = """used to search the categories having title like "name" for the defined locale.
	//#SWGNL#Example: the user would like to find the categories with name "my house" for locale "EN". If the "name" is empty the service return all categories defined for the specified locale.""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):MCategoryCriteria ={ 	this.locale = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	@Deprecated
	def withmetadatas(p:List[MMetadata]):MCategoryCriteria ={ 	this.metadatas = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):MCategoryCriteria ={ 	this.solution = p; 	this }

	/**
	 * Search text in name and description fields.
	 * Example: "red apple" text search match labels like "Red Apple", "red Apple and .
	 * .."
	 */
	//#SWG#@ApiModelProperty(value = """Search text in name and description fields.
	//#SWGNL#Example: "red apple" text search match labels like "Red Apple", "red Apple and ..."""")
	@BeanProperty 
	var textSearch: String =_
	def withtextSearch(p:String):MCategoryCriteria ={ 	this.textSearch = p; 	this }

	/**
	 * filter the category by type: private, public or system.
	 */
	//#SWG#@ApiModelProperty(value = """filter the category by type: private, public or system.""")
	@BeanProperty 
	var categoryTypes: List[MECategoryType] = new ArrayList[MECategoryType]
	def withcategoryTypes(p:List[MECategoryType]):MCategoryCriteria ={ 	this.categoryTypes = p; 	this }

	/**
	 * return the categories having as ancestor the given categoryId
	 */
	//#SWG#@ApiModelProperty(value = """return the categories having as ancestor the given categoryId""")
	@BeanProperty 
	var childOf: String =_
	def withchildOf(p:String):MCategoryCriteria ={ 	this.childOf = p; 	this }

	/**
	 * exclude all categories with level position inside the category tree higher than
	 * ...
	 * The root level is 1.
	 */
	//#SWG#@ApiModelProperty(value = """exclude all categories with level position inside the category tree higher than ...
	//#SWGNL#The root level is 1.""")
	@BeanProperty 
	var excludeLevelHigherThan: Integer =_
	def withexcludeLevelHigherThan(p:Integer):MCategoryCriteria ={ 	this.excludeLevelHigherThan = p; 	this }

	/**
	 * filter only categories available in the given "availableInSolutions" list.
	 */
	//#SWG#@ApiModelProperty(value = """filter only categories available in the given "availableInSolutions" list.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):MCategoryCriteria ={ 	this.availableInSolutions = p; 	this }

	/**
	 * used to find only the categories with specific policies.
	 * acl.context is not required.
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the categories with specific policies.  
	//#SWGNL#acl.context is not required.""")
	@BeanProperty 
	var acl: MAclCriteria =_
	def withacl(p:MAclCriteria):MCategoryCriteria ={ 	this.acl = p; 	this }

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
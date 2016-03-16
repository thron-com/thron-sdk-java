package it.newvision.nvp.xcontents.model
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
 * The Category class is used to organize the contents in 4ME Platform.
 * There could be three different types of categories (defined by the categoryType
 * attribute):
 * <ul>
 * 	<li>PUBLIC</li>
 * 	<li>PRIVATE</li>
 * 	<li>SYSTEM</li>
 * </ul>
 * 
 * There could be different categories trees with the same categoryType (mixed
 * categoryType trees are not allowed).
 * 
 * PUBLIC categories can have a name, description (MCategory4Locale class) and
 * prettyId (MPrettyId class) in different locales.
 * 
 * PRIVATE categories are used for personal organisation of contents, for this
 * reason can be owned by one single user. Private categories can have one single
 * name and description (no multi locale), and can not have prettyId.
 * 
 * SYSTEM categories are handled by 4ME Platform and can not be removed. System
 * categories have no locale and prettyId.
 * <ul>
 * 	<li>TRASH category: Trash is a system category with id "_TRASH_" and is used
 * to store all contents before permanent deletion. </li>
 * </ul>
 */
@XmlRootElement(name="MCategory") 
@XmlType(name="MCategory")
//#SWG#@ApiModel(description = """The Category class is used to organize the contents in 4ME Platform.
//#SWGNL#There could be three different types of categories (defined by the categoryType attribute): 
//#SWGNL#<ul>
//#SWGNL#	<li>PUBLIC</li>
//#SWGNL#	<li>PRIVATE</li>
//#SWGNL#	<li>SYSTEM</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#There could be different categories trees with the same categoryType (mixed categoryType trees are not allowed).
//#SWGNL#
//#SWGNL#PUBLIC categories can have a name, description (MCategory4Locale class) and prettyId (MPrettyId class) in different locales.
//#SWGNL#
//#SWGNL#PRIVATE categories are used for personal organisation of contents, for this reason can be owned by one single user. Private categories can have one single name and description (no multi locale), and can not have prettyId.
//#SWGNL#
//#SWGNL#SYSTEM categories are handled by 4ME Platform and can not be removed. System categories have no locale and prettyId.
//#SWGNL#<ul>
//#SWGNL#	<li>TRASH category: Trash is a system category with id "_TRASH_" and is used to store all contents before permanent deletion. </li>
//#SWGNL#</ul>""")
class MCategory extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>max length = 150</li>
	 * 	<li>only lower case chars and digits</li>
	 * </ul>
	 * <ul>
	 * 	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	 * 	<li>it's not possible to have more prettyId with the same locale.</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 150</li>
	//#SWGNL#	<li>only lower case chars and digits</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	//#SWGNL#	<li>it's not possible to have more prettyId with the same locale.</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var prettyIds: List[MPrettyId] = new ArrayList[MPrettyId]
	def withprettyIds(p:List[MPrettyId]):this.type ={ 	this.prettyIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var upCategoryId: String =_
	def withupCategoryId(p:String):this.type ={ 	this.upCategoryId = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * DEPRECATED.
	 * AvailableInSolutions field is used to mark the categories owned by a set of
	 * solutions (Apps).
	 * The are no special constraints based on this filed and is used in the search
	 * criteria.
	 * This field allow a specific App to show only the category subset specific for
	 * the app.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#AvailableInSolutions field is used to mark the categories owned by a set of solutions (Apps).
	//#SWGNL#The are no special constraints based on this filed and is used in the search criteria.
	//#SWGNL#This field allow a specific App to show only the category subset specific for the app.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * ordered list of ancestors Category Ids. It's used to quickly create the
	 * Category tree. The list of categories follow the
	 * Example:
	 * Given a category tree with 4 levels
	 * Category1 -> Category2 -> Category3 -> Category4
	 * 
	 * The ancestors ids for each category is:
	 * Category1.ancestorsIds = []
	 * Category2.ancestorsIds = [Category1]
	 * Category3.ancestorsIds = [Category1,Category2]
	 * Category4.ancestorsIds = [Category1,Category2, Category3]
	 */
	//#SWG#@ApiModelProperty(value = """ordered list of ancestors Category Ids. It's used to quickly create the Category tree. The list of categories follow the
	//#SWGNL#Example:
	//#SWGNL#Given a category tree with 4 levels
	//#SWGNL#Category1 -> Category2 -> Category3 -> Category4
	//#SWGNL#
	//#SWGNL#The ancestors ids for each category is:
	//#SWGNL#Category1.ancestorsIds = []
	//#SWGNL#Category2.ancestorsIds = [Category1]
	//#SWGNL#Category3.ancestorsIds = [Category1,Category2]
	//#SWGNL#Category4.ancestorsIds = [Category1,Category2, Category3]""")
	@BeanProperty 
	var ancestorIds: List[String] = new ArrayList[String]
	def withancestorIds(p:List[String]):this.type ={ 	this.ancestorIds = p; 	this }

	/**
	 * the username of the owner of the category. It's used to define private
	 * categories and with categoryType=PRIVATE
	 */
	//#SWG#@ApiModelProperty(value = """the username of the owner of the category. It's used to define private categories and with categoryType=PRIVATE""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * used to categorize the different categories in 4ME Platform. Only categories
	 * tree with the same categoryType are allowed.
	 */
	//#SWG#@ApiModelProperty(value = """used to categorize the different categories in 4ME Platform. Only categories tree with the same categoryType are allowed.""" ,required = true)
	@BeanProperty 
	var categoryType: MECategoryType  = MECategoryType.PUBLIC
	def withcategoryType(p:MECategoryType):this.type ={ 	this.categoryType = p; 	this }

	/**
	 * custom metadata linked to the category
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata linked to the category""")
	@BeanProperty 
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * Optional. The creation date of the category
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the category""")
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * Deprecated.
	 * used for custom lexicographical order of categories. The field in used in
	 * JCategory.findByProperties (MECategoryOrderBy.sortingField_A/D) to sort the
	 * result set.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#used for custom lexicographical order of categories. The field in used in JCategory.findByProperties (MECategoryOrderBy.sortingField_A/D) to sort the result set.""")
	@BeanProperty 
	@Deprecated
	var sortingField: String =_
	@Deprecated
	def withsortingField(p:String):this.type ={ 	this.sortingField = p; 	this }

	@BeanProperty 
	var version: Long =_
	def withversion(p:Long):this.type ={ 	this.version = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var linkedCategories: List[MCategory] = new ArrayList[MCategory]
	  def withlinkedCategories(p:List[MCategory]):this.type ={ 	this.linkedCategories = p; 	this }

	/**
	 * name and description values for the category in multilocale
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """name and description values for the category in multilocale""")
	var locales: List[MCategory4Locale] = new ArrayList[MCategory4Locale]
	  def withlocales(p:List[MCategory4Locale]):this.type ={ 	this.locales = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isPrivate():Boolean ={
		categoryType == MECategoryType.PRIVATE
	}

}
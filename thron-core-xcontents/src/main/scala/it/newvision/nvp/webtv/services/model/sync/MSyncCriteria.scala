package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the content search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * For example SyncCriteria.contentType= "VIDEO" AND SyncCriteria.
 * linkedCategories="432hj432-43265dfg" search all VIDEO contents linked to the
 * category 432hj432-43265dfg.
 * The attributes with [0..*] cardinality use OR clause.
 * For example SyncCriteria.contentType = ["VIDEO","IMAGE"] search all contents
 * with contentType equals VIDEO OR IMAGE only
 */
@XmlRootElement(name="MSyncCriteria") 
@XmlType(name="MSyncCriteria")
//#SWG#@ApiModel(description = """main class used to define the content search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#For example SyncCriteria.contentType= "VIDEO" AND SyncCriteria.linkedCategories="432hj432-43265dfg" search all VIDEO contents linked to the category 432hj432-43265dfg.
//#SWGNL#The attributes with [0..*] cardinality use OR clause.
//#SWGNL#For example SyncCriteria.contentType = ["VIDEO","IMAGE"] search all contents with contentType equals VIDEO OR IMAGE only""")
class MSyncCriteria extends Serializable {

	/**
	 * Filter all contents having contentType in the specified list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all contents having contentType in the specified list.""")
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * used to filter the contents linked (or previously linked) to the given
	 * categories. Commonly used to have the list of Contents linked to a category.
	 * The service return
	 * * all contents currently linked to the categoryId
	 * * all contents were linked to specified categoryId (this is used to know when a
	 * content has been removed from a category)
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the contents linked (or previously linked) to the given categories. Commonly used to have the list of Contents linked to a category.
	//#SWGNL#The service return 
	//#SWGNL#* all contents currently linked to the categoryId
	//#SWGNL#* all contents were linked to specified categoryId (this is used to know when a content has been removed from a category)""")
	@BeanProperty 
	@Deprecated
	var linkedCategories: List[String] = new ArrayList[String]
	@Deprecated
	def withlinkedCategories(p:List[String]):this.type ={ 	this.linkedCategories = p; 	this }

}
package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}
//#SWG#import com.wordnik.swagger.annotations._
import _root_.scala.beans.BeanProperty
import javax.xml.bind.annotation._
import it.newvision.nvp.xcontents.services.model.common.MDateRange

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * It is used to define the content search criteria. Each attribute is a specific
 * search criteria. If an attribute is not defined (null) the search criteria is
 * not applied. The combination of two or more criteria are with AND clause. For
 * example criteria.creationDate  AND criteria.contentType search all contents of
 * type "Video" created in a specific range. The attributes with [0..*]
 * cardinality use OR clause. For example criteria.contentType = ["VIDEO","IMAGE"]
 * search all VIEDO or IMAGE contents
 */
@XmlRootElement(name="MContentSearchCriteria") 
@XmlType(name="MContentSearchCriteria")
//#SWG#@ApiModel(description = """It is used to define the content search criteria. Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more criteria are with AND clause. For example criteria.creationDate  AND criteria.contentType search all contents of type "Video" created in a specific range. The attributes with [0..*] cardinality use OR clause. For example criteria.contentType = ["VIDEO","IMAGE"] search all VIEDO or IMAGE contents""")
class MContentSearchCriteria extends Serializable {

	/**
	 * It is used to perform a free-text search. Looks for the provided text in title,
	 * description, tag names, metadata values and documents text content.
	 */
	//#SWG#@ApiModelProperty(value = """It is used to perform a free-text search. Looks for the provided text in title, description, tag names, metadata values and documents text content.""")
	@BeanProperty 
	var lemma: MLemmaCriteria =_
	def withlemma(p:MLemmaCriteria):this.type ={ 	this.lemma = p; 	this }

	/**
	 * It is used to filter content having title or description defined in one of the
	 * given langs. lang code (ISO639-1).
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content having title or description defined in one of the given langs. lang code (ISO639-1).""")
	@BeanProperty 
	var lang: List[String] =_
	def withlang(p:List[String]):this.type ={ 	this.lang = p; 	this }

	/**
	 * It is used to filter content with a creation date in the defined range
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content with a creation date in the defined range""")
	@BeanProperty 
	var creationDate: MDateRange =_
	def withcreationDate(p:MDateRange):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * It is used to filter content with a last modified date in the defined range
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content with a last modified date in the defined range""")
	@BeanProperty 
	var lastUpdate: MDateRange =_
	def withlastUpdate(p:MDateRange):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * It is used to filter content by content type
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by content type""")
	@BeanProperty 
	var contentType: List[MEContentSearchType] =_
	def withcontentType(p:List[MEContentSearchType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * It is used to filter content linked to specific categories
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content linked to specific categories""")
	@BeanProperty 
	var linkedCategories: MLinkedCategorySearchCriteria =_
	def withlinkedCategories(p:MLinkedCategorySearchCriteria):this.type ={ 	this.linkedCategories = p; 	this }

	/**
	 * It is used to filter content by author name
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by author name""")
	@BeanProperty 
	var author: MTextCriteria =_
	def withauthor(p:MTextCriteria):this.type ={ 	this.author = p; 	this }

	/**
	 * It is used to filter content by title
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by title""")
	@BeanProperty 
	var title: MTextCriteria =_
	def withtitle(p:MTextCriteria):this.type ={ 	this.title = p; 	this }

	/**
	 * It is used to filter content by metadata
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by metadata""")
	@BeanProperty 
	var imetadata: MIMetadataContentSearchCriteria =_
	def withimetadata(p:MIMetadataContentSearchCriteria):this.type ={ 	this.imetadata = p; 	this }

	/**
	 * It is used to filter content by tags
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by tags""")
	@BeanProperty 
	var itag: MITagContentSearchCriteria =_
	def withitag(p:MITagContentSearchCriteria):this.type ={ 	this.itag = p; 	this }

	/**
	 * It is used to filter content by owner
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by owner""")
	@BeanProperty 
	var owner: MOwnerSearchCriteria =_
	def withowner(p:MOwnerSearchCriteria):this.type ={ 	this.owner = p; 	this }

	/**
	 * It is used to filter content by id
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by id""")
	@BeanProperty 
	var ids: List[String] =_
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * It is used to filter content by source file extensions like jpg,pdf,doc...
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by source file extensions like jpg,pdf,doc...""")
	@BeanProperty 
	var sourceExtensions: List[String] =_
	def withsourceExtensions(p:List[String]):this.type ={ 	this.sourceExtensions = p; 	this }

	/**
	 * Deprecated. Use 'linkedProducts.aliases'
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated. Use 'linkedProducts.aliases'""")
	@BeanProperty 
	@Deprecated
	var productAliases: List[String] =_
	@Deprecated
	def withproductAliases(p:List[String]):this.type ={ 	this.productAliases = p; 	this }

	/**
	 * It is used to filter content by linked product properties. Only available if
	 * PIM module is active.
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by linked product properties. Only available if PIM module is active.""")
	@BeanProperty 
	var linkedProducts: MContentProductCriteria =_
	def withlinkedProducts(p:MContentProductCriteria):this.type ={ 	this.linkedProducts = p; 	this }

	/**
	 * If true, it returns only the contents marked as starred by the user
	 */
	//#SWG#@ApiModelProperty(value = """If true, it returns only the contents marked as starred by the user""")
	@BeanProperty 
	var onlyStarredContent: Boolean = false
	def withonlyStarredContent(p:Boolean):this.type ={ 	this.onlyStarredContent = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//Option(aliases).forall(_.length<=1000)

		true
	}

}
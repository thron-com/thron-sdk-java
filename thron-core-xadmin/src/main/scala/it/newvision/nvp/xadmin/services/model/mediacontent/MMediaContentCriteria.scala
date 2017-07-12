package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentStatus
import it.newvision.nvp.xadmin.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the MediaContent search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MMediaContentCriteria") 
@XmlType(name="MMediaContentCriteria")
//#SWG#@ApiModel(description = """main class used to define the MediaContent search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MMediaContentCriteria extends Serializable {

	/**
	 * used to get all contents having content Status in the given list. 
	 */
	//#SWG#@ApiModelProperty(value = """used to get all contents having content Status in the given list. """)
	@BeanProperty 
	var status: List[MEContentStatus] = new ArrayList[MEContentStatus]
	def withstatus(p:List[MEContentStatus]):this.type ={ 	this.status = p; 	this }

	/**
	 * used to get all contents with contentType in the given list. 
	 */
	//#SWG#@ApiModelProperty(value = """used to get all contents with contentType in the given list. """)
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * The attribute shows from which solution the content has been created. 
	 */
	//#SWG#@ApiModelProperty(value = """The attribute shows from which solution the content has been created. """)
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):this.type ={ 	this.solution = p; 	this }

	/**
	 * The attribute shows from which solution the content is available. This
	 * information is used to filter the contents by solution.
	 */
	//#SWG#@ApiModelProperty(value = """The attribute shows from which solution the content is available. This information is used to filter the contents by solution.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	/**
	 * Return all mediaContents having the xpublishedId in the list.
	 */
	//#SWG#@ApiModelProperty(value = """Return all mediaContents having the xpublishedId in the list.""")
	@BeanProperty 
	var xpublishedId: List[String] = new ArrayList[String]
	def withxpublishedId(p:List[String]):this.type ={ 	this.xpublishedId = p; 	this }

	/**
	 * Return all mediaContents having the xcontentId in the list.
	 */
	//#SWG#@ApiModelProperty(value = """Return all mediaContents having the xcontentId in the list.""")
	@BeanProperty 
	var xcontentId: List[String] = new ArrayList[String]
	def withxcontentId(p:List[String]):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * Return all mediaContents having the mediaContentId in the list.
	 */
	//#SWG#@ApiModelProperty(value = """Return all mediaContents having the mediaContentId in the list.""")
	@BeanProperty 
	var mediaContentId: List[String] = new ArrayList[String]
	def withmediaContentId(p:List[String]):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * creation date range [fromDate - toDate]
	 */
	//#SWG#@ApiModelProperty(value = """creation date range [fromDate - toDate]""")
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * creation date range [fromDate - toDate]
	 */
	//#SWG#@ApiModelProperty(value = """creation date range [fromDate - toDate]""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

	/**
	 * if TRUE: returns only User Generated Contents
	 * if FALSE: returns all Contents not User Generated
	 * if null: all contents
	 */
	//#SWG#@ApiModelProperty(value = """if TRUE: returns only User Generated Contents
	//#SWGNL#if FALSE: returns all Contents not User Generated
	//#SWGNL#if null: all contents""")
	@BeanProperty 
	var ugc: Boolean =_
	def withugc(p:Boolean):this.type ={ 	this.ugc = p; 	this }

	/**
	 * Used to filter the content having source files of a specific mimeType.
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the content having source files of a specific mimeType.""")
	@BeanProperty 
	@Deprecated
	var mimeType: String =_
	@Deprecated
	def withmimeType(p:String):this.type ={ 	this.mimeType = p; 	this }

	/**
	 * Used to filter the media contents created by specific userId.
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the media contents created by specific userId.""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

}
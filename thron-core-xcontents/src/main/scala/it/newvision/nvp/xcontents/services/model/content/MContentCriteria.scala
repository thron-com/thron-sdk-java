package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MAclCriteria
import it.newvision.nvp.xcontents.services.model.msg.MEContentReadValue
import it.newvision.nvp.xcontents.model.MEContentType
import it.newvision.nvp.xcontents.model.MMetadata
import it.newvision.nvp.xcontents.model.MEContentPropertiesCriteria
import it.newvision.nvp.xcontents.model.MEWeeboProviderStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the content search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * For example ContentCriteria.name = "auto" AND ContentCriteria.locale="IT"
 * search all contents with name like "auto" for the IT locale.
 * The attributes with [0..*] cardinality use OR clause.
 * For example ContentCriteria.contentType = ["VIDEO","IMAGE"] search all contents
 * with contentType equals VIDEO OR IMAGE.
 */
@XmlRootElement(name="MContentCriteria") 
@XmlType(name="MContentCriteria")
//#SWG#@ApiModel(description = """main class used to define the content search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#For example ContentCriteria.name = "auto" AND ContentCriteria.locale="IT" search all contents with name like "auto" for the IT locale.
//#SWGNL#The attributes with [0..*] cardinality use OR clause.
//#SWGNL#For example ContentCriteria.contentType = ["VIDEO","IMAGE"] search all contents with contentType equals VIDEO OR IMAGE.""")
class MContentCriteria extends Serializable {

	/**
	 * used to find only the contents shared with specific policies
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the contents shared with specific policies""")
	@BeanProperty 
	var acl: MAclCriteria =_
	def withacl(p:MAclCriteria):this.type ={ 	this.acl = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):this.type ={ 	this.availableInSolutions = p; 	this }

	/**
	 * Filter all contents in the contentsIds list.
	 * list of content ids or contents prettyIds
	 */
	//#SWG#@ApiModelProperty(value = """Filter all contents in the contentsIds list.
	//#SWGNL#list of content ids or contents prettyIds""")
	@BeanProperty 
	var contentIds: List[String] = new ArrayList[String]
	def withcontentIds(p:List[String]):this.type ={ 	this.contentIds = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var contentReadValue: List[MEContentReadValue] = new ArrayList[MEContentReadValue]
	@Deprecated
	def withcontentReadValue(p:List[MEContentReadValue]):this.type ={ 	this.contentReadValue = p; 	this }

	/**
	 * Filter all contents having contentType in the specified list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all contents having contentType in the specified list.""")
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * used to find only the contents created after the fromDate value.
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * 
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * 	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the contents created after the fromDate value.
	//#SWGNL#Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * Search contents with specific intelligence imetadata key and value (only for
	 * metadata definition of type KEY).
	 * The list of elements use the OR operator.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>max length 5</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Search contents with specific intelligence imetadata key and value (only for metadata definition of type KEY). 
	//#SWGNL#The list of elements use the OR operator.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length 5</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var imetadataKeyOp: MIMetadataKeyCriteriaOption =_
	def withimetadataKeyOp(p:MIMetadataKeyCriteriaOption):this.type ={ 	this.imetadataKeyOp = p; 	this }

	/**
	 * search contents with specific intelligence tags. The list of elements use the
	 * AND/OR operator.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>max length 5</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """search contents with specific intelligence tags. The list of elements use the AND/OR operator.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length 5</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var itagOp: MITagCriteriaOption =_
	def withitagOp(p:MITagCriteriaOption):this.type ={ 	this.itagOp = p; 	this }

	/**
	 * Deprecated.
	 * Use the linkedCategoryOp field
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.
	//#SWGNL#Use the linkedCategoryOp field""")
	@BeanProperty 
	@Deprecated
	var linkedCategories: List[String] = new ArrayList[String]
	@Deprecated
	def withlinkedCategories(p:List[String]):this.type ={ 	this.linkedCategories = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategoryOp: MLinkedCategorySearchOptions =_
	def withlinkedCategoryOp(p:MLinkedCategorySearchOptions):this.type ={ 	this.linkedCategoryOp = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""")
	@BeanProperty 
	@Deprecated
	var linkedCategoryTypes: List[String] = new ArrayList[String]
	@Deprecated
	def withlinkedCategoryTypes(p:List[String]):this.type ={ 	this.linkedCategoryTypes = p; 	this }

	/**
	 * used to filter the contents that links the given contentId. Commonly used to
	 * know where the content is linked
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the contents that links the given contentId. Commonly used to know where the content is linked""")
	@BeanProperty 
	var linkedContentId: String =_
	def withlinkedContentId(p:String):this.type ={ 	this.linkedContentId = p; 	this }

	/**
	 * Locale code (ISO639-1).
	 * Used to search the contents having title like "name" for one of the defined
	 * locales. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	 * Example:
	 * the user would like to find the contents with name "my house" for locale "EN".
	 * If the "name" is empty the service return all contents defined for the
	 * specified locale.
	 * The fields works in combination with MContentCriteria.name and MContentCriteria.
	 * textSearch.searchKey
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1).
	//#SWGNL#Used to search the contents having title like "name" for one of the defined locales. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	//#SWGNL#Example: 
	//#SWGNL#the user would like to find the contents with name "my house" for locale "EN". If the "name" is empty the service return all contents defined for the specified locale.
	//#SWGNL#The fields works in combination with MContentCriteria.name and MContentCriteria.textSearch.searchKey""")
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * search contents with specific custom metadata.
	 * 
	 * metadatas.name: exact match (case sensitive)
	 * metadatas.value: search text as Regex (case insensitive)
	 * <ul>
	 * 	<li>use ^<quoted text>$ to exactly match the quoted text in the field.
	 * (example: ^\Qmyvalue\E$).  <b>Optimized for key-value search</b>.</li>
	 * 	<li>use ^<text to search> to search the text at start of the string. (example:
	 * ^myvalue).  <b>Optimized for key-value search</b>.</li>
	 * 	<li>use \Q<text to search>\E for simple text search (quoted text) </li>
	 * 	<li>use regex to search inside the value field. (example: \d*$ match values
	 * with only digits).</li>
	 * </ul>
	 * 
	 * 
	 * metadatas.locale: search as text match (case sensitive)
	 * 
	 * <b>Queries with AND operators:</b>
	 * It's possible to search all contents matching the full list of metadata (AND
	 * operation) adding to the list an object with metadatas.name == #AND_OPERATOR#
	 * json example: {"name":"#AND_OPERATOR#"}
	 * xml example:
	 * <metadatas>
	 * <name>#AND_OPERATOR#</name>
	 * </metadatas>
	 * 
	 * This special metadata is used to drive the search engine,  specifying that all
	 * elements inside the ContentCriteria.metadatas collection should be searched
	 * using the AND instead of the default OR operator.
	 */
	//#SWG#@ApiModelProperty(value = """search contents with specific custom metadata.
	//#SWGNL#
	//#SWGNL#metadatas.name: exact match (case sensitive)
	//#SWGNL#metadatas.value: search text as Regex (case insensitive)
	//#SWGNL#<ul>
	//#SWGNL#	<li>use ^<quoted text>$ to exactly match the quoted text in the field. (example: ^\Qmyvalue\E$).  <b>Optimized for key-value search</b>.</li>
	//#SWGNL#	<li>use ^<text to search> to search the text at start of the string. (example: ^myvalue).  <b>Optimized for key-value search</b>.</li>
	//#SWGNL#	<li>use \Q<text to search>\E for simple text search (quoted text) </li>
	//#SWGNL#	<li>use regex to search inside the value field. (example: \d*$ match values with only digits).</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#metadatas.locale: search as text match (case sensitive)
	//#SWGNL#
	//#SWGNL#<b>Queries with AND operators:</b>
	//#SWGNL#It's possible to search all contents matching the full list of metadata (AND operation) adding to the list an object with metadatas.name == #AND_OPERATOR# 
	//#SWGNL#json example: {"name":"#AND_OPERATOR#"}
	//#SWGNL#xml example: 
	//#SWGNL#<metadatas>
	//#SWGNL#<name>#AND_OPERATOR#</name>
	//#SWGNL#</metadatas>
	//#SWGNL#
	//#SWGNL#This special metadata is used to drive the search engine,  specifying that all elements inside the ContentCriteria.metadatas collection should be searched using the AND instead of the default OR operator.""")
	@BeanProperty 
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * DEPRECATED. Use the textSearch field.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED. Use the textSearch field.""")
	@BeanProperty 
	@Deprecated
	var name: String =_
	@Deprecated
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Used to filter the contents published in some channels on MContent.webo.
	 * weeboChannels
	 * If true, return
	 * <ul>
	 * 	<li>Only the contentes published in some channels (MContent.weebo.
	 * weeboChannel[*].status == PUBLISHED if MContentCriteria.weeboChannels is empty)
	 *     </li>
	 * </ul>
	 * <ul>
	 * 	<li>Only the contents with published in the given channels (MContent.weebo.
	 * channel[x].status == PUBLISHED if MContentCriteria.weeboChannels is defined).
	 *   </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used to filter the contents published in some channels on MContent.webo.weeboChannels
	//#SWGNL#If true, return 
	//#SWGNL#<ul>
	//#SWGNL#	<li>Only the contentes published in some channels (MContent.weebo.weeboChannel[*].status == PUBLISHED if MContentCriteria.weeboChannels is empty)      </li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Only the contents with published in the given channels (MContent.weebo.channel[x].status == PUBLISHED if MContentCriteria.weeboChannels is defined).      </li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	@Deprecated
	var onlyPublishedInWeebo: Boolean =_
	@Deprecated
	def withonlyPublishedInWeebo(p:Boolean):this.type ={ 	this.onlyPublishedInWeebo = p; 	this }

	/**
	 * Filter contents having one of the specified properties
	 */
	//#SWG#@ApiModelProperty(value = """Filter contents having one of the specified properties""")
	@BeanProperty 
	var properties: List[MEContentPropertiesCriteria] = new ArrayList[MEContentPropertiesCriteria]
	def withproperties(p:List[MEContentPropertiesCriteria]):this.type ={ 	this.properties = p; 	this }

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
	 * Only the contents having one of listed tags
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Only the contents having one of listed tags""")
	@BeanProperty 
	@Deprecated
	var tags: List[String] = new ArrayList[String]
	@Deprecated
	def withtags(p:List[String]):this.type ={ 	this.tags = p; 	this }

	/**
	 * used as text search on Content metadata and details and works over the
	 * specified MContent fields:
	 * <ul>
	 * 	<li>name, description, excerpt (for a given MContentCriteria.locale)</li>
	 * 	<li>owner, userid, metadata and itags</li>
	 * </ul>
	 * 
	 * Example1:
	 * search the text "the red book" on locale "EN" in content fields name,
	 * description. The service return all contents with the text "the red book" in
	 * NAME or DESCRIPTION
	 * 
	 * criteria:{
	 * locale:"EN"
	 * textSearch:{searchKey:"the red book", searchOnFields:["NAME","DESCRIPTION"],
	 * searchKeyOption:"EXACT_MATCH"}
	 * }
	 * 
	 * return all contents matching text like "the Red book ...", "The red book ..."
	 * 
	 * Example2:
	 * search the text "red books table" on locale "EN" in content fields name,
	 * description. The service return all contents matching the keywords "red",
	 * "book" and "table" (in the exact order) in NAME or DESCRIPTION.
	 * 
	 * criteria:{
	 * locale:"EN"
	 * textSearch:{searchKey:"red book table", searchOnFields:["NAME","DESCRIPTION"],
	 * searchKeyOption:"BY_TOKEN"}
	 * }
	 * 
	 * return all contents matching text like "Red ...", "red ... book ... Table"
	 */
	//#SWG#@ApiModelProperty(value = """used as text search on Content metadata and details and works over the specified MContent fields:
	//#SWGNL#<ul>
	//#SWGNL#	<li>name, description, excerpt (for a given MContentCriteria.locale)</li>
	//#SWGNL#	<li>owner, userid, metadata and itags</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Example1:
	//#SWGNL#search the text "the red book" on locale "EN" in content fields name, description. The service return all contents with the text "the red book" in NAME or DESCRIPTION 
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#locale:"EN"
	//#SWGNL#textSearch:{searchKey:"the red book", searchOnFields:["NAME","DESCRIPTION"],
	//#SWGNL#searchKeyOption:"EXACT_MATCH"}
	//#SWGNL#}
	//#SWGNL#
	//#SWGNL#return all contents matching text like "the Red book ...", "The red book ..."
	//#SWGNL#
	//#SWGNL#Example2:
	//#SWGNL#search the text "red books table" on locale "EN" in content fields name, description. The service return all contents matching the keywords "red", "book" and "table" (in the exact order) in NAME or DESCRIPTION.
	//#SWGNL#
	//#SWGNL#criteria:{
	//#SWGNL#locale:"EN"
	//#SWGNL#textSearch:{searchKey:"red book table", searchOnFields:["NAME","DESCRIPTION"],
	//#SWGNL#searchKeyOption:"BY_TOKEN"}
	//#SWGNL#}
	//#SWGNL#
	//#SWGNL#return all contents matching text like "Red ...", "red ... book ... Table"""")
	@BeanProperty 
	var textSearch: MTextSearchOptions  = new MTextSearchOptions()
	def withtextSearch(p:MTextSearchOptions):this.type ={ 	this.textSearch = p; 	this }

	/**
	 * used to find only the contents created before the toDate value.
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * 
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * </ul>
	 * (human readable) 2014-06-05T09:48:09.000Z
	 */
	//#SWG#@ApiModelProperty(value = """used to find only the contents created before the toDate value.
	//#SWGNL#Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#</ul>
	//#SWGNL#(human readable) 2014-06-05T09:48:09.000Z""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var ugc: Boolean =_
	@Deprecated
	def withugc(p:Boolean):this.type ={ 	this.ugc = p; 	this }

	/**
	 * DEPRECATED.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.""")
	@BeanProperty 
	@Deprecated
	var userId: String =_
	@Deprecated
	def withuserId(p:String):this.type ={ 	this.userId = p; 	this }

	/**
	 * DEPRECATED.
	 * Used to filter the contents published in a given list of channels. The list of
	 * values can be represented as comma separated values (csv).
	 * Example:
	 * weeboChannel = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Used to filter the contents published in a given list of channels. The list of values can be represented as comma separated values (csv).
	//#SWGNL#Example: 
	//#SWGNL#weeboChannel = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@BeanProperty 
	@Deprecated
	var weeboChannel: String =_
	@Deprecated
	def withweeboChannel(p:String):this.type ={ 	this.weeboChannel = p; 	this }

	/**
	 * filter the contents based on the GLOBAL status (Content.weebo.status):
	 * PUBLISHED, INGESTION_INPROGRESS...
	 */
	//#SWG#@ApiModelProperty(value = """filter the contents based on the GLOBAL status (Content.weebo.status): PUBLISHED, INGESTION_INPROGRESS...""")
	@BeanProperty 
	var weeboStatus: MEWeeboProviderStatus =_
	def withweeboStatus(p:MEWeeboProviderStatus):this.type ={ 	this.weeboStatus = p; 	this }

	/**
	 * Used to search the content published in Weebo having
	 * id == Content.weebo.pContentId
	 */
	//#SWG#@ApiModelProperty(value = """Used to search the content published in Weebo having
	//#SWGNL#id == Content.weebo.pContentId""")
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):this.type ={ 	this.xpublisherId = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		properties = properties filterNot {_ == null}
		contentIds = contentIds filterNot {_.isEmpty}
		contentType = contentType filterNot {_ == null}
		availableInSolutions = availableInSolutions filterNot {_.isEmpty}
		tags = tags filterNot {_.isEmpty}
		linkedCategories = linkedCategories filterNot {_.isEmpty}
		linkedCategoryTypes = linkedCategoryTypes filterNot {_.isEmpty}
		contentReadValue = contentReadValue filterNot {_ == null}
		metadatas = metadatas filterNot {_ == null}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(acl).forall(_.isValid) &&
		Option(itagOp).forall(_.isValid()) &&
		Option(imetadataKeyOp).forall(_.isValid()) &&
		Option(linkedCategoryOp).forall(_.isValid()) &&
		Option(linkedCategoryOp).forall(_.linkedCategoryIds.nonEmpty && Option(linkedCategories).forall(_.isEmpty))
	}

}
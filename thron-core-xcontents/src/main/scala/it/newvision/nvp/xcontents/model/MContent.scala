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
 * the Content class is the main class that includes all information about a 4me
 * content. Any type of content (video / audio / image / playlist) is archived
 * through an instance of Content class . Content contains all the multilingual
 * metadata and specific parameters.
 */
@XmlRootElement(name="MContent") 
@XmlType(name="MContent")
//#SWG#@ApiModel(description = """the Content class is the main class that includes all information about a 4me content. Any type of content (video / audio / image / playlist) is archived through an instance of Content class . Content contains all the multilingual metadata and specific parameters.""")
class MContent extends Serializable {

	/**
	 * the content identifier 
	 */
	//#SWG#@ApiModelProperty(value = """the content identifier """ ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):MContent ={ 	this.id = p; 	this }

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
	def withprettyIds(p:List[MPrettyId]):MContent ={ 	this.prettyIds = p; 	this }

	/**
	 * DEPRECATED.
	 * Used client-side to store information about the status of the content. The
	 * attribute is not used in 4ME for business logic.
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Used client-side to store information about the status of the content. The attribute is not used in 4ME for business logic.
	//#SWGNL#Constraints: max length = 50""")
	@BeanProperty 
	@Deprecated
	var status: String =_
	@Deprecated
	def withstatus(p:String):MContent ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):MContent ={ 	this.contentType = p; 	this }

	/**
	 * The creation date of the content.
	 */
	//#SWG#@ApiModelProperty(value = """The creation date of the content.""" ,required = true)
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):MContent ={ 	this.creationDate = p; 	this }

	/**
	 * Can be the username of the owner or an external userId (only for UGC contents)
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """Can be the username of the owner or an external userId (only for UGC contents)
	//#SWGNL#Constraints: max length = 50""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MContent ={ 	this.userId = p; 	this }

	/**
	 * List the properties of a content
	 */
	//#SWG#@ApiModelProperty(value = """List the properties of a content""")
	@BeanProperty 
	var properties: List[MEContentProperties] = new ArrayList[MEContentProperties]
	def withproperties(p:List[MEContentProperties]):MContent ={ 	this.properties = p; 	this }

	/**
	 * The display name of the Author.
	 * Free text used to show the full name of the author.
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """The display name of the Author.
	//#SWGNL#Free text used to show the full name of the author.
	//#SWGNL#Constraints: max length = 50""")
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):MContent ={ 	this.owner = p; 	this }

	/**
	 * the date of the last updated/new comment. Only approved comments
	 */
	//#SWG#@ApiModelProperty(value = """the date of the last updated/new comment. Only approved comments""")
	@BeanProperty 
	var lastUpdatedComment: Date =_
	def withlastUpdatedComment(p:Date):MContent ={ 	this.lastUpdatedComment = p; 	this }

	/**
	 * DEPRECATED.
	 * The attribute shows from which solution the content has been created. 
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#The attribute shows from which solution the content has been created. """)
	@BeanProperty 
	@Deprecated
	var solution: String =_
	@Deprecated
	def withsolution(p:String):MContent ={ 	this.solution = p; 	this }

	/**
	 * DEPRECATED.
	 * The attribute shows the solutions that can  use the content. This information
	 * is used to filter the contents by solution. Each solution shows only the
	 * contents available for that solution.
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#The attribute shows the solutions that can  use the content. This information is used to filter the contents by solution. Each solution shows only the contents available for that solution.""")
	@BeanProperty 
	@Deprecated
	var availableInSolutions: List[String] = new ArrayList[String]
	@Deprecated
	def withavailableInSolutions(p:List[String]):MContent ={ 	this.availableInSolutions = p; 	this }

	/**
	 * used to flag the User Generated Contents.
	 */
	//#SWG#@ApiModelProperty(value = """used to flag the User Generated Contents.""")
	@BeanProperty 
	var contentUGC: Boolean =_
	def withcontentUGC(p:Boolean):MContent ={ 	this.contentUGC = p; 	this }

	/**
	 * save the view count information. The total number of views set for the content
	 */
	//#SWG#@ApiModelProperty(value = """save the view count information. The total number of views set for the content""")
	@BeanProperty 
	var viewCounter: MViewDetail =_
	def withviewCounter(p:MViewDetail):MContent ={ 	this.viewCounter = p; 	this }

	/**
	 * save the rating counter information. The total number of votes for the content
	 */
	//#SWG#@ApiModelProperty(value = """save the rating counter information. The total number of votes for the content""")
	@BeanProperty 
	var ratingCounter: Long =_
	def withratingCounter(p:Long):MContent ={ 	this.ratingCounter = p; 	this }

	/**
	 * The total number of comments  for the content
	 */
	//#SWG#@ApiModelProperty(value = """The total number of comments  for the content""")
	@BeanProperty 
	var commentsCounter: Long =_
	def withcommentsCounter(p:Long):MContent ={ 	this.commentsCounter = p; 	this }

	/**
	 * The total number of approved comments  for the content
	 */
	//#SWG#@ApiModelProperty(value = """The total number of approved comments  for the content""")
	@BeanProperty 
	var commentsApprovedCounter: Long =_
	def withcommentsApprovedCounter(p:Long):MContent ={ 	this.commentsApprovedCounter = p; 	this }

	/**
	 * the last metadata update date for the current content. Used to know content
	 * recently updated.
	 */
	//#SWG#@ApiModelProperty(value = """the last metadata update date for the current content. Used to know content recently updated.""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):MContent ={ 	this.lastUpdate = p; 	this }

	/**
	 * DEPRECATED.
	 * date time when the content becomes inactive
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#date time when the content becomes inactive""")
	@BeanProperty 
	var inactiveDate: Date =_
	def withinactiveDate(p:Date):MContent ={ 	this.inactiveDate = p; 	this }

	/**
	 * used for custom lexicographical order of contents. The field in used in
	 * JContent.findByProperties (MEContentOrderBy.sortingField_A/D) to sort the
	 * result set.
	 */
	//#SWG#@ApiModelProperty(value = """used for custom lexicographical order of contents. The field in used in JContent.findByProperties (MEContentOrderBy.sortingField_A/D) to sort the result set.""")
	@BeanProperty 
	var sortingField: String =_
	def withsortingField(p:String):MContent ={ 	this.sortingField = p; 	this }

	@BeanProperty 
	var version: Long =_
	def withversion(p:Long):MContent ={ 	this.version = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var weebo: MWeeboProvider =_
	  def withweebo(p:MWeeboProvider):MContent ={ 	this.weebo = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var tags: List[MTag] = new ArrayList[MTag]
	  def withtags(p:List[MTag]):MContent ={ 	this.tags = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var providers: List[MGenericProvider] = new ArrayList[MGenericProvider]
	  def withproviders(p:List[MGenericProvider]):MContent ={ 	this.providers = p; 	this }

	/**
	 * the list of custom player parameters
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """the list of custom player parameters""")
	var embedCodes: List[MPlayerEmbedCode] = new ArrayList[MPlayerEmbedCode]
	  def withembedCodes(p:List[MPlayerEmbedCode]):MContent ={ 	this.embedCodes = p; 	this }

	/**
	 * list of the multilocale data of the content
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """list of the multilocale data of the content""")
	var locales: List[MContent4Locale] = new ArrayList[MContent4Locale]
	  def withlocales(p:List[MContent4Locale]):MContent ={ 	this.locales = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var imetadata: List[MIMetadata] = new ArrayList[MIMetadata]
	  def withimetadata(p:List[MIMetadata]):MContent ={ 	this.imetadata = p; 	this }

	/**
	 * The linkedContents collection is used to store the connection between two
	 * contents. the linkedContents is particularly used to record:
	 * 1) the list of contents belongs to a playlist
	 * 2) the list of contents recommended by a user
	 * 3) the list of downloadable content specified by a user.
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """The linkedContents collection is used to store the connection between two contents. the linkedContents is particularly used to record:
	var linkedContents: List[MContent] = new ArrayList[MContent]
	  def withlinkedContents(p:List[MContent]):MContent ={ 	this.linkedContents = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var itags: List[MITag] = new ArrayList[MITag]
	  def withitags(p:List[MITag]):MContent ={ 	this.itags = p; 	this }

	/**
	 * The metadata's collection can be used to add custom information to any contents.
	 * The collection is used also to store some special information and for this
	 * reason the platform use some special metadata.name keywords:
	 * 1) _PLAYLISTTEMPLATE_  -> used with playlist contents to know the type of
	 * playlist (VIDEO/IMAGE/AUDIO..)
	 * 2) _CONTENTVIEWPREFERENCES_ -> used to store the visualisation preference of
	 * the content. In the admin console the user can decide to show or not the
	 * recommended, similar or downloadable contents (NONE,SIMILAR,RECOMMENDED are the
	 * possible values)
	 * 3) _<SOLUTION><KEY>_ -> naming convention for custom metadata used by 4me
	 * Solutions/Apps to store special custom metadata.
	 * 
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """The metadata's collection can be used to add custom information to any contents. The collection is used also to store some special information and for this reason the platform use some special metadata.name keywords:
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	  def withmetadatas(p:List[MMetadata]):MContent ={ 	this.metadatas = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//Check if required fields of an object

		Option(status).forall(_.length<=50) && 
		Option(userId).forall(_.length<=50) && 
		Option(owner).forall(_.length<=50) && 
		Option(contentType).isDefined &&
		Option(solution).isDefined
	}

	/**
	 * @param linkType : MELinkType
	 * @param onlyLinkable : Boolean
	 * @return MContent
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterLikedContents(linkType: MELinkType, 
			onlyLinkable: Boolean):List[MContent] ={
		import scala.collection.JavaConversions._
		this.linkedContents.filter(lc =>
			{if(Option(linkType).isDefined) lc.metadatas.exists(mm => mm.name == "_LINKTYPE_" && mm.value == linkType.toString) else true }  &&
		    {if(Option(onlyLinkable).exists(_.booleanValue())) lc.properties.forall(_ != MEContentProperties.UNLINKABLE) else true}
		)
	}

}
package com.thron.intelligence.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MExternalIdDetail
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.model.MSourceIdentifier

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * TagDefinition are "labels" used to answer questions defined in the
 * classification. For example, the question: what is it about this content? The
 * answer (tags) could be: politics, religion, money, computer science...
 * TagDefinition are "subclasses "of a classification and can be organized in a
 * tree structure.
 * 
 * Constraints:
 * <ul>
 * 	<li>may belongs to a single classification  </li>
 * 	<li>it's not possible create tree of uncategorized tagdefinition (categorized
 * = false)</li>
 * 	<li>It's not possible to merge a tagdefinition with linked
 * metadatadefinition</li>
 * </ul>
 */
@XmlRootElement(name="MITagDefinition") 
@XmlType(name="MITagDefinition")
//#SWG#@ApiModel(description = """TagDefinition are "labels" used to answer questions defined in the classification. For example, the question: what is it about this content? The answer (tags) could be: politics, religion, money, computer science...
//#SWGNL#TagDefinition are "subclasses "of a classification and can be organized in a tree structure.
//#SWGNL#
//#SWGNL#Constraints:
//#SWGNL#<ul>
//#SWGNL#	<li>may belongs to a single classification  </li>
//#SWGNL#	<li>it's not possible create tree of uncategorized tagdefinition (categorized = false)</li>
//#SWGNL#	<li>It's not possible to merge a tagdefinition with linked metadatadefinition</li>
//#SWGNL#</ul>""")
class MITagDefinition extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * The identifier (Tag.id) of the parent Tag. It's used to create a Tag hierarchy
	 */
	//#SWG#@ApiModelProperty(value = """The identifier (Tag.id) of the parent Tag. It's used to create a Tag hierarchy""")
	@BeanProperty 
	var parentId: String =_
	def withparentId(p:String):this.type ={ 	this.parentId = p; 	this }

	/**
	 * ordered list of ancestors ITagDefinition Ids. It's used to quickly create the
	 * TagDefinition tree structure. The list of tagdefinition follow the
	 * Example:
	 * Given a tagdefinition tree of 4 levels
	 * TagDefinition1-> TagDefinition2 -> TagDefinition3-> TagDefinition4
	 * 
	 * The ancestors ids for each category is:
	 * TagDefinition1.ancestorsIds = []
	 * TagDefinition2.ancestorsIds = [TagDefinition1]
	 * TagDefinition3.ancestorsIds = [TagDefinition1,TagDefinition2]
	 * TagDefinition4.ancestorsIds = [TagDefinition1,TagDefinition2, TagDefinition3]
	 */
	//#SWG#@ApiModelProperty(value = """ordered list of ancestors ITagDefinition Ids. It's used to quickly create the TagDefinition tree structure. The list of tagdefinition follow the
	//#SWGNL#Example:
	//#SWGNL#Given a tagdefinition tree of 4 levels
	//#SWGNL#TagDefinition1-> TagDefinition2 -> TagDefinition3-> TagDefinition4
	//#SWGNL#
	//#SWGNL#The ancestors ids for each category is:
	//#SWGNL#TagDefinition1.ancestorsIds = []
	//#SWGNL#TagDefinition2.ancestorsIds = [TagDefinition1]
	//#SWGNL#TagDefinition3.ancestorsIds = [TagDefinition1,TagDefinition2]
	//#SWGNL#TagDefinition4.ancestorsIds = [TagDefinition1,TagDefinition2, TagDefinition3]""")
	@BeanProperty 
	var ancestorIds: List[String] = new ArrayList[String]
	def withancestorIds(p:List[String]):this.type ={ 	this.ancestorIds = p; 	this }

	/**
	 * the list of externalIds
	 */
	//#SWG#@ApiModelProperty(value = """the list of externalIds""")
	@BeanProperty 
	var externalIds: List[MExternalIdDetail] = new ArrayList[MExternalIdDetail]
	def withexternalIds(p:List[MExternalIdDetail]):this.type ={ 	this.externalIds = p; 	this }

	/**
	 * prettyId for the itagDefinition
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>max length = 150</li>
	 * 	<li>only lower case chars and digits</li>
	 * </ul>
	 * <ul>
	 * 	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the itagDefinition
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 150</li>
	//#SWGNL#	<li>only lower case chars and digits</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	/**
	 * list of all combined/merged ITagDefinition ids.
	 */
	//#SWG#@ApiModelProperty(value = """list of all combined/merged ITagDefinition ids.""")
	@BeanProperty 
	var joinedIds: List[MJoinedId] = new ArrayList[MJoinedId]
	def withjoinedIds(p:List[MJoinedId]):this.type ={ 	this.joinedIds = p; 	this }

	/**
	 * label and description values for the itagDefinition in multilocale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values for the itagDefinition in multilocale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	/**
	 * userId of the owner or engineId
	 */
	//#SWG#@ApiModelProperty(value = """userId of the owner or engineId""")
	@BeanProperty 
	var createdBy: MSourceIdentifier =_
	def withcreatedBy(p:MSourceIdentifier):this.type ={ 	this.createdBy = p; 	this }

	/**
	 * Optional. The creation date of the Tag
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the Tag""")
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * Last time this Tag was modified by anyone.
	 */
	//#SWG#@ApiModelProperty(value = """Last time this Tag was modified by anyone.""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var approved: Boolean =_
	@Deprecated
	def withapproved(p:Boolean):this.type ={ 	this.approved = p; 	this }

	/**
	 * Used to split the tagdefinition in two macro categories (categorized and
	 * uncategorized tags). Usually the semantic engines creates new tagDefinition
	 * with the categorized attribute to false.
	 */
	//#SWG#@ApiModelProperty(value = """Used to split the tagdefinition in two macro categories (categorized and uncategorized tags). Usually the semantic engines creates new tagDefinition with the categorized attribute to false.""" ,required = true)
	@BeanProperty 
	var categorized: Boolean  = true
	def withcategorized(p:Boolean):this.type ={ 	this.categorized = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
		    StringUtils.isNotBlank(id) &&
		      StringUtils.isNotBlank(prettyId) 
	}

	/**
	 * @return List[String]
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def allIds():List[String] ={
		import scala.collection.JavaConversions._
		(this.joinedIds.map(_.id) ++ this.externalIds.map(_.getExtId()) ++ scala.List(this.prettyId, this.id)).filter(_ != null)
	
	}

}
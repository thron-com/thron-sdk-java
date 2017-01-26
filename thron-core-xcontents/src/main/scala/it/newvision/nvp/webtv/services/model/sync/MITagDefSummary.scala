package it.newvision.nvp.webtv.services.model.sync
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
 * TagDefinition are "labels" used to answer questions defined in the
 * classification. For example, the question: what is it about this content? The
 * answer (tags) could be: politics, religion, money, computer science...
 * TagDefinition are "subclasses "of a classification and can be organized in a
 * tree structure.
 * 
 * Constraints:
 * <ul>
 * 	<li>may belongs to a single classification </li>
 * 	<li>it's not possible create tree of uncategorized tagdefinition (categorized
 * = false)</li>
 * 	<li>It's not possible to merge a tagdefinition with linked
 * metadatadefinition</li>
 * </ul>
 */
@XmlRootElement(name="MITagDefSummary") 
@XmlType(name="MITagDefSummary")
//#SWG#@ApiModel(description = """""")
class MITagDefSummary extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * The identifier (TagDefinition.id) of the parent TagDefinition. 
	 */
	//#SWG#@ApiModelProperty(value = """The identifier (TagDefinition.id) of the parent TagDefinition. """)
	@BeanProperty 
	var parentId: String =_
	def withparentId(p:String):this.type ={ 	this.parentId = p; 	this }

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
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var externalIds: List[String] = new ArrayList[String]
	def withexternalIds(p:List[String]):this.type ={ 	this.externalIds = p; 	this }

	/**
	 * label and description values in multilocale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values in multilocale""")
	@BeanProperty 
	var names: List[MLoc] = new ArrayList[MLoc]
	def withnames(p:List[MLoc]):this.type ={ 	this.names = p; 	this }

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
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	/**
	 * Optional. The creation date of the TagDefinition
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the TagDefinition""")
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * Last time this TagDefinition was modified by anyone.
	 */
	//#SWG#@ApiModelProperty(value = """Last time this TagDefinition was modified by anyone.""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

	/**
	 * Used to split the TagDefinition in two macro categories (categorized and
	 * uncategorized tags). Usually the semantic engines creates new TagDefinition
	 * with the categorized attribute to false.
	 */
	//#SWG#@ApiModelProperty(value = """Used to split the TagDefinition in two macro categories (categorized and uncategorized tags). Usually the semantic engines creates new TagDefinition with the categorized attribute to false.""" ,required = true)
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

}
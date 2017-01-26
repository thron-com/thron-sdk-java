package it.newvision.nvp.webtv.services.model.archive
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType
import it.newvision.nvp.xcontents.services.model.content.MITagCriteriaOption
import it.newvision.nvp.xcontents.services.model.content.MIMetadataKeyCriteriaOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MArchiveCriteria") 
@XmlType(name="MArchiveCriteria")
//#SWG#@ApiModel(description = """""")
class MArchiveCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategoryOp: MArchiveCategorySearchOption =_
	def withlinkedCategoryOp(p:MArchiveCategorySearchOption):this.type ={ 	this.linkedCategoryOp = p; 	this }

	/**
	 * Filter all contents having contentType in the specified list.
	 */
	//#SWG#@ApiModelProperty(value = """Filter all contents having contentType in the specified list.""")
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

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
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>max number of elements is 1000</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of elements is 1000</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var xcontentIds: List[String] = new ArrayList[String]
	def withxcontentIds(p:List[String]):this.type ={ 	this.xcontentIds = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		contentType = contentType filterNot {_ == null}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
	
		Option(xcontentIds).forall(x=> x.size()<=1000) &&
		Option(linkedCategoryOp).forall(_.isValid()) &&
		Option(linkedCategoryOp).forall(_.linkedCategoryIds.nonEmpty)
	}

}
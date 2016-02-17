package it.newvision.nvp.xcontents.services.model.content
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
 * Search Option used on MContentCriteria
 */
@XmlRootElement(name="MLinkedCategorySearchOptions") 
@XmlType(name="MLinkedCategorySearchOptions")
//#SWG#@ApiModel(description = """Search Option used on MContentCriteria""")
class MLinkedCategorySearchOptions extends Serializable {

	/**
	 * used to filter the contents linked to the given categories. Commonly used to
	 * have the list of Contents linked to a category or NOT linked to a category.
	 * The list of linkedCategories is partitioned in two set:
	 * <ul>
	 * 	<li>cids = the list of categoriesId</li>
	 * 	<li>ncids = the list of !_<categoriesId> (be careful slow performance)</li>
	 * </ul>
	 * The contents are filtered matching the condition:
	 * <ul>
	 * 	<li>(contents IN cids) AND (contents NOT IN ncids )</li>
	 * </ul>
	 * 
	 * Examples using json format:
	 * 
	 * <ul>
	 * 	<li>filter contents which are linked to one of the categories a,b</li>
	 * </ul>
	 * 	"linkedCategories": ["a","b"]
	 * <ul>
	 * 	<li>filter contents which are NOT linked to any of the categories a,b</li>
	 * </ul>
	 * 	"linkedCategories": ["!_a","!_b"]
	 * <ul>
	 * 	<li>filter contents which are linked to one of the categories a,b AND NOT
	 * linked to any of the categories c,d</li>
	 * </ul>
	 * 	"linkedCategories": ["a","b","!_c","!_d"]
	 */
	//#SWG#@ApiModelProperty(value = """used to filter the contents linked to the given categories. Commonly used to have the list of Contents linked to a category or NOT linked to a category.
	//#SWGNL#The list of linkedCategories is partitioned in two set:
	//#SWGNL#<ul>
	//#SWGNL#	<li>cids = the list of categoriesId</li>
	//#SWGNL#	<li>ncids = the list of !_<categoriesId> (be careful slow performance)</li>
	//#SWGNL#</ul>
	//#SWGNL#The contents are filtered matching the condition:
	//#SWGNL#<ul>
	//#SWGNL#	<li>(contents IN cids) AND (contents NOT IN ncids )</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Examples using json format:
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter contents which are linked to one of the categories a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedCategories": ["a","b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter contents which are NOT linked to any of the categories a,b</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedCategories": ["!_a","!_b"]
	//#SWGNL#<ul>
	//#SWGNL#	<li>filter contents which are linked to one of the categories a,b AND NOT linked to any of the categories c,d</li>
	//#SWGNL#</ul>
	//#SWGNL#	"linkedCategories": ["a","b","!_c","!_d"]""")
	@BeanProperty 
	var linkedCategoryIds: List[String] = new ArrayList[String]
	def withlinkedCategoryIds(p:List[String]):this.type ={ 	this.linkedCategoryIds = p; 	this }

	/**
	 * For all linkedCategoryIds search in subfolder.
	 */
	//#SWG#@ApiModelProperty(value = """For all linkedCategoryIds search in subfolder.""" ,required = true)
	@BeanProperty 
	var cascade: Boolean  = false
	def withcascade(p:Boolean):this.type ={ 	this.cascade = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(linkedCategoryIds).forall(_.size()<=50)
	}

}
package it.newvision.nvp.xcontents.services.model.category
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
 * Class used to define witch details of Categories are required in the response
 * like:
 * <ul>
 * 	<li>the numberOfContents</li>
 * 	<li>the numberOfContents unread</li>
 * 	<li>the numberOfContents unread in the subcategories</li>
 * 	<li>the number of subcategories</li>
 * </ul>
 */
@XmlRootElement(name="MCategoryFieldsOption") 
@XmlType(name="MCategoryFieldsOption")
//#SWG#@ApiModel(description = """Class used to define witch details of Categories are required in the response like:
//#SWGNL#<ul>
//#SWGNL#	<li>the numberOfContents</li>
//#SWGNL#	<li>the numberOfContents unread</li>
//#SWGNL#	<li>the numberOfContents unread in the subcategories</li>
//#SWGNL#	<li>the number of subcategories</li>
//#SWGNL#</ul>""")
class MCategoryFieldsOption extends Serializable {

	/**
	 * Default = true
	 */
	//#SWG#@ApiModelProperty(value = """Default = true""")
	@BeanProperty 
	var returnNumberOfContents: Boolean  = true
	def withreturnNumberOfContents(p:Boolean):this.type ={ 	this.returnNumberOfContents = p; 	this }

	/**
	 * Default = true
	 */
	//#SWG#@ApiModelProperty(value = """Default = true""")
	@BeanProperty 
	@Deprecated
	var returnNumberOfUnreadContents: Boolean  = true
	@Deprecated
	def withreturnNumberOfUnreadContents(p:Boolean):this.type ={ 	this.returnNumberOfUnreadContents = p; 	this }

	/**
	 * Default = true
	 */
	//#SWG#@ApiModelProperty(value = """Default = true""")
	@BeanProperty 
	@Deprecated
	var returnNumberOfUnreadContentsInSubCategories: Boolean  = true
	@Deprecated
	def withreturnNumberOfUnreadContentsInSubCategories(p:Boolean):this.type ={ 	this.returnNumberOfUnreadContentsInSubCategories = p; 	this }

	/**
	 * Default = true
	 */
	//#SWG#@ApiModelProperty(value = """Default = true""")
	@BeanProperty 
	var returnNumberOfSubCategories: Boolean  = true
	def withreturnNumberOfSubCategories(p:Boolean):this.type ={ 	this.returnNumberOfSubCategories = p; 	this }

	/**
	 * @return MCategoryFieldsOption
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def returnNone():MCategoryFieldsOption ={
		this.withreturnNumberOfContents(false)
		.withreturnNumberOfUnreadContents(false)
		.withreturnNumberOfUnreadContentsInSubCategories(false)
		.withreturnNumberOfSubCategories(false)
	}

}
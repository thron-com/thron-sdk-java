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
 * Class used to define witch details of Contents are required in the response
 * like:
 * <ul>
 * 	<li>the list of linkedCategories</li>
 * 	<li>the list of embedCodes</li>
 * 	<li>the content thumbnail</li>
 * 	<li>the list of itags (from intelligence)</li>
 * 	<li>the list of custom metadata (from intelligence)</li>
 * </ul>
 */
@XmlRootElement(name="MContentFieldsOption") 
@XmlType(name="MContentFieldsOption")
//#SWG#@ApiModel(description = """Class used to define witch details of Contents are required in the response like:
//#SWGNL#<ul>
//#SWGNL#	<li>the list of linkedCategories</li>
//#SWGNL#	<li>the list of embedCodes</li>
//#SWGNL#	<li>the content thumbnail</li>
//#SWGNL#	<li>the list of itags (from intelligence)</li>
//#SWGNL#	<li>the list of custom metadata (from intelligence)</li>
//#SWGNL#</ul>""")
class MContentFieldsOption extends Serializable {

	/**
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Default=false""")
	@BeanProperty 
	var returnLinkedContents: Boolean  = false
	def withreturnLinkedContents(p:Boolean):this.type ={ 	this.returnLinkedContents = p; 	this }

	/**
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Default=false""")
	@BeanProperty 
	var returnLinkedCategories: Boolean  = false
	def withreturnLinkedCategories(p:Boolean):this.type ={ 	this.returnLinkedCategories = p; 	this }

	/**
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Default=false""")
	@BeanProperty 
	var returnEmbedCodes: Boolean  = false
	def withreturnEmbedCodes(p:Boolean):this.type ={ 	this.returnEmbedCodes = p; 	this }

	/**
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Default=false""")
	@BeanProperty 
	var returnThumbnailUrl: Boolean  = false
	def withreturnThumbnailUrl(p:Boolean):this.type ={ 	this.returnThumbnailUrl = p; 	this }

	/**
	 * return the list of itags (intelligence tags)
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """return the list of itags (intelligence tags)
	//#SWGNL#Default=false""")
	@BeanProperty 
	var returnItags: Boolean  = false
	def withreturnItags(p:Boolean):this.type ={ 	this.returnItags = p; 	this }

	/**
	 * Return the list of custom metadata from intelligence
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """Return the list of custom metadata from intelligence
	//#SWGNL#Default=false""")
	@BeanProperty 
	var returnImetadata: Boolean  = false
	def withreturnImetadata(p:Boolean):this.type ={ 	this.returnImetadata = p; 	this }

	/**
	 * Whether or not result itags will ignore any combining.
	 * Default=false
	 * <b>
	 * </b><b>Example 1:</b>
	 * itag T1 is combined into itag T2.
	 * Entity E1 is tagged T1.
	 * If <i>ignoreITagCombining</i> is true, E1 itags will include T1; else E1 itags
	 * will include T2.
	 * 
	 * <b>
	 * </b><b>Example 2:</b>
	 * itag T1 is combined into itag T2.
	 * Entity E1 is tagged both T1 and T2.
	 * If <i>ignoreITagCombining</i> is true, E1 itags will include both T1 and T2;
	 * else E1 itags will include T2 only.
	 */
	//#SWG#@ApiModelProperty(value = """Whether or not result itags will ignore any combining.
	//#SWGNL#Default=false
	//#SWGNL#<b>
	//#SWGNL#</b><b>Example 1:</b>
	//#SWGNL#itag T1 is combined into itag T2.
	//#SWGNL#Entity E1 is tagged T1.
	//#SWGNL#If <i>ignoreITagCombining</i> is true, E1 itags will include T1; else E1 itags will include T2.
	//#SWGNL#
	//#SWGNL#<b>
	//#SWGNL#</b><b>Example 2:</b>
	//#SWGNL#itag T1 is combined into itag T2.
	//#SWGNL#Entity E1 is tagged both T1 and T2.
	//#SWGNL#If <i>ignoreITagCombining</i> is true, E1 itags will include both T1 and T2; else E1 itags will include T2 only.""")
	@BeanProperty 
	var ignoreITagCombining: Boolean  = false
	def withignoreITagCombining(p:Boolean):this.type ={ 	this.ignoreITagCombining = p; 	this }

	/**
	 * return the totalResults value on response.
	 * if false, the response should be faster.
	 */
	//#SWG#@ApiModelProperty(value = """return the totalResults value on response. 
	//#SWGNL#if false, the response should be faster.""" ,required = true)
	@BeanProperty 
	var returnTotalResults: Boolean  = true
	def withreturnTotalResults(p:Boolean):this.type ={ 	this.returnTotalResults = p; 	this }

}
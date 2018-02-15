package it.newvision.nvp.identity.services.model.vusers
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
 * Class used to define witch details of VUser are required in the response like:
 * <ul>
 * 	<li>the list of ownedAcl</li>
 * 	<li>the list of derivedRolesAndCapabilities</li>
 * </ul>
 */
@XmlRootElement(name="MVUserFieldsOption") 
@XmlType(name="MVUserFieldsOption")
//#SWG#@ApiModel(description = """Class used to define witch details of VUser are required in the response like:
//#SWGNL#<ul>
//#SWGNL#	<li>the list of ownedAcl</li>
//#SWGNL#	<li>the list of derivedRolesAndCapabilities</li>
//#SWGNL#</ul>""")
class MVUserFieldsOption extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnOwnAcl: Boolean  = false
	def withreturnOwnAcl(p:Boolean):this.type ={ 	this.returnOwnAcl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnItags: Boolean  = false
	def withreturnItags(p:Boolean):this.type ={ 	this.returnItags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnImetadata: Boolean  = false
	def withreturnImetadata(p:Boolean):this.type ={ 	this.returnImetadata = p; 	this }

	/**
	 * Whether or not result itags will ignore any combining.
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
	 * if true, totalResults will be calculated and included in the response; if false,
	 * totalResults will not be calculated and the service performs better.
	 */
	//#SWG#@ApiModelProperty(value = """if true, totalResults will be calculated and included in the response; if false, totalResults will not be calculated and the service performs better.""" ,required = true)
	@BeanProperty 
	var returnTotalResults: Boolean  = true
	def withreturnTotalResults(p:Boolean):this.type ={ 	this.returnTotalResults = p; 	this }

}
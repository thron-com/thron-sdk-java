package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MEITagOperation

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This class is used to filter contents by itags.
 * Search contents with specific intelligence tags. The list of elements use the
 * AND/OR operator.
 * 
 * 
 * 
 * Constraints:
 * <ul>
 * 	<li>max length 5</li>
 * </ul>
 */
@XmlRootElement(name="MITagCriteriaOption") 
@XmlType(name="MITagCriteriaOption")
//#SWG#@ApiModel(description = """This class is used to filter contents by itags.
//#SWGNL#Search contents with specific intelligence tags. The list of elements use the AND/OR operator.
//#SWGNL#
//#SWGNL#
//#SWGNL#
//#SWGNL#Constraints:
//#SWGNL#<ul>
//#SWGNL#	<li>max length 5</li>
//#SWGNL#</ul>""")
class MITagCriteriaOption extends Serializable {

	/**
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>max number of elements 5</li>
	 * 	<li>search on each itag subtree (children)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of elements 5</li>
	//#SWGNL#	<li>search on each itag subtree (children)</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var itags: List[MITagCriteria] = new ArrayList[MITagCriteria]
	def withitags(p:List[MITagCriteria]):MITagCriteriaOption ={ 	this.itags = p; 	this }

	/**
	 * applied to itags list. 
	 */
	//#SWG#@ApiModelProperty(value = """applied to itags list. """ ,required = true)
	@BeanProperty 
	var operation: MEITagOperation  = MEITagOperation.OR
	def withoperation(p:MEITagOperation):MITagCriteriaOption ={ 	this.operation = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		import org.apache.commons.lang.StringUtils
		Option(operation).isDefined &&
			itags.forall(i=>StringUtils.isNotEmpty(i.classificationId) && 
			StringUtils.isNotEmpty(i.id)) && itags.size()<=5
	}

}
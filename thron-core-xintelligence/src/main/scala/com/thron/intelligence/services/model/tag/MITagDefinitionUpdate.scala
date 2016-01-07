package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MITagDefinitionUpdate") 
@XmlType(name="MITagDefinitionUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MITagDefinitionUpdate extends MUpdater with Serializable  {

	/**
	 * it's possible to change the TagDefinition.parentId only for unapproved tags,
	 * and can be done only by users with the right permission
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var parentId: String =_
	def withparentId(p:String):MITagDefinitionUpdate ={ 	this.parentId = p; 	this }

	/**
	 * Desired tag position among elements of a specific tree level.
	 */
	//#SWG#@ApiModelProperty(value = """Desired tag position among elements of a specific tree level.""")
	@BeanProperty 
	var pos: Integer =_
	def withpos(p:Integer):MITagDefinitionUpdate ={ 	this.pos = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] =_
	def withnames(p:List[MLocalization]):MITagDefinitionUpdate ={ 	this.names = p; 	this }

	/**
	 * prettyId for the itagDefinition
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li> max length = 150</li>
	 * 	<li> only lower case chars and digits</li>
	 * </ul>
	 * <ul>
	 * 	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the itagDefinition
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li> max length = 150</li>
	//#SWGNL#	<li> only lower case chars and digits</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):MITagDefinitionUpdate ={ 	this.prettyId = p; 	this }

	/**
	 * Used to split the tagdefinition in two macro categories (categorized and
	 * uncategorized tags). Usually the semantic engines creates new tagDefinition
	 * with the categorized attribute to false.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>it's possible to change the categorized attribute only for a tagDefinition
	 * without parentId , sub nodes and without linked metadata </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used to split the tagdefinition in two macro categories (categorized and uncategorized tags). Usually the semantic engines creates new tagDefinition with the categorized attribute to false.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's possible to change the categorized attribute only for a tagDefinition without parentId , sub nodes and without linked metadata </li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var categorized: Boolean =_
	def withcategorized(p:Boolean):MITagDefinitionUpdate ={ 	this.categorized = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		import java.util.regex.Pattern
		val p = Pattern.compile("^[a-zA-Z0-9-_]+$")
		Option(names).forall(_.forall(_.isValid())) &&
			Option(prettyId).forall(s => s.length<=150 && p.matcher(s).matches)
	}

}
package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagDefinitionValue") 
@XmlType(name="MITagDefinitionValue")
//#SWG#@ApiModel(description = """""")
class MITagDefinitionValue extends Serializable {

	/**
	 * Optional. Used to add new tagdefinition inside a tree structure.
	 * This should be the parent tagdefinition id 
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to add new tagdefinition inside a tree structure. 
	//#SWGNL#This should be the parent tagdefinition id """)
	@BeanProperty 
	var parentId: String =_
	def withparentId(p:String):this.type ={ 	this.parentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	/**
	 * Desired tag position among elements of a specific tree level.
	 */
	//#SWG#@ApiModelProperty(value = """Desired tag position among elements of a specific tree level.""")
	@BeanProperty 
	var pos: Integer =_
	def withpos(p:Integer):this.type ={ 	this.pos = p; 	this }

	/**
	 * prettyId for itags. Used to easily identify itagDefinitions
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
	//#SWG#@ApiModelProperty(value = """prettyId for itags. Used to easily identify itagDefinitions
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
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	/**
	 * Used to split the tagdefinition in two macro categories (categorized and
	 * uncategorized tags). Usually the semantic engines creates new tagDefinition
	 * with the categorized attribute to false.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>it's possible to change the categorized attribute only for a tagDefinition
	 * without parentId and sub nodes.  </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Used to split the tagdefinition in two macro categories (categorized and uncategorized tags). Usually the semantic engines creates new tagDefinition with the categorized attribute to false.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's possible to change the categorized attribute only for a tagDefinition without parentId and sub nodes.  </li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var categorized: Boolean  = true
	def withcategorized(p:Boolean):this.type ={ 	this.categorized = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import java.util.regex._
		val p = Pattern.compile("^[a-zA-Z0-9-_]+$")
			Option(prettyId).forall(s => s.length<=150 && p.matcher(s).matches)
	}

}
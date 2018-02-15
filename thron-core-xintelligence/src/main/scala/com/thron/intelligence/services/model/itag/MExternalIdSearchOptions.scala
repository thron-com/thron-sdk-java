package com.thron.intelligence.services.model.itag
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
 * Optional. Search Option used to drive MITagDefinitionSearchCriteria.id field.
 * If not defined, default values are:
 * {
 *  searchOnFields:["LABEL","DESCRIPTION"],
 *  searchKeyOption:"BY_TOKEN"
 * }
 */
@XmlRootElement(name="MExternalIdSearchOptions") 
@XmlType(name="MExternalIdSearchOptions")
//#SWG#@ApiModel(description = """""")
class MExternalIdSearchOptions extends Serializable {

	/**
	 * search on  externalId.value.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max length = 100</li>
	 * 	<li>min length = 3</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """search on  externalId.value.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 100</li>
	//#SWGNL#	<li>min length = 3</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

	/**
	 * Optional. externalId.key, if empty search on the value in all keys
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * 	<li>can not contain spaces</li>
	 * 	<li>max length = 50</li>
	 * 	<li>lowercase</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Optional. externalId.key, if empty search on the value in all keys
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain §/$&#<>"?*:\|</li>
	//#SWGNL#	<li>can not contain spaces</li>
	//#SWGNL#	<li>max length = 50</li>
	//#SWGNL#	<li>lowercase</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	/**
	 * Default value START_WITH
	 */
	//#SWG#@ApiModelProperty(value = """Default value START_WITH""")
	@BeanProperty 
	var searchOption: MEIdSearchOption  = MEIdSearchOption.START_WITH
	def withsearchOption(p:MEIdSearchOption):this.type ={ 	this.searchOption = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
	
		Option(key).forall{k=>
			StringUtils.isNotBlank(k) &&
			// String length restriction
			k.length<=50 &&
			// MongoDB reserved chars, reserved placeholders for internal usage, Windows file name restrictions or URI-reserved chars
			!k.exists(Seq('$','§','\\','/',':','*','?','"','<','>','|','#','&').contains) &&
			// No space allowed
			k.matches("""[^\s]+""")
		} &&
		Option(value).exists{v=>
			StringUtils.isNotBlank(v) &&
			// String length restriction
			v.length<=100 &&
			// String length restriction for search
			v.length>=3
		}
	}

}
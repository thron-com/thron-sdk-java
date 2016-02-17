package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.classification.MEClassificationType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClassificationSearchCriteria") 
@XmlType(name="MClassificationSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MClassificationSearchCriteria extends Serializable {

	/**
	 * list of Classification.id
	 */
	//#SWG#@ApiModelProperty(value = """list of Classification.id""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * search text in label or description fields.
	 * Search all words separated by spaces and in exact order (by token)
	 * Example: "red apple" text search match labels like "red", "apple", "red and
	 * Apple are..."
	 */
	//#SWG#@ApiModelProperty(value = """search text in label or description fields.
	//#SWGNL#Search all words separated by spaces and in exact order (by token)
	//#SWGNL#Example: "red apple" text search match labels like "red", "apple", "red and Apple are..."""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * visibile in Reports
	 */
	//#SWG#@ApiModelProperty(value = """visibile in Reports""")
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * used to search the classification having label like "text" for the defined
	 * language.
	 * Example: the user would like to find the Classification with label "house" for
	 * lang "EN". If "text" is empty the service return all classification defined for
	 * the specified lang.
	 */
	//#SWG#@ApiModelProperty(value = """used to search the classification having label like "text" for the defined language.
	//#SWGNL#Example: the user would like to find the Classification with label "house" for lang "EN". If "text" is empty the service return all classification defined for the specified lang.""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * used to filter removed Classifications
	 */
	//#SWG#@ApiModelProperty(value = """used to filter removed Classifications""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

	/**
	 * can be TARGET/TOPIC/CUSTOM
	 */
	//#SWG#@ApiModelProperty(value = """can be TARGET/TOPIC/CUSTOM""")
	@BeanProperty 
	var classificationType: List[MEClassificationType] = new ArrayList[MEClassificationType]
	def withclassificationType(p:List[MEClassificationType]):this.type ={ 	this.classificationType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
		    StringUtils.isBlank(text) ||
		      (text.length <= 200 && StringUtils.isNotBlank(lang))
	}

}
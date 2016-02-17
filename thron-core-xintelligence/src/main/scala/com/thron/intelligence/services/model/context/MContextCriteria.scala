package com.thron.intelligence.services.model.context
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContextCriteria") 
@XmlType(name="MContextCriteria")
//#SWG#@ApiModel(description = """""")
class MContextCriteria extends Serializable {

	/**
	 * filter context ids
	 */
	//#SWG#@ApiModelProperty(value = """filter context ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	/**
	 * text search on names by token.
	 * Example: "red apple" text search match labels like "red ...", "apple ...", "red
	 * and Apple are..."
	 */
	//#SWG#@ApiModelProperty(value = """text search on names by token.
	//#SWGNL#Example: "red apple" text search match labels like "red ...", "apple ...", "red and Apple are..."""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

	/**
	 * Locale code (ISO639-1).
	 * used to search the context having title like "name" for the defined languages.
	 * Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1).
	//#SWGNL#used to search the context having title like "name" for the defined languages. Could be a comma separated list of ISO639-1 like ("IT,EN,FR"...)""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):this.type ={ 	this.lang = p; 	this }

	/**
	 * filter removed context
	 */
	//#SWG#@ApiModelProperty(value = """filter removed context""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

}
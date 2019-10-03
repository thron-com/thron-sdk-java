package it.newvision.nvp.xcontents.model
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
 * The class is used to store all multilingual data of the Content
 */
@XmlRootElement(name="MContent4Locale") 
@XmlType(name="MContent4Locale")
//#SWG#@ApiModel(description = """The class is used to store all multilingual data of the Content""")
class MContent4Locale extends Serializable {

	/**
	 * Constraints: length <= 10000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 10000""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * DEPRECATED.
	 * Constraints: length <= 500
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#Constraints: length <= 500""")
	@BeanProperty 
	@Deprecated
	var excerpt: String =_
	@Deprecated
	def withexcerpt(p:String):this.type ={ 	this.excerpt = p; 	this }

	/**
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1)""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Constraints: length <= 150
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 150""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).exists(_.length<=150) && 
		Option(description).forall(_.length<=10000) && 
		Option(excerpt).forall(_.length<=500) && 
		Option(locale).exists(_.length<=50)
	}

}
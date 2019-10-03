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
 * The class is used to store all multilingual data of the Category.
 * Private categories have "PRIVATE" as locale code instead of common ISO code .
 * Private categories can have only one Category4Locale with locale Id PRIVATE.
 * System Categories can't have any Category4Locale.
 */
@XmlRootElement(name="MCategory4Locale") 
@XmlType(name="MCategory4Locale")
//#SWG#@ApiModel(description = """The class is used to store all multilingual data of the Category.
//#SWGNL#Private categories have "PRIVATE" as locale code instead of common ISO code .
//#SWGNL#Private categories can have only one Category4Locale with locale Id PRIVATE. 
//#SWGNL#System Categories can't have any Category4Locale.""")
class MCategory4Locale extends Serializable {

	/**
	 * Constraints: length <= 10000
	 */
	//#SWG#@ApiModelProperty(value = """Constraints: length <= 10000""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * Locale code (ISO639-1) 
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1) """ ,required = true)
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
	def isPrivateLocaleValid():Boolean ={
		Option(name).exists(_.length<150) &&
		Option(name).isDefined &&
		Option(description).forall(_.length<10000)
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(name).exists(_.length<=150) && 
		Option(description).forall(_.length<=10000) && 
		Option(locale).exists(_.length<=50) && 
		Option(name).isDefined &&
		Option(locale).isDefined
	}

}
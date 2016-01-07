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
 * The prettyId is used to provide a user-readable identification, and can be used
 * in the findByProperties service to retrieve the object in the system.
 * The prettyId is basically used for WebTv where the user need a readable url
 */
@XmlRootElement(name="MPrettyId") 
@XmlType(name="MPrettyId")
//#SWG#@ApiModel(description = """The prettyId is used to provide a user-readable identification, and can be used in the findByProperties service to retrieve the object in the system.
//#SWGNL#The prettyId is basically used for WebTv where the user need a readable url""")
class MPrettyId extends Serializable {

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>max length = 150</li>
	 * 	<li>only lower case chars and digits</li>
	 * </ul>
	 * <ul>
	 * 	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length = 150</li>
	//#SWGNL#	<li>only lower case chars and digits</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>no spaces allowed, special characters "-" and"_" are allowed"</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MPrettyId ={ 	this.id = p; 	this }

	/**
	 * used to specify the locale where the prettyId should be used.
	 * primary key (unique).
	 */
	//#SWG#@ApiModelProperty(value = """used to specify the locale where the prettyId should be used.
	//#SWGNL#primary key (unique).""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):MPrettyId ={ 	this.locale = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import java.util.regex._
		val p = Pattern.compile("^[a-zA-Z0-9-_]+$")
		Option(id).exists(s => s.length<=150 && p.matcher(s).matches) &&
		Option(locale).exists(_.length<=50)
	}

}
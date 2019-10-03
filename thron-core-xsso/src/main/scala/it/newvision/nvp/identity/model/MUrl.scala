package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUrl") 
@XmlType(name="MUrl")
//#SWG#@ApiModel(description = """""")
class MUrl extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	/**
	 * Uppercase values.
	 * 
	 * PROFILE
	 * BLOG
	 * HOMEPAGE
	 * FACEBOOK
	 * GPLUS
	 * ... (custom values)
	 */
	//#SWG#@ApiModelProperty(value = """Uppercase values.
	//#SWGNL#
	//#SWGNL#PROFILE
	//#SWGNL#BLOG
	//#SWGNL#HOMEPAGE
	//#SWGNL#FACEBOOK
	//#SWGNL#GPLUS
	//#SWGNL#... (custom values)""")
	@BeanProperty 
	var urlCategory: String =_
	def withurlCategory(p:String):this.type ={ 	this.urlCategory = p; 	this }

}
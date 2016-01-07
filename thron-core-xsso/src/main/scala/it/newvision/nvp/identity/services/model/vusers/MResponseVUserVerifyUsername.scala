package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserVerifyUsername") 
@XmlType(name="MResponseVUserVerifyUsername")
//#SWG#@ApiModel(description = """""")
class MResponseVUserVerifyUsername extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var bestUsername: String =_
	def withbestUsername(p:String):MResponseVUserVerifyUsername ={ 	this.bestUsername = p; 	this }

	/**
	 * List of alternative valid usernames
	 */
	//#SWG#@ApiModelProperty(value = """List of alternative valid usernames""")
	@BeanProperty 
	var suggestedUsernames: List[String] = new ArrayList[String]
	def withsuggestedUsernames(p:List[String]):MResponseVUserVerifyUsername ={ 	this.suggestedUsernames = p; 	this }

}
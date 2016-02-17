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
/**
 * The available policies linked to the client.
 * The policies are used to define which services the client can use.
 * It's the macroset of available services (ADMIN role) and the client when create
 * new user can assign a subset of these policies in the UserCapabilities
 */
@XmlRootElement(name="MPolicies") 
@XmlType(name="MPolicies")
//#SWG#@ApiModel(description = """The available policies linked to the client.
//#SWGNL#The policies are used to define which services the client can use. 
//#SWGNL#It's the macroset of available services (ADMIN role) and the client when create new user can assign a subset of these policies in the UserCapabilities""")
class MPolicies extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var policies: List[String] = new ArrayList[String]()
	def withpolicies(p:List[String]):this.type ={ 	this.policies = p; 	this }

}
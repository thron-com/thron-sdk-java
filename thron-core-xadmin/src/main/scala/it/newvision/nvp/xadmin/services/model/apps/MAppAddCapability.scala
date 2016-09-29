package it.newvision.nvp.xadmin.services.model.apps
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
 * the roles/capabilities to apply to the linked user's app
 */
@XmlRootElement(name="MAppAddCapability") 
@XmlType(name="MAppAddCapability")
//#SWG#@ApiModel(description = """the roles/capabilities to apply to the linked user's app""")
class MAppAddCapability extends Serializable {

	/**
	 * the list of new capabilities
	 */
	//#SWG#@ApiModelProperty(value = """the list of new capabilities""")
	@BeanProperty 
	var addCapabilities: List[String] = new ArrayList[String]
	def withaddCapabilities(p:List[String]):this.type ={ 	this.addCapabilities = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var addUserRoles: List[String] = new ArrayList[String]
	def withaddUserRoles(p:List[String]):this.type ={ 	this.addUserRoles = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}
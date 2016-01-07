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
@XmlRootElement(name="MCapabilities") 
@XmlType(name="MCapabilities")
//#SWG#@ApiModel(description = """""")
class MCapabilities extends Serializable {

	/**
	 * the list of available/disabled capabilities
	 */
	//#SWG#@ApiModelProperty(value = """the list of available/disabled capabilities""")
	@BeanProperty 
	var capabilities: List[String] = new ArrayList[String]()
	def withcapabilities(p:List[String]):MCapabilities ={ 	this.capabilities = p; 	this }

}
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
@XmlRootElement(name="MAppCapabilities") 
@XmlType(name="MAppCapabilities")
//#SWG#@ApiModel(description = """""")
class MAppCapabilities extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var capabilities: List[String] = new ArrayList[String]
	def withcapabilities(p:List[String]):MAppCapabilities ={ 	this.capabilities = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var roles: List[String] = new ArrayList[String]
	def withroles(p:List[String]):MAppCapabilities ={ 	this.roles = p; 	this }

}
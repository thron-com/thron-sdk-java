package it.newvision.nvp.xcontents.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MProfile") 
@XmlType(name="MProfile")
//#SWG#@ApiModel(description = """""")
class MProfile extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientId: List[String] = new ArrayList[String]
	def withclientId(p:List[String]):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var services: String =_
	def withservices(p:String):this.type ={ 	this.services = p; 	this }

}
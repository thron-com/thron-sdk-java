package it.newvision.nvp.xcontents.services.model.client.authsettings
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSecuritySettings") 
@XmlType(name="MResponseSecuritySettings")
//#SWG#@ApiModel(description = """""")
class MResponseSecuritySettings extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var settings: MSecuritySettings =_
	def withsettings(p:MSecuritySettings):this.type ={ 	this.settings = p; 	this }

}
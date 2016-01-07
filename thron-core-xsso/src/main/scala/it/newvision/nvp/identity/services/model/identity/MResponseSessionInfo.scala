package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MSession

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSessionInfo") 
@XmlType(name="MResponseSessionInfo")
//#SWG#@ApiModel(description = """""")
class MResponseSessionInfo extends MResponseIdentity with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var session: MSession =_
	def withsession(p:MSession):MResponseSessionInfo ={ 	this.session = p; 	this }

}
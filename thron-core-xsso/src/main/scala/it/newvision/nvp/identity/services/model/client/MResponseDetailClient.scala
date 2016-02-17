package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * for internal use
 */
@XmlRootElement(name="MResponseDetailClient") 
@XmlType(name="MResponseDetailClient")
//#SWG#@ApiModel(description = """for internal use""")
class MResponseDetailClient extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var client: MClient =_
	def withclient(p:MClient):this.type ={ 	this.client = p; 	this }

}
package it.newvision.nvp.xadmin.model
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
 * Service Model Class. Used to collect the admin information of a specific
 * clientId.
 */
@XmlRootElement(name="MClient") 
@XmlType(name="MClient")
//#SWG#@ApiModel(description = """Service Model Class. Used to collect the admin information of a specific clientId.""")
class MClient extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MClient ={ 	this.clientId = p; 	this }

}
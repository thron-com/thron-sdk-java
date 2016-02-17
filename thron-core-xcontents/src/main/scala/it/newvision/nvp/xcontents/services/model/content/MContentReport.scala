package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentReport") 
@XmlType(name="MContentReport")
//#SWG#@ApiModel(description = """""")
class MContentReport extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var total: Long =_
	def withtotal(p:Long):this.type ={ 	this.total = p; 	this }

}
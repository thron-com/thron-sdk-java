package it.newvision.nvp.xpackager.services.model.request
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
 * Request message for service JPackager.initPackager
 */
@XmlRootElement(name="MPackagerinitPackagerReq")
@XmlType(name="MPackagerinitPackagerReq")
//#SWG#@ApiModel(description = "Request message for service JPackager.initPackager")
class MPackagerinitPackagerReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPackagerinitPackagerReq ={ 	this.clientId = p; 	this }

}
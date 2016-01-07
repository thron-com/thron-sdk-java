package it.newvision.nvp.xpublisher.services.model.request
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
 * Request message for service JWeeboHosting.deleteFile
 */
@XmlRootElement(name="MWeeboHostingdeleteFileReq")
@XmlType(name="MWeeboHostingdeleteFileReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboHosting.deleteFile")
class MWeeboHostingdeleteFileReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboHostingdeleteFileReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var path: String =_
	def withpath(p:String):MWeeboHostingdeleteFileReq ={ 	this.path = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var filename: String =_
	def withfilename(p:String):MWeeboHostingdeleteFileReq ={ 	this.filename = p; 	this }

}
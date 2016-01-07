package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMediaContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMediaContentAdmin.createMediaContent
 */
@XmlRootElement(name="MMediaContentAdmincreateMediaContentReq")
@XmlType(name="MMediaContentAdmincreateMediaContentReq")
//#SWG#@ApiModel(description = "Request message for service JMediaContentAdmin.createMediaContent")
class MMediaContentAdmincreateMediaContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MMediaContentAdmincreateMediaContentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var content: MMediaContent =_
	def withcontent(p:MMediaContent):MMediaContentAdmincreateMediaContentReq ={ 	this.content = p; 	this }

}
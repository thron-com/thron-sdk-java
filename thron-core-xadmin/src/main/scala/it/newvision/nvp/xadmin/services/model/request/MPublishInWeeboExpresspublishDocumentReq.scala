package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishExpressDocumentParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishDocument
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishDocumentReq")
@XmlType(name="MPublishInWeeboExpresspublishDocumentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishDocument")
class MPublishInWeeboExpresspublishDocumentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishExpressDocumentParams =_
	def withparam(p:MPublishExpressDocumentParams):this.type ={ 	this.param = p; 	this }

}
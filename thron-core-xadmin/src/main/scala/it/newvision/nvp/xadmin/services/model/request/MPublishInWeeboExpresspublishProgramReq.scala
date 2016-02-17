package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MPublishExpressProgramParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishInWeeboExpress.publishProgram
 */
@XmlRootElement(name="MPublishInWeeboExpresspublishProgramReq")
@XmlType(name="MPublishInWeeboExpresspublishProgramReq")
//#SWG#@ApiModel(description = "Request message for service JPublishInWeeboExpress.publishProgram")
class MPublishInWeeboExpresspublishProgramReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MPublishExpressProgramParams =_
	def withparam(p:MPublishExpressProgramParams):this.type ={ 	this.param = p; 	this }

}
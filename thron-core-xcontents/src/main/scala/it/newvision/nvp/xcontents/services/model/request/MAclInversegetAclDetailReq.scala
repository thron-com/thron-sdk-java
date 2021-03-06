package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEObjClass

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAclInverse.getAclDetail
 */
@XmlRootElement(name="MAclInversegetAclDetailReq")
@XmlType(name="MAclInversegetAclDetailReq")
//#SWG#@ApiModel(description = "Request message for service JAclInverse.getAclDetail")
class MAclInversegetAclDetailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var targetObjClass: MEObjClass =_
	def withtargetObjClass(p:MEObjClass):this.type ={ 	this.targetObjClass = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var targetObjId: String =_
	def withtargetObjId(p:String):this.type ={ 	this.targetObjId = p; 	this }

}
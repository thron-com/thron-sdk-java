package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MTrashProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClient.updateTrashProperties
 */
@XmlRootElement(name="MClientupdateTrashPropertiesReq")
@XmlType(name="MClientupdateTrashPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JClient.updateTrashProperties")
class MClientupdateTrashPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MClientupdateTrashPropertiesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MTrashProperties =_
	def withproperties(p:MTrashProperties):MClientupdateTrashPropertiesReq ={ 	this.properties = p; 	this }

}
package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MClassificationUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPermissions.patch
 */
@XmlRootElement(name="MPermissionspatchReq")
@XmlType(name="MPermissionspatchReq")
//#SWG#@ApiModel(description = "Request message for service JPermissions.patch")
class MPermissionspatchReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPermissionspatchReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var id: String =_
	def withid(p:String):MPermissionspatchReq ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var classification: MClassificationUpdate =_
	def withclassification(p:MClassificationUpdate):MPermissionspatchReq ={ 	this.classification = p; 	this }

}
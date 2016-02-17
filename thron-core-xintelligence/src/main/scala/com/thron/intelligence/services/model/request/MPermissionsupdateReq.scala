package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MClassificationPermissionList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPermissions.update
 */
@XmlRootElement(name="MPermissionsupdateReq")
@XmlType(name="MPermissionsupdateReq")
//#SWG#@ApiModel(description = "Request message for service JPermissions.update")
class MPermissionsupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MClassificationPermissionList =_
	def withvalue(p:MClassificationPermissionList):this.type ={ 	this.value = p; 	this }

}
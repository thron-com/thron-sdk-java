package com.thron.contacts.service.model.request
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
 * Request message for service JContactNC.listen
 */
@XmlRootElement(name="MContactNClistenReq")
@XmlType(name="MContactNClistenReq")
//#SWG#@ApiModel(description = "Request message for service JContactNC.listen")
class MContactNClistenReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: it.newvision.nv4me.notificationcenter.services.model.rest.MRestNotification =_
	def withvalue(p:it.newvision.nv4me.notificationcenter.services.model.rest.MRestNotification):this.type ={ 	this.value = p; 	this }

}
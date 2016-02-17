package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.context.MContextUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContext.update
 */
@XmlRootElement(name="MContextupdateReq")
@XmlType(name="MContextupdateReq")
//#SWG#@ApiModel(description = "Request message for service JContext.update")
class MContextupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MContextUpdate =_
	def withupdate(p:MContextUpdate):this.type ={ 	this.update = p; 	this }

}
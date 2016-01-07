package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.engine.MIEngineUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIEngine.update
 */
@XmlRootElement(name="MIEngineupdateReq")
@XmlType(name="MIEngineupdateReq")
//#SWG#@ApiModel(description = "Request message for service JIEngine.update")
class MIEngineupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MIEngineUpdate =_
	def withupdate(p:MIEngineUpdate):MIEngineupdateReq ={ 	this.update = p; 	this }

}
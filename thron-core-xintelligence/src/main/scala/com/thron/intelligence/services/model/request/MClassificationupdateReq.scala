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
 * Request message for service JClassification.update
 */
@XmlRootElement(name="MClassificationupdateReq")
@XmlType(name="MClassificationupdateReq")
//#SWG#@ApiModel(description = "Request message for service JClassification.update")
class MClassificationupdateReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MClassificationUpdate =_
	def withupdate(p:MClassificationUpdate):this.type ={ 	this.update = p; 	this }

}
package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MClassificationValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JClassification.insert
 */
@XmlRootElement(name="MClassificationinsertReq")
@XmlType(name="MClassificationinsertReq")
//#SWG#@ApiModel(description = "Request message for service JClassification.insert")
class MClassificationinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MClassificationValue =_
	def withvalue(p:MClassificationValue):this.type ={ 	this.value = p; 	this }

}
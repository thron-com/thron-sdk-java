package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.context.MContextValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContext.insert
 */
@XmlRootElement(name="MContextinsertReq")
@XmlType(name="MContextinsertReq")
//#SWG#@ApiModel(description = "Request message for service JContext.insert")
class MContextinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MContextValue =_
	def withvalue(p:MContextValue):MContextinsertReq ={ 	this.value = p; 	this }

}
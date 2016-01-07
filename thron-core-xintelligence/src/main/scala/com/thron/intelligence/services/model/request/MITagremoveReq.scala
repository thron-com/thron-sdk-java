package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITag.remove
 */
@XmlRootElement(name="MITagremoveReq")
@XmlType(name="MITagremoveReq")
//#SWG#@ApiModel(description = "Request message for service JITag.remove")
class MITagremoveReq extends Serializable {

	/**
	 * Required. 
	 */
	//#SWG#@ApiModelProperty(value = """Required. """, required = true)
	@BeanProperty
	var target: MTarget =_
	def withtarget(p:MTarget):MITagremoveReq ={ 	this.target = p; 	this }

}
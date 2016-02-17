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
 * Request message for service JITag.insert
 */
@XmlRootElement(name="MITaginsertReq")
@XmlType(name="MITaginsertReq")
//#SWG#@ApiModel(description = "Request message for service JITag.insert")
class MITaginsertReq extends Serializable {

	/**
	 * Required. 
	 */
	//#SWG#@ApiModelProperty(value = """Required. """, required = true)
	@BeanProperty
	var target: MTarget =_
	def withtarget(p:MTarget):this.type ={ 	this.target = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var suggested: Boolean =_
	def withsuggested(p:Boolean):this.type ={ 	this.suggested = p; 	this }

}
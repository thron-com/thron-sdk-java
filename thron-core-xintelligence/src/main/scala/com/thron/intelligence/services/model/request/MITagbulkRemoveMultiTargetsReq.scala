package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MITagBulkValue2

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITag.bulkRemoveMultiTargets
 */
@XmlRootElement(name="MITagbulkRemoveMultiTargetsReq")
@XmlType(name="MITagbulkRemoveMultiTargetsReq")
//#SWG#@ApiModel(description = "Request message for service JITag.bulkRemoveMultiTargets")
class MITagbulkRemoveMultiTargetsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MITagBulkValue2 =_
	def withvalue(p:MITagBulkValue2):this.type ={ 	this.value = p; 	this }

}
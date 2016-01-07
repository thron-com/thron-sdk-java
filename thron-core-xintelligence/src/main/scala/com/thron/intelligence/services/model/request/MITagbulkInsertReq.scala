package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.MITagBulkValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITag.bulkInsert
 */
@XmlRootElement(name="MITagbulkInsertReq")
@XmlType(name="MITagbulkInsertReq")
//#SWG#@ApiModel(description = "Request message for service JITag.bulkInsert")
class MITagbulkInsertReq extends Serializable {

	/**
	 * An existing targetId for a specific classification
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var value: MITagBulkValue =_
	def withvalue(p:MITagBulkValue):MITagbulkInsertReq ={ 	this.value = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""", required = true)
	@BeanProperty
	var suggested: Boolean =_
	def withsuggested(p:Boolean):MITagbulkInsertReq ={ 	this.suggested = p; 	this }

}
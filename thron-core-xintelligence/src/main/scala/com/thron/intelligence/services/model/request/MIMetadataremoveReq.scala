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
 * Request message for service JIMetadata.remove
 */
@XmlRootElement(name="MIMetadataremoveReq")
@XmlType(name="MIMetadataremoveReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.remove")
class MIMetadataremoveReq extends Serializable {

	/**
	 * Optional.
	 * Only for multilocale metadata definitions.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#Only for multilocale metadata definitions.""", required = true)
	@BeanProperty
	var lang: String =_
	def withlang(p:String):MIMetadataremoveReq ={ 	this.lang = p; 	this }

	/**
	 * Required. 
	 */
	//#SWG#@ApiModelProperty(value = """Required. """, required = true)
	@BeanProperty
	var target: MTarget =_
	def withtarget(p:MTarget):MIMetadataremoveReq ={ 	this.target = p; 	this }

}
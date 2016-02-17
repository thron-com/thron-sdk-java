package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MIMetadata
import com.thron.intelligence.services.model.common.MTarget

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JIMetadata.insert
 */
@XmlRootElement(name="MIMetadatainsertReq")
@XmlType(name="MIMetadatainsertReq")
//#SWG#@ApiModel(description = "Request message for service JIMetadata.insert")
class MIMetadatainsertReq extends Serializable {

	/**
	 * An existing targetId for a specific classification
	 */
	//#SWG#@ApiModelProperty(value = """An existing targetId for a specific classification""", required = true)
	@BeanProperty
	var imetadata: MIMetadata =_
	def withimetadata(p:MIMetadata):this.type ={ 	this.imetadata = p; 	this }

	/**
	 * Required. 
	 */
	//#SWG#@ApiModelProperty(value = """Required. """, required = true)
	@BeanProperty
	var target: MTarget =_
	def withtarget(p:MTarget):this.type ={ 	this.target = p; 	this }

}
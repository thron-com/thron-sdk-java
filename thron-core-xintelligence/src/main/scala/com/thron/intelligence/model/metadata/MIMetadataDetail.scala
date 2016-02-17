package com.thron.intelligence.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget
import com.thron.intelligence.services.model.metadata.MIMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This class should be used to store additional information. 
 */
@XmlRootElement(name="MIMetadataDetail") 
@XmlType(name="MIMetadataDetail")
//#SWG#@ApiModel(description = """This class should be used to store additional information. """)
class MIMetadataDetail extends MIMetadata with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var metadataDefinitionId: String =_
	def withmetadataDefinitionId(p:String):this.type ={ 	this.metadataDefinitionId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var target: MTarget =_
	def withtarget(p:MTarget):this.type ={ 	this.target = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

}
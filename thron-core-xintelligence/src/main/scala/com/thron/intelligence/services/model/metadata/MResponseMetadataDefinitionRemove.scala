package com.thron.intelligence.services.model.metadata
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
@XmlRootElement(name="MResponseMetadataDefinitionRemove") 
@XmlType(name="MResponseMetadataDefinitionRemove")
//#SWG#@ApiModel(description = """""")
class MResponseMetadataDefinitionRemove extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var targetInIssues: List[MTarget] = new ArrayList[MTarget]
	def withtargetInIssues(p:List[MTarget]):this.type ={ 	this.targetInIssues = p; 	this }

}
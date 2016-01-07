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
@XmlRootElement(name="MResponseIMetadataBulk2") 
@XmlType(name="MResponseIMetadataBulk2")
//#SWG#@ApiModel(description = """""")
class MResponseIMetadataBulk2 extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var targetsInIssue: List[MTarget] = new ArrayList[MTarget]
	def withtargetsInIssue(p:List[MTarget]):MResponseIMetadataBulk2 ={ 	this.targetsInIssue = p; 	this }

}
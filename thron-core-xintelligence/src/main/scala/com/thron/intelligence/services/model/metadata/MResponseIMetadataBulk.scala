package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseIMetadataBulk") 
@XmlType(name="MResponseIMetadataBulk")
//#SWG#@ApiModel(description = """""")
class MResponseIMetadataBulk extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imetadataInIssue: List[MIMetadata] = new ArrayList[MIMetadata]
	def withimetadataInIssue(p:List[MIMetadata]):this.type ={ 	this.imetadataInIssue = p; 	this }

}
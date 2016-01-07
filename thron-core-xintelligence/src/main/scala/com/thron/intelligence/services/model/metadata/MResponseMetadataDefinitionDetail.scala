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
@XmlRootElement(name="MResponseMetadataDefinitionDetail") 
@XmlType(name="MResponseMetadataDefinitionDetail")
//#SWG#@ApiModel(description = """""")
class MResponseMetadataDefinitionDetail extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MMetadataDefinitionDetail =_
	def withitem(p:MMetadataDefinitionDetail):MResponseMetadataDefinitionDetail ={ 	this.item = p; 	this }

}
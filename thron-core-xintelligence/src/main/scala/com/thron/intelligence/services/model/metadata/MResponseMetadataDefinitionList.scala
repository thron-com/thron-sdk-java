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
@XmlRootElement(name="MResponseMetadataDefinitionList") 
@XmlType(name="MResponseMetadataDefinitionList")
//#SWG#@ApiModel(description = """""")
class MResponseMetadataDefinitionList extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MMetadataDefinitionDetail] = new ArrayList[MMetadataDefinitionDetail]
	def withitems(p:List[MMetadataDefinitionDetail]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}
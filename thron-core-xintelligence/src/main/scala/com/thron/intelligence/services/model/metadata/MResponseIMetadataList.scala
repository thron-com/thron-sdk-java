package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MIMetadataDetail

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseIMetadataList") 
@XmlType(name="MResponseIMetadataList")
//#SWG#@ApiModel(description = """""")
class MResponseIMetadataList extends MResponseMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MIMetadataDetail] = new ArrayList[MIMetadataDetail]
	def withitems(p:List[MIMetadataDetail]):MResponseIMetadataList ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseIMetadataList ={ 	this.totalResults = p; 	this }

}
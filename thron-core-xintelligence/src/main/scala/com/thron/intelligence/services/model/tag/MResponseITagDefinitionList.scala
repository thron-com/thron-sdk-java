package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagDefinitionList") 
@XmlType(name="MResponseITagDefinitionList")
//#SWG#@ApiModel(description = """""")
class MResponseITagDefinitionList extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MITagDefinitionDetail] = new ArrayList[MITagDefinitionDetail]
	def withitems(p:List[MITagDefinitionDetail]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}
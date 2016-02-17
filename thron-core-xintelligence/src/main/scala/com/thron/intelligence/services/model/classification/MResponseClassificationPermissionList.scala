package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseClassificationPermissionList") 
@XmlType(name="MResponseClassificationPermissionList")
//#SWG#@ApiModel(description = """""")
class MResponseClassificationPermissionList extends MResponseClassification with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MClassificationPermissionDetail] = new ArrayList[MClassificationPermissionDetail]
	def withitems(p:List[MClassificationPermissionDetail]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}
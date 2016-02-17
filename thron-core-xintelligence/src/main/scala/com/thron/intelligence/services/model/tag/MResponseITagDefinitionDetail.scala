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
@XmlRootElement(name="MResponseITagDefinitionDetail") 
@XmlType(name="MResponseITagDefinitionDetail")
//#SWG#@ApiModel(description = """""")
class MResponseITagDefinitionDetail extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MITagDefinitionDetail =_
	def withitem(p:MITagDefinitionDetail):this.type ={ 	this.item = p; 	this }

}
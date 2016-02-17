package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.tag.MITagDefinition

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagDetail") 
@XmlType(name="MResponseITagDetail")
//#SWG#@ApiModel(description = """""")
class MResponseITagDetail extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MITagDefinition] = new ArrayList[MITagDefinition]
	def withitems(p:List[MITagDefinition]):this.type ={ 	this.items = p; 	this }

}
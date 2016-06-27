package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MResponseITag

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagDefinitionCombinedList") 
@XmlType(name="MResponseITagDefinitionCombinedList")
//#SWG#@ApiModel(description = """""")
class MResponseITagDefinitionCombinedList extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MCombinedITag] = new ArrayList[MCombinedITag]
	def withitems(p:List[MCombinedITag]):this.type ={ 	this.items = p; 	this }

}
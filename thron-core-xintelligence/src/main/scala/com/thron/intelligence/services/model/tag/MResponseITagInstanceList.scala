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
@XmlRootElement(name="MResponseITagInstanceList") 
@XmlType(name="MResponseITagInstanceList")
//#SWG#@ApiModel(description = """""")
class MResponseITagInstanceList extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MITagInstance] = new ArrayList[MITagInstance]
	def withitems(p:List[MITagInstance]):this.type ={ 	this.items = p; 	this }

}
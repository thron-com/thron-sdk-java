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
@XmlRootElement(name="MTargetITagsList") 
@XmlType(name="MTargetITagsList")
//#SWG#@ApiModel(description = """""")
class MTargetITagsList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MTargetITags] = new ArrayList[MTargetITags]
	def withitems(p:List[MTargetITags]):this.type ={ 	this.items = p; 	this }

}
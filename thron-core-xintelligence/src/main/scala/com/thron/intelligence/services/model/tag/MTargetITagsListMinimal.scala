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
@XmlRootElement(name="MTargetITagsListMinimal") 
@XmlType(name="MTargetITagsListMinimal")
//#SWG#@ApiModel(description = """""")
class MTargetITagsListMinimal extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MTargetITagsMinimal] = new ArrayList[MTargetITagsMinimal]
	def withitems(p:List[MTargetITagsMinimal]):this.type ={ 	this.items = p; 	this }

}
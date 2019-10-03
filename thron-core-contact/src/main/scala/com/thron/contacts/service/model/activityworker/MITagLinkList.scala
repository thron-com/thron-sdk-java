package com.thron.contacts.service.model.activityworker
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MITagLink

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagLinkList") 
@XmlType(name="MITagLinkList")
//#SWG#@ApiModel(description = """""")
class MITagLinkList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tags: List[MITagLink] = new ArrayList[MITagLink]
	def withtags(p:List[MITagLink]):this.type ={ 	this.tags = p; 	this }

}
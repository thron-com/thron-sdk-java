package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagList") 
@XmlType(name="MITagList")
//#SWG#@ApiModel(description = """""")
class MITagList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tagIds: List[String] = new ArrayList[String]
	def withtagIds(p:List[String]):this.type ={ 	this.tagIds = p; 	this }

}
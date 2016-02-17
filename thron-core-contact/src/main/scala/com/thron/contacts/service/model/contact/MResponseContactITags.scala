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
@XmlRootElement(name="MResponseContactITags") 
@XmlType(name="MResponseContactITags")
//#SWG#@ApiModel(description = """""")
class MResponseContactITags extends MResponseContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itagsInIssue: List[String] = new ArrayList[String]
	def withitagsInIssue(p:List[String]):this.type ={ 	this.itagsInIssue = p; 	this }

}
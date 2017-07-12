package com.thron.contacts.service.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUpdatedContacts") 
@XmlType(name="MResponseUpdatedContacts")
//#SWG#@ApiModel(description = """""")
class MResponseUpdatedContacts extends MResponseSync with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MUpdatedContactsResult] = new ArrayList[MUpdatedContactsResult]
	def withitems(p:List[MUpdatedContactsResult]):this.type ={ 	this.items = p; 	this }

}
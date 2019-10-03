package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.sync.MUpdatedContactsCriteria
import com.thron.contacts.service.model.sync.MSyncOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSync.updatedContacts
 */
@XmlRootElement(name="MSyncupdatedContactsReq")
@XmlType(name="MSyncupdatedContactsReq")
//#SWG#@ApiModel(description = "Request message for service JSync.updatedContacts")
class MSyncupdatedContactsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MUpdatedContactsCriteria =_
	def withcriteria(p:MUpdatedContactsCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var options: MSyncOptions =_
	def withoptions(p:MSyncOptions):this.type ={ 	this.options = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pageSize: Integer =_
	def withpageSize(p:Integer):this.type ={ 	this.pageSize = p; 	this }

}
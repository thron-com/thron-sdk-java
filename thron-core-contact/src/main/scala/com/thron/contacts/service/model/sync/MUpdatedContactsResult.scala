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
@XmlRootElement(name="MUpdatedContactsResult") 
@XmlType(name="MUpdatedContactsResult")
//#SWG#@ApiModel(description = """""")
class MUpdatedContactsResult extends MExportResult with Serializable  {

	/**
	 * Whether or not contact has been removed from the platform
	 */
	//#SWG#@ApiModelProperty(value = """Whether or not contact has been removed from the platform""" ,required = true)
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

}
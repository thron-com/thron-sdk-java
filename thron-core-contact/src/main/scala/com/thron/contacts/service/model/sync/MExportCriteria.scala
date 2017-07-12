package com.thron.contacts.service.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MEContactType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MExportCriteria") 
@XmlType(name="MExportCriteria")
//#SWG#@ApiModel(description = """""")
class MExportCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contactType: MEContactType =_
	def withcontactType(p:MEContactType):this.type ={ 	this.contactType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}
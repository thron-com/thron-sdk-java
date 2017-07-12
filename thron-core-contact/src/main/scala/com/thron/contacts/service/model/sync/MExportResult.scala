package com.thron.contacts.service.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MContactDetail

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MExportResult") 
@XmlType(name="MExportResult")
//#SWG#@ApiModel(description = """""")
class MExportResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contact: MContactDetail =_
	def withcontact(p:MContactDetail):this.type ={ 	this.contact = p; 	this }

}
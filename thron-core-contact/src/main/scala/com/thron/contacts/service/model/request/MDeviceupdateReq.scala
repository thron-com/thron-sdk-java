package com.thron.contacts.service.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double} 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MIdentityKey

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDeviceupdateReq") 
 @XmlType(name="MDeviceupdateReq")
class MDeviceupdateReq extends Serializable {

	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MDeviceupdateReq ={ 	this.clientId = p; 	this }

	@BeanProperty 
	var contactId: String =_
	def withcontactId(p:String):MDeviceupdateReq ={ 	this.contactId = p; 	this }

	@BeanProperty 
	var ik: MIdentityKey =_
	def withik(p:MIdentityKey):MDeviceupdateReq ={ 	this.ik = p; 	this }

}
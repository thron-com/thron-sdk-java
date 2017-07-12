package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.MDateRange

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MBillingContactArchiveUnit") 
@XmlType(name="MBillingContactArchiveUnit")
//#SWG#@ApiModel(description = """""")
class MBillingContactArchiveUnit extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * created Date
	 */
	//#SWG#@ApiModelProperty(value = """created Date""")
	@BeanProperty 
	var createdDate: Date  = new Date
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var timeRange: MDateRange =_
	def withtimeRange(p:MDateRange):this.type ={ 	this.timeRange = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalContacts: Long  = 0L
	def withtotalContacts(p:Long):this.type ={ 	this.totalContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var identifiedContacts: Long  = 0L
	def withidentifiedContacts(p:Long):this.type ={ 	this.identifiedContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalContactsUnmerged: Long  = 0L
	def withtotalContactsUnmerged(p:Long):this.type ={ 	this.totalContactsUnmerged = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalActiveContacts: Long  = 0L
	def withtotalActiveContacts(p:Long):this.type ={ 	this.totalActiveContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var identifiedActiveContacts: Long  = 0L
	def withidentifiedActiveContacts(p:Long):this.type ={ 	this.identifiedActiveContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalActiveContactsUnmerged: Long  = 0L
	def withtotalActiveContactsUnmerged(p:Long):this.type ={ 	this.totalActiveContactsUnmerged = p; 	this }

}
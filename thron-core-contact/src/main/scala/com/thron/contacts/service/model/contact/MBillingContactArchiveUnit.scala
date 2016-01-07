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
	def withclientId(p:String):MBillingContactArchiveUnit ={ 	this.clientId = p; 	this }

	/**
	 * created Date
	 */
	//#SWG#@ApiModelProperty(value = """created Date""")
	@BeanProperty 
	var createdDate: Date  = new Date
	def withcreatedDate(p:Date):MBillingContactArchiveUnit ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var timeRange: MDateRange =_
	def withtimeRange(p:MDateRange):MBillingContactArchiveUnit ={ 	this.timeRange = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalContacts: Long =_
	def withtotalContacts(p:Long):MBillingContactArchiveUnit ={ 	this.totalContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalContactsUnmerged: Long =_
	def withtotalContactsUnmerged(p:Long):MBillingContactArchiveUnit ={ 	this.totalContactsUnmerged = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalActiveContacts: Long =_
	def withtotalActiveContacts(p:Long):MBillingContactArchiveUnit ={ 	this.totalActiveContacts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalActiveContactsUnmerged: Long =_
	def withtotalActiveContactsUnmerged(p:Long):MBillingContactArchiveUnit ={ 	this.totalActiveContactsUnmerged = p; 	this }

}
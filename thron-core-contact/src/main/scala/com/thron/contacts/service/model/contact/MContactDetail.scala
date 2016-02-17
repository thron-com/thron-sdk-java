package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.model.MITag
import com.thron.contacts.model.MIdentityKey
import com.thron.contacts.model.MContact

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContactDetail") 
@XmlType(name="MContactDetail")
//#SWG#@ApiModel(description = """""")
class MContactDetail extends MContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itags: List[MITag] = new ArrayList[MITag]
	def withitags(p:List[MITag]):this.type ={ 	this.itags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var keys: List[MIdentityKey] = new ArrayList[MIdentityKey]
	def withkeys(p:List[MIdentityKey]):this.type ={ 	this.keys = p; 	this }

	/**
	 * @param contact : MContact
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(contact: MContact){
		this()
		this.id = contact.id
		this.accessedDate = contact.accessedDate
		this.contactType = contact.contactType
		this.oldIds = contact.oldIds
		this.name = contact.name
	}

}
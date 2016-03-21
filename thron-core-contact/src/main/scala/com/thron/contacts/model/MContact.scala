package com.thron.contacts.model
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
@XmlRootElement(name="MContact") 
@XmlType(name="MContact")
//#SWG#@ApiModel(description = """""")
class MContact extends Serializable {

	/**
	 * The contact Id.
	 * An anonimous contanct has empty oldContactIds and the same id of the device.
	 */
	//#SWG#@ApiModelProperty(value = """The contact Id.
	//#SWGNL#An anonimous contanct has empty oldContactIds and the same id of the device.""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date  = new Date
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * The last accessed Date for the device
	 */
	//#SWG#@ApiModelProperty(value = """The last accessed Date for the device""")
	@BeanProperty 
	var accessedDate: Date  = new Date
	def withaccessedDate(p:Date):this.type ={ 	this.accessedDate = p; 	this }

	/**
	 * Old anonimous contactId coming from merge operation.
	 * When two contacts are merged the source (anonymous) contact id is saved in the
	 * oldIds attribute of the target contact.
	 */
	//#SWG#@ApiModelProperty(value = """Old anonimous contactId coming from merge operation. 
	//#SWGNL#When two contacts are merged the source (anonymous) contact id is saved in the oldIds attribute of the target contact.""")
	@BeanProperty 
	var oldIds: List[String] = new ArrayList[String]
	def witholdIds(p:List[String]):this.type ={ 	this.oldIds = p; 	this }

	/**
	 * contact type
	 */
	//#SWG#@ApiModelProperty(value = """contact type""" ,required = true)
	@BeanProperty 
	var contactType: MEContactType  = MEContactType.ANONYMOUS
	def withcontactType(p:MEContactType):this.type ={ 	this.contactType = p; 	this }

	/**
	 * A custom label for the contact
	 * 
	 * Constraint:
	 * <ul>
	 * 	<li>max length 100</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """A custom label for the contact
	//#SWGNL#
	//#SWGNL#Constraint: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length 100</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * @param id : String
	 * @return MContact
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(id: String):MContact ={
		import scala.collection.JavaConversions._
		this.id = id
		this.oldIds = id::Nil
		this
	}

}
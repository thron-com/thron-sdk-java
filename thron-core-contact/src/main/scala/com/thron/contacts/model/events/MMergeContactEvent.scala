package com.thron.contacts.model.events
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
/**
 * <ul>
 * 	<li>[redshift][mongodb ok] add the oldId in Contact.oldIds list</li>
 * 	<li>[sdk] add the itags list to the target Contact (using the JItag
 * services)</li>
 * 	<li>remove the contact with id == oldId</li>
 * </ul>
 */
@XmlRootElement(name="MMergeContactEvent") 
@XmlType(name="MMergeContactEvent")
//#SWG#@ApiModel(description = """<ul>
//#SWGNL#	<li>[redshift][mongodb ok] add the oldId in Contact.oldIds list</li>
//#SWGNL#	<li>[sdk] add the itags list to the target Contact (using the JItag services)</li>
//#SWGNL#	<li>remove the contact with id == oldId</li>
//#SWGNL#</ul>""")
class MMergeContactEvent extends MContactEvent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var oldContact: MContactDetail =_
	def witholdContact(p:MContactDetail):this.type ={ 	this.oldContact = p; 	this }

	/**
	 * source contact id (contact to remove)
	 */
	//#SWG#@ApiModelProperty(value = """source contact id (contact to remove)""" ,required = true)
	@BeanProperty 
	var oldId: String =_
	def witholdId(p:String):this.type ={ 	this.oldId = p; 	this }

}
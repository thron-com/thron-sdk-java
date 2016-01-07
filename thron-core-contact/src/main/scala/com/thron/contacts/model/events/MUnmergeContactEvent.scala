package com.thron.contacts.model.events
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <ul>
 * 	<li>remove the oldid from the contact with id == UnmergeConcatEvent.id</li>
 * 	<li>create a new contact (anonymous) with the id = oldid</li>
 * </ul>
 */
@XmlRootElement(name="MUnmergeContactEvent") 
@XmlType(name="MUnmergeContactEvent")
//#SWG#@ApiModel(description = """<ul>
//#SWGNL#	<li>remove the oldid from the contact with id == UnmergeConcatEvent.id</li>
//#SWGNL#	<li>create a new contact (anonymous) with the id = oldid</li>
//#SWGNL#</ul>""")
class MUnmergeContactEvent extends MContactEvent with Serializable  {

	/**
	 * source contact id (contact to remove)
	 */
	//#SWG#@ApiModelProperty(value = """source contact id (contact to remove)""" ,required = true)
	@BeanProperty 
	var oldId: String =_
	def witholdId(p:String):MUnmergeContactEvent ={ 	this.oldId = p; 	this }

}
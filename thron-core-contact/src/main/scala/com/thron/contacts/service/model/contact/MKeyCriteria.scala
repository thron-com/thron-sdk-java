package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MKeyCriteria") 
@XmlType(name="MKeyCriteria")
//#SWG#@ApiModel(description = """""")
class MKeyCriteria extends Serializable {

	/**
	 * search text in key field.
	 * Searches all words (separated by spaces and in exact order)
	 */
	//#SWG#@ApiModelProperty(value = """search text in key field.
	//#SWGNL#Searches all words (separated by spaces and in exact order)""")
	@BeanProperty 
	var searchKey: String =_
	def withsearchKey(p:String):MKeyCriteria ={ 	this.searchKey = p; 	this }

}
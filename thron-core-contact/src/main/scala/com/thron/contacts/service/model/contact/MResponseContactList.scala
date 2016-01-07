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
@XmlRootElement(name="MResponseContactList") 
@XmlType(name="MResponseContactList")
//#SWG#@ApiModel(description = """""")
class MResponseContactList extends MResponseContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MContactDetail] = new ArrayList[MContactDetail]
	def withitems(p:List[MContactDetail]):MResponseContactList ={ 	this.items = p; 	this }

	/**
	 * Used to indicate if there are other results in the result set.
	 * TRUE if there are other items in the result.
	 * Increment the offset parameter to get more values.
	 */
	//#SWG#@ApiModelProperty(value = """Used to indicate if there are other results in the result set.
	//#SWGNL#TRUE if there are other items in the result. 
	//#SWGNL#Increment the offset parameter to get more values.""")
	@BeanProperty 
	var otherResults: Boolean =_
	def withotherResults(p:Boolean):MResponseContactList ={ 	this.otherResults = p; 	this }

}
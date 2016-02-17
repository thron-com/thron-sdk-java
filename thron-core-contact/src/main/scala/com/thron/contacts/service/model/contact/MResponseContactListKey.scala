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
@XmlRootElement(name="MResponseContactListKey") 
@XmlType(name="MResponseContactListKey")
//#SWG#@ApiModel(description = """""")
class MResponseContactListKey extends MResponseContact with Serializable  {

	/**
	 * key values
	 */
	//#SWG#@ApiModelProperty(value = """key values""")
	@BeanProperty 
	var items: List[String] = new ArrayList[String]
	def withitems(p:List[String]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}
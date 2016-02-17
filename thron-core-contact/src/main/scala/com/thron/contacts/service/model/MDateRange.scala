package com.thron.contacts.service.model
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
 * Date range class. [from, to]
 */
@XmlRootElement(name="MDateRange") 
@XmlType(name="MDateRange")
//#SWG#@ApiModel(description = """Date range class. [from, to]""")
class MDateRange extends Serializable {

	/**
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * 
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * </ul>
	 * (human readable) 2014-06-05T09:48:09.000Z
	 */
	//#SWG#@ApiModelProperty(value = """Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#</ul>
	//#SWGNL#(human readable) 2014-06-05T09:48:09.000Z""")
	@BeanProperty 
	var from: Date =_
	def withfrom(p:Date):this.type ={ 	this.from = p; 	this }

	/**
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * 
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * </ul>
	 * (human readable) 2014-06-05T09:48:09.000Z
	 */
	//#SWG#@ApiModelProperty(value = """Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#</ul>
	//#SWGNL#(human readable) 2014-06-05T09:48:09.000Z""")
	@BeanProperty 
	var to: Date =_
	def withto(p:Date):this.type ={ 	this.to = p; 	this }

}
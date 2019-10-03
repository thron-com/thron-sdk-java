package it.newvision.nvp.xcontents.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDateRange") 
@XmlType(name="MDateRange")
//#SWG#@ApiModel(description = """""")
class MDateRange extends Serializable {

	/**
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * 	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var from: Date =_
	def withfrom(p:Date):this.type ={ 	this.from = p; 	this }

	/**
	 * Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.
	 * SSSZ).
	 * Example:
	 * <ul>
	 * 	<li>(epoc) 1401961689000</li>
	 * 	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Epoc timestamp in milliseconds or human readable format (yyyy-MM-ddTHH:mm:ss.SSSZ). 
	//#SWGNL#Example: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>(epoc) 1401961689000</li>
	//#SWGNL#	<li>(human readable) "2014-06-05T09:48:09.000Z"</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var to: Date =_
	def withto(p:Date):this.type ={ 	this.to = p; 	this }

}
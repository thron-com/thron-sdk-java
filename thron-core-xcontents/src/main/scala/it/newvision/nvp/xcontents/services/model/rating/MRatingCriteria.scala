package it.newvision.nvp.xcontents.services.model.rating
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
 * main class used to define the Rating search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * The attributes with [0..*] cardinality are in OR clause.
 */
@XmlRootElement(name="MRatingCriteria") 
@XmlType(name="MRatingCriteria")
//#SWG#@ApiModel(description = """main class used to define the Rating search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#The attributes with [0..*] cardinality are in OR clause.""")
class MRatingCriteria extends Serializable {

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
	var fromDate: Date =_
	def withfromDate(p:Date):MRatingCriteria ={ 	this.fromDate = p; 	this }

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
	var toDate: Date =_
	def withtoDate(p:Date):MRatingCriteria ={ 	this.toDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MRatingCriteria ={ 	this.userId = p; 	this }

}
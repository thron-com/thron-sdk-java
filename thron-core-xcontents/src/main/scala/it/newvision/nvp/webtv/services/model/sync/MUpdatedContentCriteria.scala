package it.newvision.nvp.webtv.services.model.sync
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
 * <b>Constraints: </b>
 * <ul>
 * 	<li>fromDate not older than 2 Months ago</li>
 * 	<li>toDate > fromDate</li>
 * 	<li>linkedCategoryOp.linkedCategoryIds: max number of elements 50 (when
 * cascade is true)</li>
 * </ul>
 */
@XmlRootElement(name="MUpdatedContentCriteria") 
@XmlType(name="MUpdatedContentCriteria")
//#SWG#@ApiModel(description = """<b>Constraints: </b>
//#SWGNL#<ul>
//#SWGNL#	<li>fromDate not older than 2 Months ago</li>
//#SWGNL#	<li>toDate > fromDate</li>
//#SWGNL#	<li>linkedCategoryOp.linkedCategoryIds: max number of elements 50 (when cascade is true)</li>
//#SWGNL#</ul>""")
class MUpdatedContentCriteria extends MSyncExportCriteria with Serializable  {

	/**
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>at most 2 months ago</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>at most 2 months ago</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>toDate > fromDate</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>toDate > fromDate</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid2():Boolean ={
		import org.apache.commons.lang.time.DateUtils
		this.isValid() && Option(fromDate).exists(f=> f.after(DateUtils.addMonths(new Date, -2)))
	}

}
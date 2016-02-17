package it.newvision.nvp.xcontents.services.model.liveEvent
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
 * all the values passed in input overwrite the values in the platform.
 */
@XmlRootElement(name="MLiveEventUpdate") 
@XmlType(name="MLiveEventUpdate")
//#SWG#@ApiModel(description = """all the values passed in input overwrite the values in the platform.""")
class MLiveEventUpdate extends Serializable {

	/**
	 * the scheduled start date of the event in the calendar
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled start date of the event in the calendar""")
	@BeanProperty 
	var startDate: Date =_
	def withstartDate(p:Date):this.type ={ 	this.startDate = p; 	this }

	/**
	 * the scheduled end date of the event in the calendar
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled end date of the event in the calendar""")
	@BeanProperty 
	var endDate: Date =_
	def withendDate(p:Date):this.type ={ 	this.endDate = p; 	this }

	/**
	 * the scheduled length of the event
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled length of the event""")
	@BeanProperty 
	var length: Long =_
	def withlength(p:Long):this.type ={ 	this.length = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(endDate).forall(_.after(Option(startDate).getOrElse(new Date(0))))
	}

}
package it.newvision.nvp.xcontents.services.model.liveEvent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MELiveEventStatus
import it.newvision.nvp.xcontents.services.model.content.MContentCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * LowerBoundDate and upperBoundDate are used to filter all live events that are
 * SCHEDULED inside the date range.
 */
@XmlRootElement(name="MLiveEventCriteria") 
@XmlType(name="MLiveEventCriteria")
//#SWG#@ApiModel(description = """LowerBoundDate and upperBoundDate are used to filter all live events that are SCHEDULED inside the date range.""")
class MLiveEventCriteria extends MContentCriteria with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lowerBoundDate: Date =_
	def withlowerBoundDate(p:Date):MLiveEventCriteria ={ 	this.lowerBoundDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var upperBoundDate: Date =_
	def withupperBoundDate(p:Date):MLiveEventCriteria ={ 	this.upperBoundDate = p; 	this }

	/**
	 * used to distinguish h24 live events by the spot events.
	 */
	//#SWG#@ApiModelProperty(value = """used to distinguish h24 live events by the spot events.""")
	@BeanProperty 
	var neverEndingLiveEvent: Boolean =_
	def withneverEndingLiveEvent(p:Boolean):MLiveEventCriteria ={ 	this.neverEndingLiveEvent = p; 	this }

	/**
	 * the current status of the event
	 */
	//#SWG#@ApiModelProperty(value = """the current status of the event""")
	@BeanProperty 
	var eventStatus: MELiveEventStatus =_
	def witheventStatus(p:MELiveEventStatus):MLiveEventCriteria ={ 	this.eventStatus = p; 	this }

}
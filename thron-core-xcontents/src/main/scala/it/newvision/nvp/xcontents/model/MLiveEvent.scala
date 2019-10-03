package it.newvision.nvp.xcontents.model
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
 * Live Feed Event. Used to archive the special contents as live events.
 * Usually a 4me Live feed has a time range of one or more days.
 */
@XmlRootElement(name="MLiveEvent") 
@XmlType(name="MLiveEvent")
//#SWG#@ApiModel(description = """Live Feed Event. Used to archive the special contents as live events. 
//#SWGNL#Usually a 4me Live feed has a time range of one or more days.""")
class MLiveEvent extends MContent with Serializable  {

	/**
	 * the scheduled finish time of the event.
	 * The attribute is linked to the MContent.inactiveDate field
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled finish time of the event.
	//#SWGNL#The attribute is linked to the MContent.inactiveDate field""")
	@BeanProperty 
	var endDate: Date =_
	def withendDate(p:Date):this.type ={ 	this.endDate = p; 	this }

	/**
	 * the real or scheduled end time of the event
	 */
	//#SWG#@ApiModelProperty(value = """the real or scheduled end time of the event""")
	@BeanProperty 
	var eventEnded: Date =_
	def witheventEnded(p:Date):this.type ={ 	this.eventEnded = p; 	this }

	/**
	 * The scheduled length of the event
	 */
	//#SWG#@ApiModelProperty(value = """The scheduled length of the event""")
	@BeanProperty 
	var eventLength: Long =_
	def witheventLength(p:Long):this.type ={ 	this.eventLength = p; 	this }

	/**
	 * the real start time of the event
	 */
	//#SWG#@ApiModelProperty(value = """the real start time of the event""")
	@BeanProperty 
	var eventStarted: Date =_
	def witheventStarted(p:Date):this.type ={ 	this.eventStarted = p; 	this }

	/**
	 * used to distinguish h24 live events by the spot events.
	 */
	//#SWG#@ApiModelProperty(value = """used to distinguish h24 live events by the spot events.""" ,required = true)
	@BeanProperty 
	var neverEndingLiveEvent: Boolean  = false
	def withneverEndingLiveEvent(p:Boolean):this.type ={ 	this.neverEndingLiveEvent = p; 	this }

	/**
	 * the scheduled start time of the event in the calendar
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled start time of the event in the calendar""")
	@BeanProperty 
	var startDate: Date =_
	def withstartDate(p:Date):this.type ={ 	this.startDate = p; 	this }

	/**
	 * @return MELiveEventStatus
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def calculateEventStatus():MELiveEventStatus ={
		if(Option(this.startDate).isEmpty && Option(this.eventStarted).isEmpty){
		  MELiveEventStatus.DRAFT
		}else if(Option(this.startDate).isDefined && Option(this.eventStarted).isEmpty){
		  MELiveEventStatus.SCHEDULED
		} else if(Option(this.eventStarted).isDefined &&
			  Option(this.eventEnded).isEmpty &&
			  this.eventStarted.before(new Date) ){
		  MELiveEventStatus.ON_AIR
		}else if(Option(this.eventStarted).isDefined && 
			 Option(this.eventEnded).isDefined &&
			 this.eventEnded.before(new Date)){
		  MELiveEventStatus.CLOSED
		} else{
		MELiveEventStatus.DRAFT
		}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		getContentType == MEContentType.LIVEEVENT&&
		Option(endDate).forall(_.after(Option(startDate).getOrElse(new Date(0))))
	}

}
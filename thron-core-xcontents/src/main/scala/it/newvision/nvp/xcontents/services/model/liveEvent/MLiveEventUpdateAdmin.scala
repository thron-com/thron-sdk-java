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
@XmlRootElement(name="MLiveEventUpdateAdmin") 
@XmlType(name="MLiveEventUpdateAdmin")
//#SWG#@ApiModel(description = """all the values passed in input overwrite the values in the platform.""")
class MLiveEventUpdateAdmin extends Serializable {

	/**
	 * used to distinguish h24 live events by the spot events.
	 */
	//#SWG#@ApiModelProperty(value = """used to distinguish h24 live events by the spot events.""")
	@BeanProperty 
	var neverEndingLiveEvent: Boolean =_
	def withneverEndingLiveEvent(p:Boolean):MLiveEventUpdateAdmin ={ 	this.neverEndingLiveEvent = p; 	this }

	/**
	 * the scheduled start date of the event in the calendar
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled start date of the event in the calendar""")
	@BeanProperty 
	var eventStarted: Date =_
	def witheventStarted(p:Date):MLiveEventUpdateAdmin ={ 	this.eventStarted = p; 	this }

	/**
	 * the scheduled end date of the event in the calendar
	 */
	//#SWG#@ApiModelProperty(value = """the scheduled end date of the event in the calendar""")
	@BeanProperty 
	var eventEnded: Date =_
	def witheventEnded(p:Date):MLiveEventUpdateAdmin ={ 	this.eventEnded = p; 	this }

}
package it.newvision.nvp.xcontents.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
//#SWG#import com.wordnik.swagger.annotations._

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * DEPRECATED
 */
@XmlType(name="MELiveEventStatus") 
@XmlEnum
//#SWG#@ApiModel(description = """DEPRECATED""")
public enum MELiveEventStatus {
	/**
	 * the event has not been scheduled.
	 * startDate = null and eventStartTime = null
	 */
	//#SWG#@ApiModelProperty(value = """the event has not been scheduled. 
	//#SWGNL#startDate = null and eventStartTime = null""")
	@XmlEnumValue("DRAFT") DRAFT,
	/**
	 * the event is not started but has been scheduled in the calendar.
	 * startDate != null and eventStartTime = null
	 */
	//#SWG#@ApiModelProperty(value = """the event is not started but has been scheduled in the calendar.
	//#SWGNL#startDate != null and eventStartTime = null""")
	@XmlEnumValue("SCHEDULED") SCHEDULED,
	/**
	 * the live event is on air.
	 * eventStartTime < Now < eventEndTime
	 */
	//#SWG#@ApiModelProperty(value = """the live event is on air.
	//#SWGNL#eventStartTime < Now < eventEndTime""")
	@XmlEnumValue("ON_AIR") ON_AIR,
	/**
	 * The live event is ended
	 * eventEndTime < Now
	 */
	//#SWG#@ApiModelProperty(value = """The live event is ended
	//#SWGNL#eventEndTime < Now""")
	@XmlEnumValue("CLOSED") CLOSED
}
package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishLiveEventParams") 
@XmlType(name="MPublishLiveEventParams")
//#SWG#@ApiModel(description = """""")
class MPublishLiveEventParams extends Serializable {

	/**
	 * the content metadata, like name and description in the specified locale. If the
	 * ContentDescription is null, the platform create a content description for the
	 * default locale assigning as content title the source filename.
	 */
	//#SWG#@ApiModelProperty(value = """the content metadata, like name and description in the specified locale. If the ContentDescription is null, the platform create a content description for the default locale assigning as content title the source filename.""")
	@BeanProperty 
	var content: MContentDescription =_
	def withcontent(p:MContentDescription):this.type ={ 	this.content = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""")
	@BeanProperty 
	var endDate: Date =_
	def withendDate(p:Date):this.type ={ 	this.endDate = p; 	this }

	/**
	 * used to distinguish h24 live events by the spot events.
	 */
	//#SWG#@ApiModelProperty(value = """used to distinguish h24 live events by the spot events.""")
	@BeanProperty 
	var neverEndingLiveEvent: Boolean  = false
	def withneverEndingLiveEvent(p:Boolean):this.type ={ 	this.neverEndingLiveEvent = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var recordEvent: Boolean =_
	def withrecordEvent(p:Boolean):this.type ={ 	this.recordEvent = p; 	this }

	/**
	 * Optional. If start date could be set to "Now" or the event could not be
	 * scheduled
	 */
	//#SWG#@ApiModelProperty(value = """Optional. If start date could be set to "Now" or the event could not be scheduled""")
	@BeanProperty 
	var startDate: Date =_
	def withstartDate(p:Date):this.type ={ 	this.startDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var startNow: Boolean  = false
	def withstartNow(p:Boolean):this.type ={ 	this.startNow = p; 	this }

	/**
	 * the name of the stream in output.
	 * Only unicode letters or digits are allowed
	 */
	//#SWG#@ApiModelProperty(value = """the name of the stream in output. 
	//#SWGNL#Only unicode letters or digits are allowed""" ,required = true)
	@BeanProperty 
	var streamName: String =_
	def withstreamName(p:String):this.type ={ 	this.streamName = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
	
		StringUtils.isNotBlank(streamName)&&
		StringUtils.isAlphanumeric(streamName)&&
		Option(endDate).forall(_.after(Option(startDate).getOrElse(new Date(0))))
	}

}
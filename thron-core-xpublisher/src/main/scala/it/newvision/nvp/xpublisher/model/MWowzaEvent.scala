package it.newvision.nvp.xpublisher.model
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
 * available applications are:
 * <ul>
 * 	<li>inlive (default)</li>
 * 	<li>live</li>
 * 	<li>preview</li>
 * </ul>
 * 
 * appInstance = clientId
 */
@XmlRootElement(name="MWowzaEvent") 
@XmlType(name="MWowzaEvent")
//#SWG#@ApiModel(description = """available applications are:
//#SWGNL#<ul>
//#SWGNL#	<li>inlive (default)</li>
//#SWGNL#	<li>live</li>
//#SWGNL#	<li>preview</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#appInstance = clientId""")
class MWowzaEvent extends Serializable {

	/**
	 * the name of the event stream
	 */
	//#SWG#@ApiModelProperty(value = """the name of the event stream""" ,required = true)
	@BeanProperty 
	var streamName: String =_
	def withstreamName(p:String):this.type ={ 	this.streamName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var hostInfo: MHostInfo =_
	def withhostInfo(p:MHostInfo):this.type ={ 	this.hostInfo = p; 	this }

	/**
	 * the real stat time of the event
	 */
	//#SWG#@ApiModelProperty(value = """the real stat time of the event""")
	@BeanProperty 
	var validFrom: Date =_
	def withvalidFrom(p:Date):this.type ={ 	this.validFrom = p; 	this }

	/**
	 * the real / scheduled end time of the event
	 */
	//#SWG#@ApiModelProperty(value = """the real / scheduled end time of the event""")
	@BeanProperty 
	var validTo: Date =_
	def withvalidTo(p:Date):this.type ={ 	this.validTo = p; 	this }

	/**
	 * used to distinguish h24 live events by the spot events.
	 */
	//#SWG#@ApiModelProperty(value = """used to distinguish h24 live events by the spot events.""" ,required = true)
	@BeanProperty 
	var neverEndingLiveEvent: Boolean  = false
	def withneverEndingLiveEvent(p:Boolean):this.type ={ 	this.neverEndingLiveEvent = p; 	this }

	/**
	 * the list of recorded video files of the event
	 */
	//#SWG#@ApiModelProperty(value = """the list of recorded video files of the event""")
	@BeanProperty 
	var recordedFileNames: List[String] = new ArrayList[String]
	def withrecordedFileNames(p:List[String]):this.type ={ 	this.recordedFileNames = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var confData: MWowzaEventConfData  = new MWowzaEventConfData
	def withconfData(p:MWowzaEventConfData):this.type ={ 	this.confData = p; 	this }

	/**
	 * @param streamName : String
	 * @param neverEndingLiveEvent : Boolean
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(streamName: String, 
			neverEndingLiveEvent: Boolean){
		this()
		this.streamName = streamName
		this.neverEndingLiveEvent = neverEndingLiveEvent
	}

	/**
	 * @return MEWowzaEventStatus
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def status():MEWowzaEventStatus ={
		MEWowzaEventStatus.DRAFT
	}

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getNextFileName():String ={
		def nextfile(filename: String,suffix:Integer): String = {
		  import scala.collection.JavaConversions._
		  val sufx :Integer= Option(suffix).getOrElse(1)
		  val newFileName = filename+"_"+sufx
		  if (this.recordedFileNames.exists(f=> f == newFileName)) {
			nextfile(filename,1+sufx.intValue())
		  } else {
			newFileName
		  }
		}
		nextfile("live_"+this.streamName,1)
	}

}
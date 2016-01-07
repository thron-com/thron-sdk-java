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
 * Used to store the Wowza event setup data necessary to restore or restart a live
 * event.
 */
@XmlRootElement(name="MWowzaEventConfData") 
@XmlType(name="MWowzaEventConfData")
//#SWG#@ApiModel(description = """Used to store the Wowza event setup data necessary to restore or restart a live event.""")
class MWowzaEventConfData extends Serializable {

	/**
	 * list of clients and password configured in the wowza server
	 */
	//#SWG#@ApiModelProperty(value = """list of clients and password configured in the wowza server""")
	@BeanProperty 
	var clientStreamsWithPassword: List[MWowzaStreamCredential] = new ArrayList[MWowzaStreamCredential]
	def withclientStreamsWithPassword(p:List[MWowzaStreamCredential]):MWowzaEventConfData ={ 	this.clientStreamsWithPassword = p; 	this }

	/**
	 * The client stream currently publishing.
	 */
	//#SWG#@ApiModelProperty(value = """The client stream currently publishing.""")
	@BeanProperty 
	var clientStreamInMuxing: String =_
	def withclientStreamInMuxing(p:String):MWowzaEventConfData ={ 	this.clientStreamInMuxing = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var startRecordingOnPublish: Boolean =_
	def withstartRecordingOnPublish(p:Boolean):MWowzaEventConfData ={ 	this.startRecordingOnPublish = p; 	this }

	/**
	 * the current video files used to record the event.
	 */
	//#SWG#@ApiModelProperty(value = """the current video files used to record the event.""")
	@BeanProperty 
	var recordingFileName: String =_
	def withrecordingFileName(p:String):MWowzaEventConfData ={ 	this.recordingFileName = p; 	this }

	/**
	 * DEPRECATED. generated by wowza media server
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED. generated by wowza media server""")
	@BeanProperty 
	var wowzaEventId: String =_
	def withwowzaEventId(p:String):MWowzaEventConfData ={ 	this.wowzaEventId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var previewStream: String =_
	def withpreviewStream(p:String):MWowzaEventConfData ={ 	this.previewStream = p; 	this }

}
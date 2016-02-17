package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MServerLiveEventDetail") 
@XmlType(name="MServerLiveEventDetail")
//#SWG#@ApiModel(description = """""")
class MServerLiveEventDetail extends Serializable {

	/**
	 * the Application Instance
	 */
	//#SWG#@ApiModelProperty(value = """the Application Instance""" ,required = true)
	@BeanProperty 
	var appInstance: String =_
	def withappInstance(p:String):this.type ={ 	this.appInstance = p; 	this }

	/**
	 * the list of cilentStreams and passwords
	 */
	//#SWG#@ApiModelProperty(value = """the list of cilentStreams and passwords""")
	@BeanProperty 
	var clientStreamsAndPasswords: List[MServerStreamCredential] = new ArrayList[MServerStreamCredential]
	def withclientStreamsAndPasswords(p:List[MServerStreamCredential]):this.type ={ 	this.clientStreamsAndPasswords = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientStreamInMuxing: String =_
	def withclientStreamInMuxing(p:String):this.type ={ 	this.clientStreamInMuxing = p; 	this }

	/**
	 * the name of the main server Stream of the live Event
	 */
	//#SWG#@ApiModelProperty(value = """the name of the main server Stream of the live Event""" ,required = true)
	@BeanProperty 
	var serverStream: String =_
	def withserverStream(p:String):this.type ={ 	this.serverStream = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var serverStreamNeedsToBeRecorded: Boolean =_
	def withserverStreamNeedsToBeRecorded(p:Boolean):this.type ={ 	this.serverStreamNeedsToBeRecorded = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var serverStreamIsRecording: Boolean =_
	def withserverStreamIsRecording(p:Boolean):this.type ={ 	this.serverStreamIsRecording = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var recordingFileName: String =_
	def withrecordingFileName(p:String):this.type ={ 	this.recordingFileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var previewStream: String =_
	def withpreviewStream(p:String):this.type ={ 	this.previewStream = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var serverStreamIsBeingPublished: Boolean =_
	def withserverStreamIsBeingPublished(p:Boolean):this.type ={ 	this.serverStreamIsBeingPublished = p; 	this }

	/**
	 * epoc date in milliseconds
	 */
	//#SWG#@ApiModelProperty(value = """epoc date in milliseconds""")
	@BeanProperty 
	var validFrom: Long =_
	def withvalidFrom(p:Long):this.type ={ 	this.validFrom = p; 	this }

	/**
	 * epoc date in milliseconds
	 */
	//#SWG#@ApiModelProperty(value = """epoc date in milliseconds""")
	@BeanProperty 
	var validTo: Long =_
	def withvalidTo(p:Long):this.type ={ 	this.validTo = p; 	this }

	/**
	 * @param hostname : String
	 * @param application : String
	 * @param clientId : String
	 * @return MServerLiveEventDetail
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def initClientStreamsUrls(hostname: String, 
			application: String, 
			clientId: String):MServerLiveEventDetail ={
		// rtmp://hostname/inlive/clientId?clientStream=password
		import scala.collection.JavaConversions._
		this.clientStreamsAndPasswords.foreach{ cs=>
		  cs.clientStreamUrl = "rtmp://"+hostname+"/"+application+"/"+clientId+"?"+cs.streamId+"="+cs.streamPassword
		}
		this
	}

}
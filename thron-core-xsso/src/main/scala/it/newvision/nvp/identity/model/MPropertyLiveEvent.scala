package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPropertyLiveEvent") 
@XmlType(name="MPropertyLiveEvent")
//#SWG#@ApiModel(description = """""")
class MPropertyLiveEvent extends Serializable {

	/**
	 * LIVESTREAMFLASH,
	 * LIVESTREAMIOS,
	 * LIVESTREAMMS,
	 * LIVESTREAMRTMP
	 */
	//#SWG#@ApiModelProperty(value = """LIVESTREAMFLASH, 
	//#SWGNL#LIVESTREAMIOS, 
	//#SWGNL#LIVESTREAMMS,
	//#SWGNL#LIVESTREAMRTMP""" ,required = true)
	@BeanProperty 
	var channelType: String  = "STREAM"
	def withchannelType(p:String):MPropertyLiveEvent ={ 	this.channelType = p; 	this }

	/**
	 * http://<mydomain>/liveservice/....
	 */
	//#SWG#@ApiModelProperty(value = """http://<mydomain>/liveservice/....""" ,required = true)
	@BeanProperty 
	var liveEventApp: String  = "live/"
	def withliveEventApp(p:String):MPropertyLiveEvent ={ 	this.liveEventApp = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var channelDescriptions: List[MChannelDescription] = new ArrayList[MChannelDescription]
	def withchannelDescriptions(p:List[MChannelDescription]):MPropertyLiveEvent ={ 	this.channelDescriptions = p; 	this }

	/**
	 * rtmpe, rtmp, http
	 */
	//#SWG#@ApiModelProperty(value = """rtmpe, rtmp, http""" ,required = true)
	@BeanProperty 
	var protocol: String  = "rtmpe"
	def withprotocol(p:String):MPropertyLiveEvent ={ 	this.protocol = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var thumbsProperties: MPropertyThumbnail  = new MPropertyThumbnail
	@Deprecated
	def withthumbsProperties(p:MPropertyThumbnail):MPropertyLiveEvent ={ 	this.thumbsProperties = p; 	this }

	/**
	 * define if the channel is enabled or not. Used to keep the channel settings but
	 * disable the user to publish new contents in the current channel
	 */
	//#SWG#@ApiModelProperty(value = """define if the channel is enabled or not. Used to keep the channel settings but disable the user to publish new contents in the current channel""" ,required = true)
	@BeanProperty 
	var channelEnabled: Boolean  = true
	def withchannelEnabled(p:Boolean):MPropertyLiveEvent ={ 	this.channelEnabled = p; 	this }

	/**
	 * this attribute specify that the channel is compliant with a specific 4me
	 * solution, so the contents published in this channels can be used by the
	 * Solution. The attribute has comma separeted values.
	 * possibile entries:VIEW,PLAY,MOVE,TALK
	 */
	//#SWG#@ApiModelProperty(value = """this attribute specify that the channel is compliant with a specific 4me solution, so the contents published in this channels can be used by the Solution. The attribute has comma separeted values.
	//#SWGNL#possibile entries:VIEW,PLAY,MOVE,TALK""" ,required = true)
	@BeanProperty 
	var compliantWith: String  = "VIEW"
	def withcompliantWith(p:String):MPropertyLiveEvent ={ 	this.compliantWith = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(clientId: String){

	}

	/**
	 * default init for STREAM channel to use for PREVIEW
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMRTMPFORPREVIEW(clientId: String){
		this.channelType = "STREAMRTMPFORPREVIEW"
		this.liveEventApp = "live/"
		this.protocol = "rtmp://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "RTMP Preview"
		cd.channelDescription = "Flash RTMP Streaming per Preview"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "RTMP"
		cd2.channelDescription = "Flash RTMP Streaming for Preview"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPFLASH(clientId: String){
		this.channelType = "STREAMHTTPFLASH"
		this.liveEventApp = "live/"
		this.protocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Flash"
		cd.channelDescription = "HTTP Dynamic Streaming Flash "
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Flash"
		cd2.channelDescription = "HTTP Dynamic Streaming Flash"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS(clientId: String){
		this.channelType = "STREAMHTTPIOS"
		this.liveEventApp = "live/"
		this.protocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "iOS"
		cd.channelDescription = "HTTP Dynamic Streaming per Apple devices"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "iOS"
		cd2.channelDescription = "HTTP Dynamic Streaming for Apple devices"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

}
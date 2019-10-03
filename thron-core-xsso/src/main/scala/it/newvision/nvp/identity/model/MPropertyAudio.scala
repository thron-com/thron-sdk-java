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
/**
 * This property is used to configure the Audio ingestion from MP3 to FLV
 * (necessary for audio progressive download).
 * Usually the mp3 audio files do not need to be converted and can be
 * automatically published in Weebo.
 */
@XmlRootElement(name="MPropertyAudio") 
@XmlType(name="MPropertyAudio")
//#SWG#@ApiModel(description = """This property is used to configure the Audio ingestion from MP3 to FLV (necessary for audio progressive download).
//#SWGNL#Usually the mp3 audio files do not need to be converted and can be automatically published in Weebo.""")
class MPropertyAudio extends MPropertyGenericDocument with Serializable  {

	/**
	 * Control the volume for your audio output as a percentage of source video: 1-100.
	 */
	//#SWG#@ApiModelProperty(value = """Control the volume for your audio output as a percentage of source video: 1-100.""" ,required = true)
	@BeanProperty 
	var audioOutputPercentage: Integer  = 100
	def withaudioOutputPercentage(p:Integer):this.type ={ 	this.audioOutputPercentage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var bitRate: Integer  = 128
	def withbitRate(p:Integer):this.type ={ 	this.bitRate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var codec: String  = "MP3"
	def withcodec(p:String):this.type ={ 	this.codec = p; 	this }

	/**
	 * range value: [0..100]. Suggested value if present is 85.
	 * Used to bring the average or peak amplitude to a target level. 
	 */
	//#SWG#@ApiModelProperty(value = """range value: [0..100]. Suggested value if present is 85.
	//#SWGNL#Used to bring the average or peak amplitude to a target level. """ ,required = true)
	@BeanProperty 
	var normalization: Integer  = 0
	def withnormalization(p:Integer):this.type ={ 	this.normalization = p; 	this }

	/**
	 * Control the audio sampling frequency in (Hz) for your audio output.
	 */
	//#SWG#@ApiModelProperty(value = """Control the audio sampling frequency in (Hz) for your audio output.""" ,required = true)
	@BeanProperty 
	var sampleRate: Integer  = 44100
	def withsampleRate(p:Integer):this.type ={ 	this.sampleRate = p; 	this }

	/**
	 * default init for STREAM iOS channel
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS(client: MClient){
		this.init_gd_WEB(client,"STREAMHTTPIOS")
		this.streamProtocol = "https://"
		this.bitRate = 96
		this.sampleRate = 44100
		this.convertTo = "TS"
		this.codec = "AAC"
		this.withIngestion= true
		this.appName = "ios/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Streaming HLS"
		cd.channelDescription = "HDS, codec aac, bitrate 128kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Streaming HLS"
		cd2.channelDescription = "HDS, codec aac, bitrate 128kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_test(clientId: String){
		this.init_gd_test(clientId,"STREAM")
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "FLV"
		this.codec = "MP3"
		this.appName = "flash/"
	}

	/**
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(client: MClient){
		this.init_gd_WEB(client, "WEB")
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion= true
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "MP3"
		cd.channelDescription = "Download, codec mp3, bitrate 128kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "MP3"
		cd2.channelDescription = "Download, codec mp3, bitrate 128kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	
	}

	/**
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBAUDIO(client: MClient){
		this.init_gd_WEB(client, "WEB")
		this.bitRate = 128
		this.sampleRate = 16000
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion= true
		this.compliantWith= "VIEW"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "MP3 (16000 samplerate)"
		cd.channelDescription = "Download, codec mp3, bitrate 128kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "MP3 (1600 samplerate)"
		cd2.channelDescription = "Download, codec mp3, bitrate 128kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	
	}

	/**
	 * default init for WEBORIGINAL channel (Progressive Download Original Content)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBORIGINAL(client: MClient){
		this.init_gd_WEBORIGINAL(client)
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion = false
		this.useForDownload = true
	}

}
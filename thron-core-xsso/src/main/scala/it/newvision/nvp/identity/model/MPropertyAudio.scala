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
	 * Control the audio sampling frequency in (Hz) for your audio output.
	 */
	//#SWG#@ApiModelProperty(value = """Control the audio sampling frequency in (Hz) for your audio output.""" ,required = true)
	@BeanProperty 
	var sampleRate: Integer  = 44100
	def withsampleRate(p:Integer):this.type ={ 	this.sampleRate = p; 	this }

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
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMRTMP(clientId: String){
		this.init_gd_WEB(clientId,"STREAMRTMP")
		this.streamProtocol = "rtmp://"
		this.streamServer = clientId+"-stream4me.weebo.it/"
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.appName = "aod/"
		this.withIngestion= true
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "RTMP"
		cd.channelDescription = "Flash Streaming in tecnologia RTMP"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "RTMP"
		cd2.channelDescription = "Flash Streaming with RTMP"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="MP3"
		this.withIngestion=true
	}

	/**
	 * default init for STREAMWEB channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMRTMPWEB(clientId: String){
		this.init_gd_WEB(clientId,"STREAMRTMPWEB")
		this.streamProtocol = "rtmp://"
		this.streamServer = clientId+"-stream4me.weebo.it/"
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "FLV"
		this.codec = "MP3"
		this.appName = "web/"
		this.withIngestion= true
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "RTMP progressive"
		cd.channelDescription = "Flash Streaming e download progressivo"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "RTMP progressive"
		cd2.channelDescription = "Flash Streaming and progressive download"
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
		this.init_gd_WEB(clientId, "STREAMHTTPFLASH")
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "AAC"
		this.codec = "AAC"
		this.appName = "flash/"
		this.withIngestion= true
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Flash"
		cd.channelDescription = "HTTP Streaming per web e Android devices"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Flash"
		cd2.channelDescription = "HTTP Streaming for web and Android devices"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * default init for STREAM iOS channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPIOS")
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		this.bitRate = 96
		this.sampleRate = 44100
		this.convertTo = "TS"
		this.codec = "AAC"
		this.withIngestion= true
		this.appName = "ios/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "iOS"
		cd.channelDescription = "HTTP Streaming per Apple devices"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "iOS"
		cd2.channelDescription = "HTTP Streaming for Apple devices"
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
	def init_STREAMHTTPMS(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPMS")
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion= true
		this.appName = "ms/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Microsoft"
		cd.channelDescription = "HTTP Streaming per Windows mobile devices"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Microsoft"
		cd2.channelDescription = "HTTP Streaming for Windows mobile devices"
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
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String){
		this.init_gd_WEB(clientId, "WEB")
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion= true
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download"
		cd2.channelDescription = "The user can download a content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBAUDIO(clientId: String){
		this.init_gd_WEB(clientId, "WEB")
		this.bitRate = 128
		this.sampleRate = 16000
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion= true
		this.compliantWith= "VIEW"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download"
		cd2.channelDescription = "The user can download a content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBM(clientId: String){
		this.init_gd_WEB(clientId, "WEBM")
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "VORBIS"
		this.codec = "vorbis"
		this.withIngestion= true
		this.compliantWith= "VIEW"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download WebM"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto in formato WebM"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download WebM"
		cd2.channelDescription = "The user can download a content in WebM format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	
	}

	/**
	 * default init for WEBORIGINAL channel (Progressive Download Original Content)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBORIGINAL(clientId: String){
		this.init_gd_WEBORIGINAL(clientId)
		this.bitRate = 128
		this.sampleRate = 44100
		this.convertTo = "MP3"
		this.codec = "MP3"
		this.withIngestion = false
		this.useForDownload = true
	}

}
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
 * Set of properties for the VOD service. Are used to configure the VOD (FMS) ,
 * IPhone or other services.
 */
@XmlRootElement(name="MPropertyStream") 
@XmlType(name="MPropertyStream")
//#SWG#@ApiModel(description = """Set of properties for the VOD service. Are used to configure the VOD (FMS) , IPhone or other services.""")
class MPropertyStream extends MPropertyGenericDocument with Serializable  {

	/**
	 * new java.util.ArrayList[Integer](java.util.Arrays.asList(<font
	 * color="#0000ff">700,400,150,48</font>))
	 */
	//#SWG#@ApiModelProperty(value = """new java.util.ArrayList[Integer](java.util.Arrays.asList(<font color="#0000ff">700,400,150,48</font>))""")
	@BeanProperty 
	var videoBitRates: List[Integer] = new ArrayList[Integer]
	def withvideoBitRates(p:List[Integer]):this.type ={ 	this.videoBitRates = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var audioBitRates: List[Integer] = new ArrayList[Integer]
	def withaudioBitRates(p:List[Integer]):this.type ={ 	this.audioBitRates = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalBitRates: List[Integer] = new ArrayList[Integer]
	def withtotalBitRates(p:List[Integer]):this.type ={ 	this.totalBitRates = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defaultBitRate: Integer  = 512
	def withdefaultBitRate(p:Integer):this.type ={ 	this.defaultBitRate = p; 	this }

	/**
	 * new java.util.ArrayList[Integer](java.util.Arrays.asList(<font
	 * color="#0000ff">700,400,150,48</font>))
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sampleRates: List[Integer] = new ArrayList[Integer]
	def withsampleRates(p:List[Integer]):this.type ={ 	this.sampleRates = p; 	this }

	/**
	 * vp6, h264
	 */
	//#SWG#@ApiModelProperty(value = """vp6, h264""" ,required = true)
	@BeanProperty 
	var codec: String  = "h264"
	def withcodec(p:String):this.type ={ 	this.codec = p; 	this }

	/**
	 * in seconds
	 */
	//#SWG#@ApiModelProperty(value = """in seconds""" ,required = true)
	@BeanProperty 
	var previewLength: Integer  = 15
	def withpreviewLength(p:Integer):this.type ={ 	this.previewLength = p; 	this }

	/**
	 * defined in seconds
	 */
	//#SWG#@ApiModelProperty(value = """defined in seconds""" ,required = true)
	@BeanProperty 
	@Deprecated
	var thumbFrameTime: Integer  = 10
	@Deprecated
	def withthumbFrameTime(p:Integer):this.type ={ 	this.thumbFrameTime = p; 	this }

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
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(980),Integer.valueOf(630),Integer.valueOf(400),Integer.valueOf(200),Integer.valueOf(121)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(100),Integer.valueOf(90),Integer.valueOf(60),Integer.valueOf(30),Integer.valueOf(14)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512),Integer.valueOf(256),Integer.valueOf(150)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(22050)))
		this.defaultBitRate = 800
		this.appName = "vod/"
		this.streamProtocol = "rtmp://"
		this.streamServer = clientId+"-stream4me.weebo.it/"
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
		this.convertTo="MP4"
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
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(980),Integer.valueOf(630),Integer.valueOf(400),Integer.valueOf(200),Integer.valueOf(121)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(100),Integer.valueOf(90),Integer.valueOf(60),Integer.valueOf(30),Integer.valueOf(14)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512),Integer.valueOf(256),Integer.valueOf(150)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(22050)))
		this.defaultBitRate = 800
		this.appName = "web/"
		this.streamProtocol = "rtmp://"
		this.streamServer = clientId+"-stream4me.weebo.it/"
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
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPFLASH(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPFLASH")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(680),Integer.valueOf(280),Integer.valueOf(140)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800),Integer.valueOf(400),Integer.valueOf(256)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.appName = "flash/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
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
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for STREAM FULL HD channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPFLASHFULLHD(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPFLASHFULLHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4300),Integer.valueOf(2800),Integer.valueOf(1800),Integer.valueOf(1400),Integer.valueOf(1020),Integer.valueOf(680),Integer.valueOf(280),Integer.valueOf(140)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4500),Integer.valueOf(3000),Integer.valueOf(2000),Integer.valueOf(1600),Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(400),Integer.valueOf(256)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.appName = "flash/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Flash FULLHD"
		cd.channelDescription = "HTTP Dynamic Streaming Flash FULLHD"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Flash FULLHD"
		cd2.channelDescription = "HTTP Dynamic Streaming Flash FULLHD"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPFLASHHD(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPFLASHHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1800),Integer.valueOf(1400),Integer.valueOf(1020),Integer.valueOf(680),Integer.valueOf(280),Integer.valueOf(140)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(2000),Integer.valueOf(1600),Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(400),Integer.valueOf(256)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.appName = "flash/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Flash HD"
		cd.channelDescription = "HTTP Dynamic Streaming Flash HD"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Flash HD"
		cd2.channelDescription = "HTTP Dynamic Streaming Flash HD"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPIOS")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(604),Integer.valueOf(380)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
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
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOSHD(clientId: String){
		this.init_gd_WEB(clientId,"STREAMHTTPIOSHD")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1004),Integer.valueOf(604),Integer.valueOf(380)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "iOS HD"
		cd.channelDescription = "HTTP Dynamic Streaming HD per Apple devices"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "iOS HD"
		cd2.channelDescription = "HTTP Dynamic Streaming HD for Apple devices"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
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
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1020),Integer.valueOf(660),Integer.valueOf(400),Integer.valueOf(170),Integer.valueOf(75)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(60),Integer.valueOf(60),Integer.valueOf(60),Integer.valueOf(60),Integer.valueOf(60)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512),Integer.valueOf(256),Integer.valueOf(150)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.appName = "ms/"
		this.streamProtocol = "http://"
		this.streamServer = clientId+"-4me.weebo.it/"
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
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for STREAMWEB channel
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_test(clientId: String){
		this.init_gd_test(clientId,"STREAMWEB")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(700),Integer.valueOf(400),Integer.valueOf(150),Integer.valueOf(48)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(32),Integer.valueOf(24),Integer.valueOf(16)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800),Integer.valueOf(500),Integer.valueOf(200),Integer.valueOf(64)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(22050),Integer.valueOf(22050),Integer.valueOf(11025)))
		this.thumbsProperties.init
		this.appName = ""
		this.streamProtocol = "rtmp://"
	}

	/**
	 * default init for WEB channel (Progressive Download)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String){
		this.init_gd_WEB(clientId,"WEB")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(704)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download"
		cd2.channelDescription = "The user can download the content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	
	}

	/**
	 * default init for WEBAUDIO channel (Progressive Download)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBAUDIO(clientId: String){
		this.init_gd_WEB(clientId,"WEBAUDIO")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(0)))
		//this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(128))) x mp3
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(128)))
		//this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(128))) x mp3
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(128)))
		//this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100))) x mp3
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(16000)))
		this.defaultBitRate = 128
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download Audio"
		cd.channelDescription = "Permette all'utente di ascoltare il contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download Audio Only"
		cd2.channelDescription = "The user can download the audio"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = false
		this.convertTo="MP3"
		this.codec="MP3"
		this.withIngestion=true
	
	}

	/**
	 * default init for WEBM channel (Progressive Download, WebM format)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBM(clientId: String){
		this.init_gd_WEB(clientId,"WEBM")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(704)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.codec = "vp8"
		this.convertTo = "WEBM"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download WebM"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto in formato WebM"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download WebM"
		cd2.channelDescription = "The user can download the content in the WebM format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for WEB FULL HD channel (Progressive Download)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBFULLHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBFULLHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4300)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4500)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 4500
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download Full HD"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download Full HD"
		cd2.channelDescription = "The user can download the content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for WEB channel (Progressive Download)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1800)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(2000)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 2000
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download HD"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download HD"
		cd2.channelDescription = "The user can download the content"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for WEBM channel (Progressive Download, WebM format) Full HD
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBMFULLHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBMFULLHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4300)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4500)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 4500
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.compliantWith= "VIEW"
		this.codec = "vp8"
		this.convertTo = "WEBM"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download Webm FULLHD"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto in formato WebM"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download Webm FULLHD"
		cd2.channelDescription = "The user can download the content in WebM format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for WEBM channel (Progressive Download, WebM format)
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBMHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBMHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1800)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(2000)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 2000
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.compliantWith= "VIEW"
		this.codec = "vp8"
		this.convertTo = "WEBM"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download Webm HD"
		cd.channelDescription = "Permette all'utente di scaricare il contenuto in formato WebM"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download Webm HD"
		cd2.channelDescription = "The user can download the content in WebM format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
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
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.defaultBitRate = 1
		this.streamProtocol = ""
		this.appName = ""
		this.streamServer = ""
		this.withIngestion = false
		this.useForDownload = true
		this.convertTo="MP4"
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBIPHONE(clientId: String){
		this.init_gd_WEB(clientId,"WEBIPHONE")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(416)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(512)))
		this.sampleRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.appName = "" 
		this.streamProtocol = "" 
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download per iPhone"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto ottimizzato per iPhone"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download for iPhone"
		cd2.channelDescription = "The user can download a content optimized for iPhone"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBIPHONEHD(clientId: String){
		this.init_gd_WEB(clientId,"WEBIPHONE")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1004)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1200)))
		this.sampleRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.appName = "" 
		this.streamProtocol = "" 
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download HD per iPhone"
		cd.channelDescription = "Permette all'utente di scaricare un contenuto ottimizzato per iPhone"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download HD for iPhone"
		cd2.channelDescription = "The user can download a content optimized for iPhone"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.convertTo="MP4"
		this.withIngestion=true
	}

}
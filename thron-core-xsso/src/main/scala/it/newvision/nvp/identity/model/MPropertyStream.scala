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
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS(client: MClient){
		this.init_gd_WEB(client,"STREAMHTTPIOS")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(680),Integer.valueOf(400)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Streaming HLS"
		cd.channelDescription = "HLS, codec h264, bitrate 800kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Streaming HLS"
		cd2.channelDescription = "HLS, codec h264, bitrate 800kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOSHD(client: MClient){
		this.init_gd_WEB(client,"STREAMHTTPIOSHD")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1800),Integer.valueOf(1400),Integer.valueOf(1020),Integer.valueOf(680),Integer.valueOf(400)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(2000),Integer.valueOf(1600),Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Streaming HLS HD"
		cd.channelDescription = "HLS, codec h264, bitrate 2000kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Streaming HLS HD"
		cd2.channelDescription = "HLS, codec h264, bitrate 2000kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOSFULLHD(client: MClient){
		this.init_gd_WEB(client,"STREAMHTTPIOSFULLHD")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4300),Integer.valueOf(1800),Integer.valueOf(1400),Integer.valueOf(1020),Integer.valueOf(680),Integer.valueOf(400)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4500),Integer.valueOf(2000),Integer.valueOf(1600),Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Streaming HLS FULL HD"
		cd.channelDescription = "HLS, codec h264, bitrate 4500kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Streaming HLS FULL HD"
		cd2.channelDescription = "HLS, codec h264, bitrate 4500kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for STREAM channel
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_STREAMHTTPIOS4K(client: MClient){
		this.init_gd_WEB(client,"STREAMHTTPIOS4K")
		// the total bitrate is used as profile name, becaue there are some profile xml file having all setup defined.
		// to handle multiple profile for the same total bitrate, define a different profile id like 8000 for a profile of 800kb for ipad.
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(25000),Integer.valueOf(4300),Integer.valueOf(1800),Integer.valueOf(1400),Integer.valueOf(1020),Integer.valueOf(680),Integer.valueOf(400)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96),Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(25100),Integer.valueOf(4500),Integer.valueOf(2000),Integer.valueOf(1600),Integer.valueOf(1200),Integer.valueOf(800),Integer.valueOf(512)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100),Integer.valueOf(44100)))
		this.defaultBitRate = 512
		this.convertTo = "TS"
		this.appName = "ios/"
		this.streamProtocol = "http://"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Streaming HLS 4K"
		cd.channelDescription = "HLS, codec h264, bitrate 25000kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Streaming HLS 4K"
		cd2.channelDescription = "HLS, codec h264, bitrate 25000kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.withIngestion=true
	}

	/**
	 * default init for WEB channel (Progressive Download)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(client: MClient){
		this.init_gd_WEB(client,"WEB")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(704)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(800)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 800
		this.streamProtocol = ""
		this.appName = ""
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Mp4"
		cd.channelDescription = "Download, codec h264, bitrate 800kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Mp4"
		cd2.channelDescription = "Download, codec h264, bitrate 800kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	
	}

	/**
	 * default init for WEB channel (Progressive Download)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBHD(client: MClient){
		this.init_gd_WEB(client,"WEBHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1800)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(2000)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 2000
		this.streamProtocol = ""
		this.appName = ""
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Mp4 HD"
		cd.channelDescription = "Download, codec h264, bitrate 2000kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Mp4 HD"
		cd2.channelDescription = "Download, codec h264, bitrate 2000kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for WEB FULL HD channel (Progressive Download)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBFULLHD(client: MClient){
		this.init_gd_WEB(client,"WEBFULLHD")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4300)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(4500)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 4500
		this.streamProtocol = ""
		this.appName = ""
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Mp4 Full HD"
		cd.channelDescription = "Download, codec h264, bitrate 4500kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Mp4 Full HD"
		cd2.channelDescription = "Download, codec h264, bitrate 4500kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for WEB FULL HD channel (Progressive Download)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB4K(client: MClient){
		this.init_gd_WEB(client,"WEB4K")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(25000)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(25100)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.defaultBitRate = 25000
		this.streamProtocol = ""
		this.appName = ""
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Mp4 4K"
		cd.channelDescription = "Download, codec h264, bitrate 25000kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Mp4 4k"
		cd2.channelDescription = "Download, codec h264, bitrate 25000kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
		this.convertTo="MP4"
		this.withIngestion=true
	}

	/**
	 * default init for WEBAUDIO channel (Progressive Download)
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBAUDIO(client: MClient){
		this.init_gd_WEB(client,"WEBAUDIO")
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
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Traccia audio MP3"
		cd.channelDescription = "Download, codec mp3, bitrate 128kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Audio track MP3"
		cd2.channelDescription = "Download, codec mp3, bitrate 128kbps"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = false
		this.convertTo="MP3"
		this.codec="MP3"
		this.withIngestion=true
	
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
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.sampleRates =  new ArrayList[Integer](Arrays.asList(Integer.valueOf(1)))
		this.defaultBitRate = 1
		this.streamProtocol = ""
		this.appName = ""
		this.withIngestion = false
		this.useForDownload = true
		this.convertTo="MP4"
	}

	/**
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBIPHONE(client: MClient){
		this.init_gd_WEB(client,"WEBIPHONE")
		this.videoBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(416)))
		this.audioBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(96)))
		this.totalBitRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(512)))
		this.sampleRates = new ArrayList[Integer](Arrays.asList(Integer.valueOf(44100)))
		this.appName = "" 
		this.streamProtocol = "" 
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Mp4 base profile"
		cd.channelDescription = "Download, codec h264 base profile, bitrate 512kbps"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Mp4 base profile"
		cd2.channelDescription = "Download, codec h264 base profile, bitrate 512kbps"
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

}
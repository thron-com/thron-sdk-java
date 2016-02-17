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
 * Properties for a Generic Document, used to setup the thumbnail ingestion
 */
@XmlRootElement(name="MPropertyGenericDocument") 
@XmlType(name="MPropertyGenericDocument")
//#SWG#@ApiModel(description = """Properties for a Generic Document, used to setup the thumbnail ingestion""")
class MPropertyGenericDocument extends Serializable {

	/**
	 * it's the channel type where the content is published.
	 * the channel type is an identifier used by xadmin and xpublisher and follows
	 * this namingconvention
	 * 
	 * WEB<USERSPACIFIC>
	 * STREAM<USERSPECIFIC>
	 * 
	 * example:
	 * WEB
	 * STREAM
	 * STREAMIPHONE
	 * STREAMSILVERLIGHT
	 * STREAMMOBILE
	 * WEBIPHONE
	 * WEBMP3
	 * WEBFLV
	 */
	//#SWG#@ApiModelProperty(value = """it's the channel type where the content is published.
	//#SWGNL#the channel type is an identifier used by xadmin and xpublisher and follows this namingconvention
	//#SWGNL#
	//#SWGNL#WEB<USERSPACIFIC>
	//#SWGNL#STREAM<USERSPECIFIC>
	//#SWGNL#
	//#SWGNL#example:
	//#SWGNL#WEB
	//#SWGNL#STREAM
	//#SWGNL#STREAMIPHONE
	//#SWGNL#STREAMSILVERLIGHT
	//#SWGNL#STREAMMOBILE
	//#SWGNL#WEBIPHONE
	//#SWGNL#WEBMP3
	//#SWGNL#WEBFLV""" ,required = true)
	@BeanProperty 
	var channelType: String  = "WEB"
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var defaultThumbnailFormat: String  = "L"
	@Deprecated
	def withdefaultThumbnailFormat(p:String):this.type ={ 	this.defaultThumbnailFormat = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var channelDescriptions: List[MChannelDescription] = new ArrayList[MChannelDescription]
	def withchannelDescriptions(p:List[MChannelDescription]):this.type ={ 	this.channelDescriptions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var thumbsProperties: MPropertyThumbnail  = new MPropertyThumbnail
	@Deprecated
	def withthumbsProperties(p:MPropertyThumbnail):this.type ={ 	this.thumbsProperties = p; 	this }

	/**
	 * <ul>
	 * 	<li>true = the publishing process start to generate the thumbnail</li>
	 * 	<li>false = the publishing process do not generate the thumbnails.</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var generateThumbnail: Boolean  = true
	@Deprecated
	def withgenerateThumbnail(p:Boolean):this.type ={ 	this.generateThumbnail = p; 	this }

	/**
	 * the application name:
	 * flash, http
	 */
	//#SWG#@ApiModelProperty(value = """the application name: 
	//#SWGNL#flash, http""" ,required = true)
	@BeanProperty 
	var appName: String  = ""
	def withappName(p:String):this.type ={ 	this.appName = p; 	this }

	/**
	 * notification to the client once the content is ready to be published (packaged
	 * complete)
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	@Deprecated
	var notifyOncePackaged: Boolean  = false
	@Deprecated
	def withnotifyOncePackaged(p:Boolean):this.type ={ 	this.notifyOncePackaged = p; 	this }

	/**
	 * "<clientId>-4me.weebo.it/static/"
	 */
	//#SWG#@ApiModelProperty(value = """"<clientId>-4me.weebo.it/static/"""" ,required = true)
	@BeanProperty 
	var httpServer: String  = "-4me.weebo.it/static/"
	def withhttpServer(p:String):this.type ={ 	this.httpServer = p; 	this }

	/**
	 * "<clientId>-stream.weebo.it/"
	 */
	//#SWG#@ApiModelProperty(value = """"<clientId>-stream.weebo.it/"""" ,required = true)
	@BeanProperty 
	var streamServer: String  = "-stream.weebo.it/"
	def withstreamServer(p:String):this.type ={ 	this.streamServer = p; 	this }

	/**
	 * premiumvodservice/
	 */
	//#SWG#@ApiModelProperty(value = """premiumvodservice/""" ,required = true)
	@BeanProperty 
	var streamAppPremium: String  = ""
	def withstreamAppPremium(p:String):this.type ={ 	this.streamAppPremium = p; 	this }

	/**
	 * available protocols. list of comma separated values.
	 * "http://,https://"
	 */
	//#SWG#@ApiModelProperty(value = """available protocols. list of comma separated values.
	//#SWGNL#"http://,https://"""" ,required = true)
	@BeanProperty 
	var webProtocols: String  = "http://"
	def withwebProtocols(p:String):this.type ={ 	this.webProtocols = p; 	this }

	/**
	 * rtmpe, rtmp, http. Are the different kind of streaming protocols.
	 */
	//#SWG#@ApiModelProperty(value = """rtmpe, rtmp, http. Are the different kind of streaming protocols.""" ,required = true)
	@BeanProperty 
	var streamProtocol: String  = ""
	def withstreamProtocol(p:String):this.type ={ 	this.streamProtocol = p; 	this }

	/**
	 * DEPRECATED
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED""" ,required = true)
	@BeanProperty 
	var compliantWithPLAY: Boolean  = false
	def withcompliantWithPLAY(p:Boolean):this.type ={ 	this.compliantWithPLAY = p; 	this }

	/**
	 * define if the channel is enabled or not. Used to keep the channel settings but
	 * disable the user to publish new contents in the current channel
	 */
	//#SWG#@ApiModelProperty(value = """define if the channel is enabled or not. Used to keep the channel settings but disable the user to publish new contents in the current channel""" ,required = true)
	@BeanProperty 
	var channelEnabled: Boolean  = true
	def withchannelEnabled(p:Boolean):this.type ={ 	this.channelEnabled = p; 	this }

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
	def withcompliantWith(p:String):this.type ={ 	this.compliantWith = p; 	this }

	/**
	 * if true the channle type is used for the downloadadble contes. When the user
	 * linke the content for download the player will use only this specific channel.
	 * ONLY WEB* channels are availables
	 */
	//#SWG#@ApiModelProperty(value = """if true the channle type is used for the downloadadble contes. When the user linke the content for download the player will use only this specific channel. ONLY WEB* channels are availables""" ,required = true)
	@BeanProperty 
	var useForDownload: Boolean  = false
	def withuseForDownload(p:Boolean):this.type ={ 	this.useForDownload = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var withIngestion: Boolean  = false
	def withwithIngestion(p:Boolean):this.type ={ 	this.withIngestion = p; 	this }

	/**
	 * attualmente la conversione avviene solo in JPG con limitazione per i file di
	 * input non superiori a 2048x2048
	 */
	//#SWG#@ApiModelProperty(value = """attualmente la conversione avviene solo in JPG con limitazione per i file di input non superiori a 2048x2048""" ,required = true)
	@BeanProperty 
	var convertTo: String =_
	def withconvertTo(p:String):this.type ={ 	this.convertTo = p; 	this }

	/**
	 * @param clientId : String
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_gd_WEB(clientId: String, 
			channeltype: String){
		this.channelType = channeltype
		//this.thumbsProperties.init
		this.httpServer = clientId + this.httpServer
		this.streamServer = clientId + this.streamServer
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_gd_WEBORIGINAL(clientId: String){
		this.channelType = "WEBORIGINAL"
		//this.thumbsProperties.init
		this.httpServer = clientId + this.httpServer
		this.streamServer = clientId + this.streamServer
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download Contenuto Originale"
		cd.channelDescription = "Permette all'utente di scaricare il file originale"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download Original Content"
		cd2.channelDescription = "The user can download the original source file"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * @param clientId : String
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(clientId: String, 
			channeltype: String){
		this.channelType = channeltype
		this.compliantWith= "VIEW,PLAY"
		//this.thumbsProperties.init
		this.httpServer = clientId + this.httpServer
		this.streamServer = clientId + this.streamServer
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
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBDOC(clientId: String, 
			channeltype: String){
		this.channelType = channeltype
		this.compliantWith= "VIEW"
		//this.thumbsProperties.init
		this.httpServer = clientId + this.httpServer
		this.streamServer = clientId + this.streamServer
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "PDF"
		cd.channelDescription = "Converte il contenuto in PDF"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "PDF"
		cd2.channelDescription = "Convert the content to pdf"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = false
		this.convertTo="PDF"
		this.withIngestion=true
	}

	/**
	 * @param clientId : String
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_gd_test(clientId: String, 
			channeltype: String){
		this.channelType = channeltype
		//this.thumbsProperties.init
		this.httpServer = "localhost:8083/"
		this.streamServer = clientId + this.streamServer
		val cdesc = new MChannelDescription
		cdesc.setChannelDescription(this.channelType)
		cdesc.setChannelShortName(this.channelType)
		cdesc.setLocale("IT")
		this.channelDescriptions = new ArrayList[MChannelDescription](Arrays.asList(cdesc))
	}

}
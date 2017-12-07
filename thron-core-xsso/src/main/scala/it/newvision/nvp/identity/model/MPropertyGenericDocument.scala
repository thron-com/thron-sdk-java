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
	 * WEB<USERSPECIFIC>
	 * STREAM<USERSPECIFIC>
	 * 
	 * example:
	 * WEB
	 * STREAMHTTPIOS
	 * WEBIPHONE
	 */
	//#SWG#@ApiModelProperty(value = """it's the channel type where the content is published.
	//#SWGNL#the channel type is an identifier used by xadmin and xpublisher and follows this namingconvention
	//#SWGNL#
	//#SWGNL#WEB<USERSPECIFIC>
	//#SWGNL#STREAM<USERSPECIFIC>
	//#SWGNL#
	//#SWGNL#example:
	//#SWGNL#WEB
	//#SWGNL#STREAMHTTPIOS
	//#SWGNL#WEBIPHONE""" ,required = true)
	@BeanProperty 
	var channelType: String  = "WEB"
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

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
	 * the application name:
	 * flash, http
	 */
	//#SWG#@ApiModelProperty(value = """the application name: 
	//#SWGNL#flash, http""" ,required = true)
	@BeanProperty 
	var appName: String  = ""
	def withappName(p:String):this.type ={ 	this.appName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var httpServer: String  = ""
	def withhttpServer(p:String):this.type ={ 	this.httpServer = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var streamServer: String  = ""
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
	var webProtocols: String  = "https://"
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
	 * Sets httpServer and streamServer value based on client domain
	 * @param domain : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_servers(domain: String){
		val s = domain match {
			case "4me.it" => "-4me.weebo.it/"
			case "thron.com" => "-cdn.thron.com/"
		}
		this.httpServer = s+"static/"
		this.streamServer = s
	}

	/**
	 * @param client : MClient
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_gd_WEB(client: MClient, 
			channeltype: String){
		this.init_servers(client.domain)
		this.channelType = channeltype
		this.httpServer = client.clientId + this.httpServer
		this.streamServer = client.clientId + this.streamServer
		this.channelDescriptions.clear()
	}

	/**
	 * @param client : MClient
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_gd_WEBORIGINAL(client: MClient){
		this.init_servers(client.domain)
		this.channelType = "WEBORIGINAL"
		this.httpServer = client.clientId + this.httpServer
		this.streamServer = client.clientId + this.streamServer
		this.compliantWith= "VIEW,PLAY"
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download sorgente"
		cd.channelDescription = "Download formato originale"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download source"
		cd2.channelDescription = "Download original format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
	}

	/**
	 * @param client : MClient
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEB(client: MClient, 
			channeltype: String){
		this.init_servers(client.domain)
		this.channelType = channeltype
		this.compliantWith= "VIEW,PLAY"
		//this.thumbsProperties.init
		this.httpServer = client.clientId + this.httpServer
		this.streamServer = client.clientId + this.streamServer
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "Download sorgente"
		cd.channelDescription = "Download, formato originale"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "Download source"
		cd2.channelDescription = "Download, original format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
	
	}

	/**
	 * @param client : MClient
	 * @param channeltype : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_WEBDOC(client: MClient, 
			channeltype: String){
		this.init_servers(client.domain)
		this.channelType = channeltype
		this.compliantWith= "VIEW"
		//this.thumbsProperties.init
		this.httpServer = client.clientId + this.httpServer
		this.streamServer = client.clientId + this.streamServer
		val cd = new MChannelDescription
		cd.locale = "IT"
		cd.channelShortName = "PDF"
		cd.channelDescription = "Download, formato PDF"
		val cd2 = new MChannelDescription
		cd2.locale = "EN"
		cd2.channelShortName = "PDF"
		cd2.channelDescription = "Download, PDF format"
		this.channelDescriptions.add(cd)
		this.channelDescriptions.add(cd2)
		this.useForDownload = true
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
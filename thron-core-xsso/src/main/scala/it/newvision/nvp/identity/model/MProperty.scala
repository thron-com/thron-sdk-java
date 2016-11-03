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
@XmlRootElement(name="MProperty") 
@XmlType(name="MProperty")
//#SWG#@ApiModel(description = """""")
class MProperty extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientName: String =_
	def withclientName(p:String):this.type ={ 	this.clientName = p; 	this }

	/**
	 * the Organization name
	 */
	//#SWG#@ApiModelProperty(value = """the Organization name""" ,required = true)
	@BeanProperty 
	var clientCompanyName: String =_
	def withclientCompanyName(p:String):this.type ={ 	this.clientCompanyName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var silentMode: Boolean  = true
	def withsilentMode(p:Boolean):this.type ={ 	this.silentMode = p; 	this }

	/**
	 * The cilent can have multiple profiles (ingestions) and use it during the
	 * publishing process.
	 * The number and kind of profiles should be defiled contractually.
	 * The 1st profile in the list is the default profile for the clientId.
	 */
	//#SWG#@ApiModelProperty(value = """The cilent can have multiple profiles (ingestions) and use it during the publishing process.
	//#SWGNL#The number and kind of profiles should be defiled contractually.
	//#SWGNL#The 1st profile in the list is the default profile for the clientId.""")
	@BeanProperty 
	var activeProfiles: List[String] = new ArrayList[String](Arrays.asList("STANDARD","HD"))
	def withactiveProfiles(p:List[String]):this.type ={ 	this.activeProfiles = p; 	this }

	/**
	 * available locales code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """available locales code (ISO639-1)""")
	@BeanProperty 
	@Deprecated
	var locales: List[String] = new ArrayList[String](Arrays.asList("IT","EN","DE","FR","ES","PT","NL","RU","KO","JA","AR","ZH"))
	@Deprecated
	def withlocales(p:List[String]):this.type ={ 	this.locales = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defaultLocale: String  = "IT"
	def withdefaultLocale(p:String):this.type ={ 	this.defaultLocale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imageProperties: List[MPropertyImage] = new ArrayList[MPropertyImage]
	def withimageProperties(p:List[MPropertyImage]):this.type ={ 	this.imageProperties = p; 	this }

	/**
	 * the cilent can have one or more PropertiesStream profiles (defined as payed
	 * service), and he can use during the publishing process from the web admin
	 * console.
	 * These properties are used for all publishing video processing.
	 */
	//#SWG#@ApiModelProperty(value = """the cilent can have one or more PropertiesStream profiles (defined as payed service), and he can use during the publishing process from the web admin console.
	//#SWGNL#These properties are used for all publishing video processing.""")
	@BeanProperty 
	var streamProperties: List[MPropertyStream] = new ArrayList[MPropertyStream]
	def withstreamProperties(p:List[MPropertyStream]):this.type ={ 	this.streamProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var audioProperties: List[MPropertyAudio] = new ArrayList[MPropertyAudio]
	def withaudioProperties(p:List[MPropertyAudio]):this.type ={ 	this.audioProperties = p; 	this }

	/**
	 * properties for the generic documents published in CDN
	 */
	//#SWG#@ApiModelProperty(value = """properties for the generic documents published in CDN""")
	@BeanProperty 
	var genericDocumentProperties: List[MPropertyGenericDocument] = new ArrayList[MPropertyGenericDocument]
	def withgenericDocumentProperties(p:List[MPropertyGenericDocument]):this.type ={ 	this.genericDocumentProperties = p; 	this }

	/**
	 * properties for the pagelet documents published in platform
	 */
	//#SWG#@ApiModelProperty(value = """properties for the pagelet documents published in platform""")
	@BeanProperty 
	var pageletProperties: List[MPropertyPagelet] = new ArrayList[MPropertyPagelet]
	def withpageletProperties(p:List[MPropertyPagelet]):this.type ={ 	this.pageletProperties = p; 	this }

	/**
	 * properties for the 4ME Documents published in CDN
	 */
	//#SWG#@ApiModelProperty(value = """properties for the 4ME Documents published in CDN""")
	@BeanProperty 
	var ndocProperties: List[MProperty4MEDocument] = new ArrayList[MProperty4MEDocument]
	def withndocProperties(p:List[MProperty4MEDocument]):this.type ={ 	this.ndocProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var applicationProperties: MPropertyApplication  = new MPropertyApplication
	def withapplicationProperties(p:MPropertyApplication):this.type ={ 	this.applicationProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var emailProperties: MPropertyEmail  = new MPropertyEmail
	def withemailProperties(p:MPropertyEmail):this.type ={ 	this.emailProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var weeboProperties: MPropertyWeebo  = new MPropertyWeebo
	def withweeboProperties(p:MPropertyWeebo):this.type ={ 	this.weeboProperties = p; 	this }

	/**
	 * live events properties
	 */
	//#SWG#@ApiModelProperty(value = """live events properties""")
	@BeanProperty 
	var eventsProperties: List[MPropertyLiveEvent] = {
	val e1 =new MPropertyLiveEvent
	val e2 = new MPropertyLiveEvent
	val e3 = new MPropertyLiveEvent
	
	e1.init_STREAMHTTPFLASH("")
	e2.init_STREAMHTTPIOS("")
	e3.init_STREAMRTMPFORPREVIEW("")
	
	new ArrayList[MPropertyLiveEvent](Arrays.asList(e1,e2,e3))
	
	}
	def witheventsProperties(p:List[MPropertyLiveEvent]):this.type ={ 	this.eventsProperties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var notifyOncePublished: Boolean =_
	def withnotifyOncePublished(p:Boolean):this.type ={ 	this.notifyOncePublished = p; 	this }

	/**
	 * used to enable or disable the comunity services like comments and ratings.
	 */
	//#SWG#@ApiModelProperty(value = """used to enable or disable the comunity services like comments and ratings.""" ,required = true)
	@BeanProperty 
	var comunityServiceEnabled: Boolean  = true
	def withcomunityServiceEnabled(p:Boolean):this.type ={ 	this.comunityServiceEnabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var customPages: MPropertyView  = new MPropertyView
	def withcustomPages(p:MPropertyView):this.type ={ 	this.customPages = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var runningMode: MEMode  = MEMode.LAST
	def withrunningMode(p:MEMode):this.type ={ 	this.runningMode = p; 	this }

	/**
	 * property setting for generated thumbnails
	 */
	//#SWG#@ApiModelProperty(value = """property setting for generated thumbnails""" ,required = true)
	@BeanProperty 
	var thumbsProperties: MThumbsProperties  = new MThumbsProperties()
	def withthumbsProperties(p:MThumbsProperties):this.type ={ 	this.thumbsProperties = p; 	this }

	/**
	 * Identity Manager Properties
	 */
	//#SWG#@ApiModelProperty(value = """Identity Manager Properties""")
	@BeanProperty 
	var imProperties: MPropertyIM =_
	def withimProperties(p:MPropertyIM):this.type ={ 	this.imProperties = p; 	this }

	/**
	 * Preffered currency for billing.
	 * Currency code ISO 4217
	 */
	//#SWG#@ApiModelProperty(value = """Preffered currency for billing.
	//#SWGNL#Currency code ISO 4217""")
	@BeanProperty 
	var currency: String  = "EUR"
	def withcurrency(p:String):this.type ={ 	this.currency = p; 	this }

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(clientId: String){
		//video 
		val v3 = new MPropertyStream
		v3.init_STREAMHTTPIOS(clientId)
	
		val v4 = new MPropertyStream
		v4.init_STREAMHTTPIOSHD(clientId)
	
		val v5 = new MPropertyStream
		v5.init_WEB(clientId)
		v5.useForDownload = true
	
		val v6 = new MPropertyStream
		v6.init_WEBHD(clientId)
		v6.useForDownload = true
	
		val v7 = new MPropertyStream
		v7.init_WEBMHD(clientId)
	
		val v8 = new MPropertyStream
		v8.init_WEBIPHONE(clientId)
	
		val v9 = new MPropertyStream
		v9.init_WEBAUDIO(clientId)
	
		//audio
	
		val a2 = new MPropertyAudio
		a2.init_STREAMHTTPIOS(clientId)
	
		val a3 = new MPropertyAudio
		a3.init_WEB(clientId)
		a3.useForDownload = true
	
	
		//image
		val img1 = new MPropertyImage
		img1.init_WEB(clientId)
		img1.useForDownload = true
	
		val img2 = new MPropertyImage
		img2.init_WEBHD(clientId)
		img2.useForDownload = true
	
		//generic documents
		val gd1 = new MPropertyGenericDocument
		gd1.init_WEB(clientId,"WEB")
		gd1.useForDownload = true
		val gd2 = new MPropertyGenericDocument
		gd2.init_WEBDOC(clientId,"WEBDOC")
		gd2.useForDownload = false
	
		//pagelet documents
		val pl1 = new MPropertyPagelet
		pl1.init_WEB(clientId,"WEB")
		pl1.useForDownload = false
	
		// 4me documents
		val mc1 = new MProperty4MEDocument
		mc1.init_WEB(clientId)
	
		val mc2 = new MProperty4MEDocument
		mc2.init_WEBORIGINAL(clientId)
		mc2.useForDownload = true
	
		this.streamProperties = new ArrayList[MPropertyStream](Arrays.asList(v3,v4,v5,v6,v7,v8,v9))
		this.audioProperties = new ArrayList[MPropertyAudio](Arrays.asList(a2,a3))
		this.imageProperties = new ArrayList[MPropertyImage](Arrays.asList(img2))
		this.genericDocumentProperties = new ArrayList[MPropertyGenericDocument](Arrays.asList(gd1,gd2))
		this.ndocProperties = new ArrayList[MProperty4MEDocument](Arrays.asList(mc1,mc2))
		this.pageletProperties = new ArrayList[MPropertyPagelet](Arrays.asList(pl1))
	
		this.emailProperties.init
		this.weeboProperties.init(clientId)
		this.applicationProperties.init(clientId)
		this.thumbsProperties.init()
	}

	/**
	 * @param clientId : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_test(clientId: String){
		val v1 = new MPropertyStream
		v1.init_test(clientId)
		val a1 = new MPropertyAudio
		a1.init_test(clientId)
		val img1 = new MPropertyImage
		img1.init_test(clientId)
		val pl1 = new MPropertyPagelet
		pl1.init_gd_test(clientId,"WEB")
		val gd1 = new MPropertyGenericDocument
		gd1.init_gd_test(clientId,"WEB")
	
		this.streamProperties = new ArrayList[MPropertyStream](Arrays.asList(v1))
		this.audioProperties = new ArrayList[MPropertyAudio](Arrays.asList(a1))
		this.imageProperties = new ArrayList[MPropertyImage](Arrays.asList(img1))
		this.pageletProperties = new ArrayList[MPropertyPagelet](Arrays.asList(pl1))
		this.genericDocumentProperties = new ArrayList[MPropertyGenericDocument](Arrays.asList(gd1))
	
		this.emailProperties.init
		this.weeboProperties.init(clientId)
		this.applicationProperties.init_test(clientId)
		this.thumbsProperties.init()
	
	}

	/**
	 * @return String
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getAppHostname():String ={
		 var result = ""
		 result = this.applicationProperties.webProtocols.split(",").headOption.getOrElse("http://")
		 result += this.applicationProperties.applicationsServer
		 result
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
	
		StringUtils.isBlank(currency) || {
			try {
				val c = StringUtils.substringBefore(currency,"-")
				Option(java.util.Currency.getInstance(c)).isDefined
			} catch {
				case e: IllegalArgumentException => false
			}
		}
	}

}
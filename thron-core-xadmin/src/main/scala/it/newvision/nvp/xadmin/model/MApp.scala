package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MAppSubscriptionData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * An application can have:
 * <ul>
 * 	<li>a predefined user, used to connect with the platform and invoke the
 * webservices. </li>
 * 	<li>a set of linked categories (used as root folders) where the app is
 * connected. The app can use a subset of the contents published in Platform
 * </li>
 * 	<li>custom metadata and different code snippets. </li>
 * </ul>
 */
@XmlRootElement(name="MApp") 
@XmlType(name="MApp")
//#SWG#@ApiModel(description = """An application can have:
//#SWGNL#<ul>
//#SWGNL#	<li>a predefined user, used to connect with the platform and invoke the webservices. </li>
//#SWGNL#	<li>a set of linked categories (used as root folders) where the app is connected. The app can use a subset of the contents published in Platform </li>
//#SWGNL#	<li>custom metadata and different code snippets. </li>
//#SWGNL#</ul>""")
class MApp extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):MApp ={ 	this.active = p; 	this }

	/**
	 * used to define the application "class":
	 * PLAY,MOVE,CUSTOM...
	 */
	//#SWG#@ApiModelProperty(value = """used to define the application "class":
	//#SWGNL#PLAY,MOVE,CUSTOM...""" ,required = true)
	@BeanProperty 
	var appType: MEAppType =_
	def withappType(p:MEAppType):MApp ={ 	this.appType = p; 	this }

	/**
	 * used to define the subtype"class" (only with CUSTOM appType)
	 */
	//#SWG#@ApiModelProperty(value = """used to define the subtype"class" (only with CUSTOM appType)""")
	@BeanProperty 
	var appSubType: String =_
	def withappSubType(p:String):MApp ={ 	this.appSubType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var cloned: Boolean  = false
	def withcloned(p:Boolean):MApp ={ 	this.cloned = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):MApp ={ 	this.creationDate = p; 	this }

	/**
	 * custom description of the app
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the app""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MApp ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):MApp ={ 	this.displayName = p; 	this }

	/**
	 * the white list of the allowed domain where the app can run.
	 * The domain check is applied on JApp.loginSnippet
	 */
	//#SWG#@ApiModelProperty(value = """the white list of the allowed domain where the app can run.
	//#SWGNL#The domain check is applied on JApp.loginSnippet""")
	@BeanProperty 
	var domainsWhiteList: List[String] = new ArrayList[String]
	def withdomainsWhiteList(p:List[String]):MApp ={ 	this.domainsWhiteList = p; 	this }

	/**
	 * SolutionId (WEBTV1...)
	 * VIEW
	 * PLAY
	 * MOVE
	 * VIEW_PLAYER
	 */
	//#SWG#@ApiModelProperty(value = """SolutionId (WEBTV1...)
	//#SWGNL#VIEW
	//#SWGNL#PLAY
	//#SWGNL#MOVE
	//#SWGNL#VIEW_PLAYER""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MApp ={ 	this.id = p; 	this }

	/**
	 * prettyId for the APP.
	 * Constraint: length <= 50
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the APP. 
	//#SWGNL#Constraint: length <= 50""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):MApp ={ 	this.prettyId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):MApp ={ 	this.lastUpdate = p; 	this }

	/**
	 * custom metadata linked to the snippet
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata linked to the snippet""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):MApp ={ 	this.metadata = p; 	this }

	/**
	 * username of the owner.
	 * The user who created the App instance.
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner.
	//#SWGNL#The user who created the App instance.""" ,required = true)
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):MApp ={ 	this.ownerUsername = p; 	this }

	/**
	 * the root category Id of the App.
	 * Each App should be linked to a category.
	 * The App will use only the contents linked to the specified category tree.
	 */
	//#SWG#@ApiModelProperty(value = """the root category Id of the App.
	//#SWGNL#Each App should be linked to a category.
	//#SWGNL#The App will use only the contents linked to the specified category tree.""")
	@BeanProperty 
	var rootCategoryId: String =_
	def withrootCategoryId(p:String):MApp ={ 	this.rootCategoryId = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):MApp ={ 	this.url = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var urlThumbnail: String =_
	def withurlThumbnail(p:String):MApp ={ 	this.urlThumbnail = p; 	this }

	/**
	 * if true the app can invoke the service JApps.su to impersonate a different
	 * platform user.
	 */
	//#SWG#@ApiModelProperty(value = """if true the app can invoke the service JApps.su to impersonate a different platform user.""")
	@BeanProperty 
	var canDisguise: Boolean  = false
	def withcanDisguise(p:Boolean):MApp ={ 	this.canDisguise = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var disguiseData: MAppDisguiseData =_
	def withdisguiseData(p:MAppDisguiseData):MApp ={ 	this.disguiseData = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var subscriptionData: MAppSubscriptionData =_
	def withsubscriptionData(p:MAppSubscriptionData):MApp ={ 	this.subscriptionData = p; 	this }

	/**
	 * linked system user for the application
	 */
	@BeanProperty
	//#SWG#@ApiModelProperty(value = """linked system user for the application""")
	var credential: MAppUser =_
	  def withcredential(p:MAppUser):MApp ={ 	this.credential = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var snippets: List[MSnippet] = new ArrayList[MSnippet]
	  def withsnippets(p:List[MSnippet]):MApp ={ 	this.snippets = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_MOVE(){
		this.id = "MOVE"
		this.description = "SMS"
		this.appType = MEAppType.MOVE
	
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_PLAY(){
		this.id = "PLAY"
		this.description = "Playbox"
		this.appType = MEAppType.PLAY
	}

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init_COMMENT(){
		this.id = "COMMENT"
		this.description = "Comment"
		this.appType = MEAppType.COMMENT
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isClonable():Boolean ={
		(this.appType == MEAppType.WEBTV).booleanValue()
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(prettyId).forall(s => s.length<=50 && s.matches("""^[\w\-]*$"""))
	}

}
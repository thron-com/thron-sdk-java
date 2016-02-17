package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEAppType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Application summary detail
 */
@XmlRootElement(name="MAppSummary") 
@XmlType(name="MAppSummary")
//#SWG#@ApiModel(description = """Application summary detail""")
class MAppSummary extends Serializable {

	/**
	 * APP id.
	 * Empty if the user has no roles for the App
	 */
	//#SWG#@ApiModelProperty(value = """APP id.
	//#SWGNL#Empty if the user has no roles for the App""")
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * App prettyId.
	 * Empty if the user has no roles for the App
	 */
	//#SWG#@ApiModelProperty(value = """App prettyId.
	//#SWGNL#Empty if the user has no roles for the App""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * used to define the subtype"class" (only with CUSTOM appType)
	 */
	//#SWG#@ApiModelProperty(value = """used to define the subtype"class" (only with CUSTOM appType)""")
	@BeanProperty 
	var appSubType: String =_
	def withappSubType(p:String):this.type ={ 	this.appSubType = p; 	this }

	/**
	 * used to define the application "class":
	 * PLAY,MOVE,CUSTOM...
	 */
	//#SWG#@ApiModelProperty(value = """used to define the application "class":
	//#SWGNL#PLAY,MOVE,CUSTOM...""" ,required = true)
	@BeanProperty 
	var appType: MEAppType =_
	def withappType(p:MEAppType):this.type ={ 	this.appType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * custom description of the app
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the app""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * username of the owner.
	 * The user who created the App instance.
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner.
	//#SWGNL#The user who created the App instance.""" ,required = true)
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):this.type ={ 	this.ownerUsername = p; 	this }

	/**
	 * derived
	 */
	//#SWG#@ApiModelProperty(value = """derived""" ,required = true)
	@BeanProperty 
	var ownerFullName: String =_
	def withownerFullName(p:String):this.type ={ 	this.ownerFullName = p; 	this }

	/**
	 * the root category Id for the App.
	 * The App will use only the contents linked to the specified category tree.
	 * Empty if the user has no roles for the App.
	 */
	//#SWG#@ApiModelProperty(value = """the root category Id for the App.
	//#SWGNL#The App will use only the contents linked to the specified category tree.
	//#SWGNL#Empty if the user has no roles for the App.""")
	@BeanProperty 
	var rootCategoryId: String =_
	def withrootCategoryId(p:String):this.type ={ 	this.rootCategoryId = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var urlThumbnail: String =_
	def withurlThumbnail(p:String):this.type ={ 	this.urlThumbnail = p; 	this }

	/**
	 * If true the app can invoke the service JApps.su to impersonate a different
	 * platform user.
	 * Empty if the user has no roles for the App
	 */
	//#SWG#@ApiModelProperty(value = """If true the app can invoke the service JApps.su to impersonate a different platform user.
	//#SWGNL#Empty if the user has no roles for the App""")
	@BeanProperty 
	var canDisguise: Boolean =_
	def withcanDisguise(p:Boolean):this.type ={ 	this.canDisguise = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippets: List[MSnippetSummary] = new ArrayList[MSnippetSummary]
	def withsnippets(p:List[MSnippetSummary]):this.type ={ 	this.snippets = p; 	this }

}
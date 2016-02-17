package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEAppType
import it.newvision.nvp.xadmin.model.MMetadata
import it.newvision.nvp.xadmin.model.MAppDisguiseData

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppInitData") 
@XmlType(name="MAppInitData")
//#SWG#@ApiModel(description = """""")
class MAppInitData extends Serializable {

	/**
	 * prettyId for the APP
	 */
	//#SWG#@ApiModelProperty(value = """prettyId for the APP""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var appType: MEAppType =_
	def withappType(p:MEAppType):this.type ={ 	this.appType = p; 	this }

	/**
	 * used to define the subtype"class" (only with CUSTOM appType)
	 */
	//#SWG#@ApiModelProperty(value = """used to define the subtype"class" (only with CUSTOM appType)""")
	@BeanProperty 
	var appSubType: String =_
	def withappSubType(p:String):this.type ={ 	this.appSubType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var urlThumbnail: String =_
	def withurlThumbnail(p:String):this.type ={ 	this.urlThumbnail = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

	/**
	 * custom description of the app
	 */
	//#SWG#@ApiModelProperty(value = """custom description of the app""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * custom metadata of the app
	 */
	//#SWG#@ApiModelProperty(value = """custom metadata of the app""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * main url of the app
	 */
	//#SWG#@ApiModelProperty(value = """main url of the app""")
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	/**
	 * username of the owner.
	 * The default value is the user who invoke the service "create".
	 */
	//#SWG#@ApiModelProperty(value = """username of the owner.
	//#SWGNL#The default value is the user who invoke the service "create".""")
	@BeanProperty 
	var ownerUsername: String =_
	def withownerUsername(p:String):this.type ={ 	this.ownerUsername = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var canDisguise: Boolean  = false
	def withcanDisguise(p:Boolean):this.type ={ 	this.canDisguise = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var disguiseData: MAppDisguiseData =_
	def withdisguiseData(p:MAppDisguiseData):this.type ={ 	this.disguiseData = p; 	this }

	{
		if (Option(this.disguiseData).isEmpty) {
		  this.setDisguiseData(new MAppDisguiseData)
		  this.disguiseData.usersWhiteList.add("*")
		}
	}

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(appType).isDefined &&
		Option(prettyId).forall(s => s.length<=50 && s.matches("""^[\w\-]*$"""))
	}

}